#Class Rectangle;Finding the area of rectangle;
#using constructor
class Rectangle:
    
    def __init__(self,x,y):
        self.l=x
        self.w=y
    def area(self):
        return(self.l*self.w)

#create object
r=Rectangle(10,10)
s=Rectangle(10,20)
print(r.area())
print(s.area())
