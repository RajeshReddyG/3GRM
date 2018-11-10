# biggest of three numbers
def big(a,b,c):
    if(a>b&a>c):
        return(a)
    elif(b>a&b>c):
        return(b)
    else:
        return(c)    
a=int(input('Enter a:'))
b=int(input('Enter b:'))
c=int(input('Enter c:'))
biggest=big(a,b,c)
print('Biggest='+str(biggest))

