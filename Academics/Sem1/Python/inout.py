# a program to copy the contents of one file into other
infile=open("hello.txt","r")
outfile=open("hellonew.txt","w")
for text in infile:
    outfile.write(text)
infile.close()
outfile.close()
