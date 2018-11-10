#Queue as a list
#Queue operations
import sys
n=int(input("Enter the size of the queue:"))
q=[]
while(True):
    print("Queue Operations\n1.Insert\n2.Delete\n3.Display\n4.Exit")
    ch=int(input("Enter your choice:"))
    if(ch==1):
        if(len(q)==n):
            print("Queue Full")
            sys.exit()
        else:
            x=int(input("Enter the element to insert:"))
            q.append(x)
    elif(ch==2):
        if(len(q)==0):
            print("Queue Empty")
            sys.exit()
        else:
            x=q.pop(0)
            print(x," deleted")
    elif(ch==3):
        if(len(q)==0):
            print("No elements to display")
        else:
            print("Queue Contents:")
            for i in q:
                print(i)
    elif(ch==4):
        sys.exit()

        
                
           
