#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Apr 28 08:11:26 2020

@author: klrao
"""

from __future__ import annotations
from dataclasses import dataclass

@dataclass

class edge:
    
    u : int   # From Vertex
    v : int   # From Vertex
    
    def reversed(self) -> edge:
        return edge(self.v,self.u)
    
    def __str__(self):
        return f"{self.u} -> {self.v}"
    
    
    