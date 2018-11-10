#finding the nth fibonacci number using recursion
def fib(n):
    if(n==1):#base condition/stopping condition
        return(0)
    elif(n==2):
        return(1)
    else:
        f=fib(n-1)+fib(n-2)
        return(f)

num=int(input("Enter the number:"))
print(num,"th Fibonacci number=",fib(num))


    
        
