#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sat Oct 12 20:55:24 2019

@author: klrao

Heap Sort
"""

from PriorityQueue import PriorityQueue
from exceptions import Empty

class HeapSort(PriorityQueue):
    def __init__(self):
        self._array = []
    
    def _parent(self,j):
        return (j-1)//2
    
    def _left(self,j):
        return 2*j + 1
    
    def _right(self,j):
        return 2*j + 2
    
    def _hasleft(self,j):
        return self._left(j) < len(self._array)    
    
    def _hasright(self,j):
        return self._right(j) < len(self._array)
    
   
        
    def __len__(self):
        return len(self._array)
        
    def add(self,key,value):
        self._array.append(self._Item(key,value))
        self._upheap(len(self._array)-1)
        
    def _swap(self,i,j):
        
        self._array[i], self._array[j] = self._array[j], self._array[i]
        
    def _upheap(self,j):
        
        parent = self._parent(j)
        if(j>0 and self._array[j]<self._array[parent]):
            self._swap(j,parent)
            self._upheap(parent)
            
    def getMin(self):
        
        if self.isEmpty():
            raise Empty('The Array is Empty ')
        item = self._array[0]     
        return (item._key,item._value)
    
    
    def _downheap(self,j):
        
        if self._hasleft(j):
           left = self._left(j)
           small = left
           
           if(self._hasright(j)):
               right = self._right(j)
               if(self._array[right] < self._array[left]):
                   small = right
                   
           if(self._array[small] < self._array[j]):
               
               print("j",j,small) 
               self._swap(j,small) 
               self._downheap(small)
        
    def extractMin(self):
        
        if(len(self._array) == 0):
            return Empty('The Array is Empty')
        
        ans = self.getMin()
        last = self._array[len(self._array)-1]
        
        self._array[0] = last
        self._downheap(0)
        return (ans)
    
    def print(self):
        for i in range(len(self._array)):
            item = self._array[i]  
            print(item._key,item._value)    
def main():
    hs =  HeapSort()
    hs.add(10,1)
    hs.add(5,2)
    hs.add(0,3)
    hs.add(25,4)
    hs.add(7,5)
    hs.add(15,6)
       
    hs.print()     
    print("=======")  
    print("Min",hs.getMin())
    print("=======")
    hs.print()    
    print("=======")  
    print("ExtractMin",hs.extractMin())
    print("=======")
    
if __name__ == '__main__':
    main()
                
