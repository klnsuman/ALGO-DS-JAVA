#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Apr 28 17:22:30 2020

@author: klrao
"""
from typing import TypeVar, Generic , List, Optional
from Edge import edge

V = TypeVar('V')

class Graph(Generic[V]):

    def __init__(self,vertex:List[V]) -> None:    
        self._vertices = vertex
        self._edges : List[List[edge]]= [ []  for _ in vertex]
        
    def vertex_count(self) -> int:
        return len(self._vertices)
    
    def edge_count(self) -> int:
        return sum(map(len,self._edges))
    
    def add_edge(self,e) -> None:
        self._edges[e.u].append(e)
        self._edges[e.v].append(e.reversed())   
   
        
        
    def add_edge_by_indices(self, i:int,  j:int) -> None:
        e : edge = edge(i,j)
        self.add_edge(e)
        
    def add_edge_by_vertices(self,fromVertex,toVertex)->None:
        u : int = self._vertices.index(fromVertex)
        v : int = self._vertices.index(toVertex)
        self.add_edge_by_indices(u,v) 
    
    
    def neighbour_by_index(self,idx:int)-> List[V]:
        
        return  self._edges[idx]
    
    def neighbour(self,vertex:V):
        
        u:int = self._vertices.index(vertex)
        return self.neighbour_by_index(u)
        
    def vertex_at(self,u:int):
        return self._vertices[u]
    
   
    
    def neighbours_for_index(self,idx:int):
        
        return list(map(self.vertex_at,[e.v for e in self._edges[idx]]))
    
    def __str__(self) -> str:
        path : str = ""
        
        for i in range(self.vertex_count()):
            
            path += f"{self.vertex_at(i)} -> {self.neighbours_for_index(i)}\n"
            
        return path
                     
if __name__ == "__main__":


    city_graph:Graph[str] = Graph(["Seattle", "San Francisco", "Los Angeles", "Riverside", "Phoenix", "Chicago", 
                                   "Boston", "New York", "Atlanta", "Miami", "Dallas", "Houston", "Detroit", 
                                   "Philadelphia", "Washington"])   
    print("Vertices -> ",city_graph.vertex_count())
    
    city_graph.add_edge_by_vertices("Seattle", "Chicago")
    city_graph.add_edge_by_vertices("Seattle", "San Francisco")
    city_graph.add_edge_by_vertices("San Francisco", "Riverside")
    city_graph.add_edge_by_vertices("San Francisco", "Los Angeles")
    city_graph.add_edge_by_vertices("Los Angeles", "Riverside")
    city_graph.add_edge_by_vertices("Los Angeles", "Phoenix")
    city_graph.add_edge_by_vertices("Riverside", "Phoenix")
    city_graph.add_edge_by_vertices("Riverside", "Chicago")
    city_graph.add_edge_by_vertices("Phoenix", "Dallas")
    city_graph.add_edge_by_vertices("Phoenix", "Houston")
    city_graph.add_edge_by_vertices("Dallas", "Chicago")
    city_graph.add_edge_by_vertices("Dallas", "Atlanta")
    city_graph.add_edge_by_vertices("Dallas", "Houston")
    city_graph.add_edge_by_vertices("Houston", "Atlanta")
    city_graph.add_edge_by_vertices("Houston", "Miami")
    city_graph.add_edge_by_vertices("Atlanta", "Chicago")
    city_graph.add_edge_by_vertices("Atlanta", "Washington")
    city_graph.add_edge_by_vertices("Atlanta", "Miami")
    city_graph.add_edge_by_vertices("Miami", "Washington")
    city_graph.add_edge_by_vertices("Chicago", "Detroit")
    city_graph.add_edge_by_vertices("Detroit", "Boston")
    city_graph.add_edge_by_vertices("Detroit", "Washington")
    city_graph.add_edge_by_vertices("Detroit", "New York")
    city_graph.add_edge_by_vertices("Boston", "New York")
    city_graph.add_edge_by_vertices("New York", "Philadelphia")
    city_graph.add_edge_by_vertices("Philadelphia", "Washington")
    
    print(city_graph.edge_count())
    
    print(city_graph)