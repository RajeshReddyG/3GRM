#finding the factorial of a number using recursion
def fact(n):
    if((n==0)or(n==1)):
        return(1)
    else:
        f=n*fact(n-1)
        return(f)

num=int(input("Enter the number:"))
print("Factorial=",fact(num))

    
        