import math 

# Description:
# Method heapify is a simple heapify call that takes an array with size and 
# node to start heapify as input and returns a heapified array on that node.
def heapify(queue, n, i): 
    
    try:
        smallest = i         # Initialize smallest as root 
        left     = 2*i+1     # left = 2*i + 1 
        right    = 2*i+2     # right = 2*i + 2 
        
        #print('==========================================')
        #print('Step 1 -- i--> '+str(i),'left--> '+str(left),'right--> '+str(right),'smallest-->'+str(smallest))
        
        # left child exist and is smaller than root 
        if left < n and int(queue[i][-2:]) > int(queue[left][-2:]): 
            smallest = left 
        else:
            smallest = i
            
     
        #print('Step 2 -- i--> '+str(i),'left--> '+str(left),'right--> '+str(right),'smallest-->'+str(smallest))

        # right child exist and is smaller than root
        if right < n and int(queue[smallest][-2:]) > int(queue[right][-2:]): 
            smallest = right 
        
        #print('Step 3 -- i--> '+str(i),'left--> '+str(left),'right--> '+str(right),'smallest-->'+str(smallest))
        
        # Swap root if needed
        if smallest != i: 
            queue[i],queue[smallest] = queue[smallest],queue[i]
            #print('Before Heapify recursive call--> ', queue)
           
            # Heapify the root. 
            heapify(queue, n, smallest) 
        #print('End of a heapify--> ',queue)      

    except Exception as e:
        toFile = "Exception occured while processing BuildHeapNQueue.heapify. "+str(e)+"\n"
        toFile = toFile+"Review your input files."
        writeToFile("outputPS5.txt","a",toFile)                         
        return None

# Description:
# Method build_heap generates a heap out of an array using heapify calls
def build_heap(queue):
    try:
        # start from the last non-leaf node
        startNode = math.floor(len(queue)/2)-1
        while startNode >=0:
            heapify(queue,len(queue),startNode)
            startNode = startNode -1
        return queue
    except Exception as e:
        toFile = "Exception occured while processing BuildHeapNQueue.build_heap. "+str(e)+"\n"
        toFile = toFile+"Review your input files."
        writeToFile("outputPS5.txt","a",toFile)                         
        return None     

# Description:
# Method generate_priority_queue generates a maxPriority Queue from a heap
def generate_priority_queue(queue):
    try:
        #print('step 1--> ',queue)
        # start from the end of the queue to generate priority queue
        startNode= len(queue)
        while startNode > 1:
            queue[startNode-1],queue[0]= queue[0],queue[startNode-1]
            startNode= startNode-1 
            
            #print("generate_priority_queue : startNode is -->",startNode)
            #print("generate_priority_queue: Before heapify queue-->>> ",queue)
            
            heapify(queue,startNode,0)  
            #print("generate_priority_queue: After heapify queue-->>> ",queue)
        return queue
    except Exception as e:
        toFile = "Exception occured while processing BuildHeapNQueue.generate_priority_queue. "+str(e)+"\n"
        toFile = toFile+"Review your input files."
        writeToFile("outputPS5.txt","a",toFile)                         
        fileOut.close() 
        return None

# Description:
# Method writeToFile is a generic method for writing to file.
def writeToFile(fileName=None,mode=None,toFile=None):
    try:
        #print('\nto file. -1>>> \n'+toFile+'\n')
        fileOut = open(fileName,mode)
        fileOut.writelines(toFile)
        fileOut.close()
    except Exception as e:
        fileOut = open("outputPS5.txt","a")                         
        fileOut.writelines("Exception occured while processing BuildHeapNQueue.writeToFile. "+str(e)+"\n")
        fileOut.close()
    finally:
        if fileOut is not None:
            fileOut.close()