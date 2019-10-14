#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Oct 13 11:38:23 2019

@author: klrao
"""

from exceptions import Empty

class PriorityQueue:
    class _Item:
        
        def __init__(self,k,v):
            self._key = k
            self._value = v
            
        def __lt__(self,other):
            return self._key < other._key
        
        def __repr__(self):
            print('repr')
            return '({0},{1})'.format(self._key, self._value)
        
    def add(self,key,value):
        
        return NotImplementedError("Must be Implemented by subclass")
    
    def isEmpty(self):
        
        return len(self)==0
    
    
    def __len__(self):
        return NotImplementedError("Must be Implemented by subclass")
    
    def min(self):
        return NotImplementedError("Must be Implemented by subclass")
    
    def remove_min(self):
        return NotImplementedError("Must be Implemented by subclass")
    
    
    