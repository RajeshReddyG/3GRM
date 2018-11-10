import turtle 

num_sides = int(input("How many sides:"))
side_length=int(input("length of side:"))
angle = 360.0 / num_sides 
polygon = turtle.Turtle()
for i in range(num_sides):
    polygon.forward(side_length)
    polygon.left(angle)
    
turtle.done()
