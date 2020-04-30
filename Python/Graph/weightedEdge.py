#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Apr 29 15:17:59 2020

@author: klrao
"""

from __future__ import annotations
from dataclasses import dataclass
from Edge import edge

@dataclass
class weightedEdge(edge):
    
    
    weight:float # weight
    
    def reversed(self) -> weightedEdge:
        return weightedEdge(self.v,self.u,self.weight)
    
    def __lt__(self,other:weightedEdge)-> bool:
        return self.weight < other.weight 
    
    def __str__(self) -> str:
        return f"{self.u} {self.weight} ->{self.v}"