#a program to find the factorial of a number.
# recursion
def fact(x):
    if(x==1):
        return(1)
    else:
        return(x*fact(x-1))

n=int(input('Enter n:'))
print(fact(n))
