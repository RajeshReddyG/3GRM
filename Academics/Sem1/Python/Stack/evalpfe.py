#Evaluating a Postfix Expression
stack=[]
postfix=input("Enter the postfix expression")
op=['+','-','*','/','%']
for x in postfix:
    if x in op:
        exp=stack.pop()+x+stack.pop()
        stack.append(str(eval(exp)))

    else:
        y=input("Enter the value of {}".format(x))
        stack.append(y)
print("Result of the expression:",stack.pop())



     
