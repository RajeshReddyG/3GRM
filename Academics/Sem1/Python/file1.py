x=open("hello.txt","r")
y=open("hello1.txt","w")
for line in x:
    print(line)
    y.write(line)
x.close()
y.close()



