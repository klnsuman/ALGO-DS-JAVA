from BuildHeapNQueue import *
from MaintainPatientList import MaintainPatientList

# Description:
# This is the Main procedure that has to be called and it takes care
# of rest of the tasks of loading patient data from files and generate
# priority queue out of it.
patientList = MaintainPatientList()
patientList.load_initial_patient_data()
patientList.load_new_patient_data()
