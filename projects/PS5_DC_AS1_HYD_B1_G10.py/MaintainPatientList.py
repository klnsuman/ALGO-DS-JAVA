from BuildHeapNQueue import *
from PatientRecord import PatientRecord

# Description:
# class MaintainPatientList holds the relevant methods to maintain the
# patient list as a double linked list

class MaintainPatientList(object):

    # __init__ Initializes the patient list
    def __init__(self, head=None, tail=None, recCount= None):
        self.head     = head
        self.tail     = head
        self.recCount = 0
        self.sequence = 10000
        self.empList  = []
        
    # Description:
    # Method insert_patient_record inserts a patient record
    # at the start of the doubly linked list   
    def insert_patient_record(self,name=None,age=None,pid=None):
        if self.head is None:
            newRecord     = PatientRecord(age, name, pid)
            self.head     = newRecord
            self.tail     = newRecord
            self.recCount = self.recCount +1
        else:
            newRecord     = PatientRecord(age, name, pid)
            newRecord.set_next(self.head)
            self.head.set_prev(newRecord)
            self.head     = newRecord
            self.recCount = self.recCount +1

    # Description:
    # Method get_patient_details searches the linked list for the record
    # corresponding to the passed on patientId and returns his name and age 
    def get_patient_details(self,patientId):
        pointRec  = self.head  
        if pointRec is None:
            return "List Empty",""
        
        while pointRec is not None:
            if str(pointRec.get_patId()) == str(patientId):
                break
            pointRec = pointRec.get_next()
        if pointRec is None:
            return "Record Not Found.",""
        return pointRec.get_name(),pointRec.get_age()

    # Description:
    # Method delete_patient_record searches the linked list for the record
    # corresponding to the passed on patientId and deletes the list record.            
    def delete_patient_record(self,patientId= None):
        pointRec  = self.head
        
        while pointRec is not None:
            if str(pointRec.get_patId()) == str(patientId):
                break
            pointRec = pointRec.get_next()
        
        if pointRec.get_prev() is None:
            if pointRec.get_next() is None:
                self.head = None
                self.tail = None
                self.recCount = self.recCount-1
                return
            else:
                self.head = self.head.get_next()
                self.head.set_prev(None)
                self.recCount = self.recCount-1
                return
        else:   
            if pointRec.get_next() is None:
                (pointRec.get_prev()).set_next(None)
                self.tail = pointRec
                self.recCount = self.recCount-1
                return
            else:
                (pointRec.get_prev()).set_next(pointRec.get_next())
                (pointRec.get_next()).set_prev(pointRec.get_prev())
                self.recCount = self.recCount-1
                return    
                       
    # Description:
    # Method get_current_sequence returns next number in sequence 
    def get_current_sequence(self):
        self.sequence = self.sequence +1 
        return self.sequence

    # Description:
    # Method registerPatient registers a new incoming patient
    # And adds the record to the linked list. 
    def registerPatient(self,name,age):
        patientId = str(self.get_current_sequence())+(str(age).zfill(2))
        self.insert_patient_record(name,age,patientId)
        return patientId        
    
    # Description:
    # Method enqueuePatient adds patient record to priority queue 
    # and refreshes the maxPriorityQueue
    def enqueuePatient(self,patientId):
        self.empList.append(patientId)
        self.empList = build_heap(self.empList)
        #print('After build_heap: -->', empList)
        #print('*****************************************************')
        self.empList= generate_priority_queue(self.empList)
        #print('After generate_priority_queue -->', self.empList)
        
    # Description:
    # Method nextPatient returns next patient in the queue
    # along with his details
    def nextPatient(self):
        toFile = 'No more patients in queue\n'
        if len(self.empList) > 0:
            patientId = self.empList[0]
            name,age = self.get_patient_details(patientId)
            toFile ='----------------------- Next patient ----------------------\n'
            toFile = toFile+'Next patient for consultation is: '
            toFile = toFile+patientId+', '+name
            toFile = toFile+'\n-----------------------------------------------------------\n'
            self._dequeuePatient(patientId)
        
        writeToFile("outputPS5.txt","a",toFile) 

    # Description:
    # Method _dequeuePatient removes patient from the queue
    # as well removes the patient record from the list 
    def _dequeuePatient(self, patientId):
        self.empList.remove(patientId)
        self.delete_patient_record(patientId)
                  
    # Description:
    # Method load_initial_patient_data loads information of patients from 
    # the file inputPS5a.txt and generates a priority queue out of it.
    # This is the list of patients that arrived before the consultation starts.
    def load_initial_patient_data(self):
        toFile=''
        with open('inputPS5a.txt') as file:
            for line in file:
                if len(line.strip()) != 0:
                    try:
                        empRec = line.rstrip().split(',')
                        if len(empRec) < 2:
                            toFile = toFile+"----------------------- Invalid Data ---------------------\n "
                            toFile = toFile+"Incomplete data. <<"+line.strip()+">> Skipping record\n "
                            toFile = toFile+"-----------------------------------------------------------\n"
                            continue
                        name   = empRec[0].strip()
                        age    = empRec[1].strip()
                        if len(age) < 1:
                            toFile = toFile+"----------------------- Invalid Data ---------------------\n "
                            toFile = toFile+"Incomplete data. <<"+line.strip()+">> Skipping record\n "
                            toFile = toFile+"-----------------------------------------------------------\n"
                            continue                
                        if  int(age) > 99:
                            age = 99
                        elif int(age) < 1:
                            age = 1                
                        patientId = self.registerPatient(name,age)
                        self.empList.append(patientId)
                    except Exception as e:
                        toFile = toFile+"Exception occured while processing load_initial_patient_data.newPatient. "+str(e)+"\n"
                        toFile = toFile+"Review your input files.Data at the time of exception is "+line+"\n"
        
        self.empList = build_heap(self.empList)
        #print('After build_heap: -->', self.empList)
        #print('*****************************************************')
        self.empList= generate_priority_queue(self.empList)
        #print('After generate_priority_queue -->', self.empList)


        toFile = toFile+"----------------------- Initial queue ---------------------\nNo of patients added: "
        toFile = toFile+str(self.recCount)+' \n'
        toFile = toFile+"Refreshed Queue:\n"
        for patientId in self.empList:
            name,age = self.get_patient_details(patientId)
            toFile = toFile+patientId+", "+name+"\n"
        toFile = toFile+"-----------------------------------------------------------\n"
        
        writeToFile("outputPS5.txt","w",toFile)        


    # Description:
    # Method load_new_patient_data loads information maintained in the file inputPS5b.txt ,
    # Identified as new patient registration using string "newPatient:"
    #       In this case the patient is added to the list and priority queue and the queue is re-prioritized.
    # Identified as called for consultation using String "nextPatient"
    #       In this case the patient is removed from the queue and list - the maxpriorityqueue is refreshed 
    def load_new_patient_data(self):
        with open('inputPS5b.txt') as file:
            for line in file:
                if line is not None and line.strip().lower() == 'nextPatient'.lower():
                    try:
                        self.nextPatient()
                    except Exception as e:
                        toFile = "Exception occured while processing load_new_patient_data.nextPatient."+str(e)+"\n"
                        toFile = toFile+"Review your input files.Data at the time of exception is "+line
                        writeToFile("outputPS5.txt","a",toFile) 

                elif line is not None and line.strip().lower().startswith('newPatient:'.lower()) and ',' in line:
                    try:
                        patientId = 0
                        empRec = line.rstrip().split(',')
                        tagRec = empRec[0].split(':')
                        tag    = tagRec[0].strip()
                        name   = tagRec[1].strip()

                        #if len(empRec[1].strip()) <2  and :
                        #    toFile = "--------------------- Message to user ---------------------\n"
                        #    toFile = toFile+"Invalid string <<"+line.strip()+'>> in the inputfile. Skipping record.\n'
                        #    toFile = toFile+"-----------------------------------------------------------\n"
                        #    fileOut.writelines(toFile)

                        age    = empRec[1].strip()
                        
                        if  int(age) > 99:
                            age = 99
                        elif int(age) < 1:
                            age = 1
                            
                        if tag == 'newPatient':
                            patientId = self.registerPatient(name,age)
                            self.enqueuePatient(patientId)

                            toFile = "------------------- New Patient Entered -------------------\n"
                            toFile = toFile+"Patient Details: "+name+', '+age+', '+patientId+' \n'
                            toFile = toFile+"Patients waiting on the queue: "+str(self.recCount)+" \n"
                            toFile = toFile+"Refreshed Queue:\n"
                            for patientId in self.empList:
                                name,age = self.get_patient_details(patientId)
                                toFile = toFile+patientId+", "+name+"\n"
                            toFile = toFile+"-----------------------------------------------------------\n"
                            
                            writeToFile("outputPS5.txt","a",toFile) 

                    except Exception as e:
                        toFile = "Exception occured while processing load_new_patient_data.newPatient. "+str(e)+"\n"
                        toFile = toFile+"Review your input files.Data at the time of exception is "+line
                        writeToFile("outputPS5.txt","a",toFile) 
                        
                else:
                    if len(line.strip()) ==0:
                        None
                    else:
                        toFile = "--------------------- Message to user ---------------------\n"
                        toFile = toFile+"Invalid string <<"+line.strip()+'>> in the inputfile. Skipping record.\n'
                        toFile = toFile+"-----------------------------------------------------------\n"
                        writeToFile("outputPS5.txt","a",toFile) 


    # Description:
    # Method insert_after_patient_record is to insert a new record at start of the list                    
    def insert_after_patient_record(self,name=None,age=None,pid=None,afterPid= None):
        keyRec    = None
        pointRec  = self.head
        newRecord = PatientRecord(age, name, pid)
        
        while pointRec is not None:
            #print("pointRec.get_patId()= ",pointRec.get_patId()+' and afterPid= ',afterPid)
            if str(pointRec.get_patId()) == str(afterPid):
                keyRec = pointRec
            pointRec = pointRec.get_next()
    
        print(' and keyRec.get_patId()= ',keyRec.get_patId())

        if keyRec is None:
            print("No matching record to insert after. Returning...")
        else:
            # Insertion logic
            newRecord.set_next(keyRec.get_next())
            newRecord.set_prev((keyRec.get_next()).get_prev())
            (keyRec.get_next()).set_prev(newRecord)
            keyRec.set_next(newRecord)

    # Description:
    # Method delete_patient_record_start is to delete a new record at start of the list                        
    def delete_patient_record_start(self,name=None,age=None,pid=None):
        if self.head is None:
            print('List is empty')
        else:
            print('Prev. Rec. Count',self.recCount)
            print("Popped : Patient Id --> ",self.head.get_patId())
        
            if self.head.get_next() is None:
                self.head     = None
                self.tail     = None
                self.recCount = 0
            else:
                delNode       = self.head
                self.head     = self.head.get_next()   
                self.head.set_prev(None)
                delNode.set_next(None)
                delNode.set_prev(None)
                self.recCount = self.recCount -1 
            
            print('New Rec. Count',self.recCount)