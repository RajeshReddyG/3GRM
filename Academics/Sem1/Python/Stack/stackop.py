#Stack as a list
#stack operations
import sys
n=int(input("Enter the size of the stack:"))
stack=[]
while(True):
    print("Stack Operations\n1.Push\n2.Pop\n3.Display\n4.Exit")
    ch=int(input("Enter your choice:"))
    if(ch==1):
        if(len(stack)==n):
            print("Stack Full")
            sys.exit()
        else:
            x=int(input("Enter the element to insert:"))
            stack.append(x)
    elif(ch==2):
        if(len(stack)==0):
            print("Stack Empty")
            sys.exit()
        else:
            x=stack.pop()
            print(x," deleted")
    elif(ch==3):
        if(len(stack)==0):
            print("No elements to display")
        else:
            print("Stack Contents:")
            for i in stack:
                print(i)
    elif(ch==4):
        sys.exit()

        
                
           
