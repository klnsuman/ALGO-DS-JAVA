#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Apr 29 16:35:05 2020

@author: klrao
"""
from __future__ import annotations
from typing import TypeVar,Generic,Optional,List,Tuple
from weightedEdge import weightedEdge

from Graph import Graph

V = TypeVar('V')

class WeightedGraph(Generic[V],Graph[V]):
    
    def __init__( self , vertices:List[V] ):
        self._vertices:List[V] = vertices
        self._edges:List[List[weightedEdge]] = [[] for _ in vertices]
        
    def add_edge_by_indices(self,fromVertex,toVertex,weight):
        weightE : weightedEdge = weightedEdge(fromVertex,toVertex,weight)
        self.add_edge(weightE)
        
    def add_edge_by_vertices(self,source,dest,weight):

        fromVertex:int = self._vertices.index(source)        
        toVertex:int = self._vertices.index(dest) 
        self.add_edge_by_indices(fromVertex,toVertex,weight)
        
    def neighbors_for_index_with_weights(self,index:int):
        dist_tuple : List[Tuple[V,float]] = []
        for edge in self.neighbour_by_index(index):
            dist_tuple.append((self.vertex_at(edge.v), edge.weight))
        return dist_tuple
    
    def __str__(self) -> str:
        desc: str = ""
        for i in range(self.vertex_count()):
            desc += f"{self.vertex_at(i)} -> {self.neighbors_for_index_with_weights(i)}\n"
        return desc
if __name__ == "__main__":
    city_graph2: WeightedGraph[str] = WeightedGraph(["Seattle", "San Francisco", "Los Angeles", "Riverside", "Phoenix", "Chicago", "Boston", "New York", "Atlanta", "Miami", "Dallas", "Houston", "Detroit", "Philadelphia", "Washington"])

    city_graph2.add_edge_by_vertices("Seattle", "Chicago", 1737)
    city_graph2.add_edge_by_vertices("Seattle", "San Francisco", 678)
    city_graph2.add_edge_by_vertices("San Francisco", "Riverside", 386)
    city_graph2.add_edge_by_vertices("San Francisco", "Los Angeles", 348)
    city_graph2.add_edge_by_vertices("Los Angeles", "Riverside", 50)
    city_graph2.add_edge_by_vertices("Los Angeles", "Phoenix", 357)
    city_graph2.add_edge_by_vertices("Riverside", "Phoenix", 307)
    city_graph2.add_edge_by_vertices("Riverside", "Chicago", 1704)
    city_graph2.add_edge_by_vertices("Phoenix", "Dallas", 887)
    city_graph2.add_edge_by_vertices("Phoenix", "Houston", 1015)
    city_graph2.add_edge_by_vertices("Dallas", "Chicago", 805)
    city_graph2.add_edge_by_vertices("Dallas", "Atlanta", 721)
    city_graph2.add_edge_by_vertices("Dallas", "Houston", 225)
    city_graph2.add_edge_by_vertices("Houston", "Atlanta", 702)
    city_graph2.add_edge_by_vertices("Houston", "Miami", 968)
    city_graph2.add_edge_by_vertices("Atlanta", "Chicago", 588)
    city_graph2.add_edge_by_vertices("Atlanta", "Washington", 543)
    city_graph2.add_edge_by_vertices("Atlanta", "Miami", 604)
    city_graph2.add_edge_by_vertices("Miami", "Washington", 923)
    city_graph2.add_edge_by_vertices("Chicago", "Detroit", 238)
    city_graph2.add_edge_by_vertices("Detroit", "Boston", 613)
    city_graph2.add_edge_by_vertices("Detroit", "Washington", 396)
    city_graph2.add_edge_by_vertices("Detroit", "New York", 482)
    city_graph2.add_edge_by_vertices("Boston", "New York", 190)
    city_graph2.add_edge_by_vertices("New York", "Philadelphia", 81)
    city_graph2.add_edge_by_vertices("Philadelphia", "Washington", 123)

    print(city_graph2)