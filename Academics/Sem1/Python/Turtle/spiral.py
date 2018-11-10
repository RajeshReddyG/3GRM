from turtle import *

def spiral(n,angle,step):
    for step in range(n):
        forward(step)
        left(angle)

##spiral(140,61,10)
spiral(50,50,10)
