Marks <- read.csv(file = 'C:/Users/rock/Desktop/Assignments/Big Data-R/marks.csv')
Marks
Marks$Total=rowSums(cbind(Marks$Mid1,Marks$Mid2))
Marks
Marks$Average=Marks$Total/2
Marks