#Working with files:Text files
#reading text from a file
x=open("hello.txt","r")#open file in read mode
for text in x:
    print(text)
x.close()
