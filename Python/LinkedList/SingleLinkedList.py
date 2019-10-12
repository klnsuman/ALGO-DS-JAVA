#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sat Oct 12 07:21:29 2019

@author: klrao

 Single Linked List
"""

class LinkedList:
    
    class _Node:
        def __init__(self,e,next=None):
            self._e = e
            self._next = None
            
            
    def __init__(self):
        self._head = self._tail = self._Node(None)
        
        self._size = 0
        
    def __len__(self):
        length = 0
        node = self._head.next

        while node:
            length += 1
            node = node._next
        return length
    
    
    def add(self,e):
        tmp = self._Node(e)
        if(self._head is None):
            
            self._head._next = tmp
            self._tail = tmp
            
        else:
            
            self._tail._next = tmp
            self._tail = tmp
            
        self._size += 1 
            
        
    def find(self,e):
        node = self._head._next
        
        while node:
            if(e == node._e):
                
                return True
            node = node._next
        return False    
    
    def print(self):
        node = self._head._next
        
        while node:
            
            print(node._e)
            node = node._next
            
    def addFirst(self,e):
        
        node = self._Node(e)
        
        tmp = self._head._next
        
        self._head._next = node
        node._next = tmp
        
def main():
        ll =  LinkedList()
        ll.add(10)
        ll.add(15)
        ll.add(20)
        ll.add(25)
        ll.print()
        
        x = 100
        
        if(ll.find(x)):
            print(x,"Exists")
        else:
            print(x,"Not Exists")
            
        ll.addFirst(5) 
        print("-------------")
        ll.print()
       
if __name__ == '__main__':
    main()
                
        
        
            
            
