#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Oct 15 18:17:58 2019

@author: klrao
"""

'''
Strings are Immutable
list is mutable

'''
class revString:
  
    
    ##-----------------------
    # Method 1 : 
    ##-----------------------
    def rev_iter(self,s1,lo,hi):
        
        left , right = lo , hi
        strings = s1
        while left < right:
            strings[left] , strings[right] = strings[right] , strings[left]
            
            left , right = left+1 , right-1
            
        
        print("Reversed String Methiod 1==>",''.join(s1))
        print("s1",s1)
        
        chars = ""
        for c in s1:
            chars = chars + c
        print(chars)
        
    ##-----------------------
    # Method 2 : 
    ##-----------------------    
    def rev_iter2(self,s,lo,hi):
        print("Reversed String Methiod 2",''.join(s[::-1]))
    
  
    def rev_recursive(self,s,lo,hi):
        if(lo<hi):
            s[lo],s[hi] = s[hi],s[lo]
            
            self.rev_recursive(s,lo+1,hi-1)
    
def main():
    
    r = revString()
    
    s = list('Suman')
    r.rev_iter(s,0,len(s)-1)
    
    
    s = list('Suman')
    r.rev_iter2(s,0,len(s)-1)
    
    
    s = list('Suman')
    r.rev_recursive(s,0,len(s)-1)
    print("Reversed String Methiod 3",s)
    
    chars = ""
    for c in s:
        chars = chars + c
    print(chars)
        
if __name__ == '__main__':
    main()
    