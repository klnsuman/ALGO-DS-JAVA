#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Mon Oct  7 18:05:34 2019

@author: klrao
Queue Implemengtation
"""
import sys 

class ArrayQueue:

   DEFAULT_CAPACITY = 10
   
   def __init__(self):
       self._data = [None]*ArrayQueue.DEFAULT_CAPACITY
       self._size = 0
       self._front = 0
       
   def __len__(self):
       return len(self._data)
   
    
   def isEmpty(self):
       return self._size == 0
   
   def enqueue(self,e):
       if(self._size == len(self._data)):
           self.resize(2*self._size)

       avail = (self._front + self._size)%len(self._data)

       self._data[avail] = e
       self._size += 1
       
       
   def dequeue(self):
       if(self.isEmpty()):
          raise Exception("Queue is Empty")
          
       answer = self._data[self._front]   
       self._front = (self._front+1)%len(self._data)
    
       self._size -= 1
       return answer
   
   def first(self):
       return self._data[self._front]
   
   
   def resize(self,cap):
       old = self._data
       
       self._data = [None]*cap
       walk = self._front
       
       for k in range(self._size):
           self._data[k] = old[walk]
           walk = (walk + 1)%len(old)
       self._front = 0    
   def printQueue(self): 
       walk = self._front
       while (walk<self._size):
           print(self._data[walk])
           walk += 1
def main():
    Q = ArrayQueue() 
    Q.enqueue(1)
    Q.enqueue(2)
    Q.dequeue()
    Q.dequeue()
   
    for i in range(30):
        Q.enqueue(i)
        
    Q.printQueue()

if __name__ == '__main__':
    main()       
