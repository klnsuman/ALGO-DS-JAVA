#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sat Sep 28 07:11:02 2019
Graph Utils:
        1. Adjacency Matrix Implementations

@author: klrao
"""

adjMatrix = [[-1]*6 for x in range(6)]
print(adjMatrix)


#print(adjMatrix.type)


print("=======Print Data Array =====")

for i in range(6):
    for j in range(6):
        print(i,j,adjMatrix[i][j])
        

class Graph():
    def __init__(self,numvertex):
        self.numvertex = numvertex
        self.adjacentMatrix = [[-1]*numvertex for x in range(numvertex)]
        self.vertex = {}
        self.vertexList = [0]*numvertex
        
    def set_edge(self,frm,to,cost):
        
        frm = self.vertex[frm]
        to = self.vertex[to]
        self.adjacentMatrix[frm][to] = cost
        self.adjacentMatrix[to][frm] = cost
        
        
        
    def set_vertex(self,vtx,id):
        self.vertex[id] = vtx
        self.vertexList[vtx] = id
        
    def get_edge(self):
        edge = []
        for i in range(self.numvertex):
            for j in range(self.numvertex):
                if self.adjacentMatrix[i][j]!=-1:
                    edge.append((self.vertexList[i],self.vertexList[j],self.adjacentMatrix[i][j]))
        return edge
    
    def get_vertex(self):
        return self.vertexList
    
def main():
    g = Graph(6)
    g.set_vertex(0,'a')
    g.set_vertex(1,'b')
    g.set_vertex(2,'c')
    g.set_vertex(3,'d')
    g.set_vertex(4,'e')
    g.set_vertex(5,'f')
    g.set_edge('a','e',10)
    g.set_edge('a','c',20)
    g.set_edge('c','b',30)
    g.set_edge('b','e',40)
    g.set_edge('e','d',50)
    g.set_edge('f','e',60)
    print("Vertices")
    print(g.get_vertex())
    
    print("Edges")
    print(g.get_edge())

if __name__ == '__main__':
    main()    
        
