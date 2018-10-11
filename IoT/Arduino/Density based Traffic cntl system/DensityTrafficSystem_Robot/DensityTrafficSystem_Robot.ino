int MotorLp = 2;
int MotorLn = 3;
int MotorRp = 4;
int MotorRn = 5;
int MotorLcntrl = 6;
int MotorRcntrl = 7;


void setup() {  
  pinMode(MotorLp, OUTPUT);
  pinMode(MotorLn, OUTPUT);      
  pinMode(MotorRp, OUTPUT);
  pinMode(MotorRn, OUTPUT); 
  pinMode(MotorLcntrl, OUTPUT); 
  pinMode(MotorRcntrl, OUTPUT); 
    
  Serial.begin(9600);  
  Serial.println("Vehicle in motion...."); 
}



void loop() {

  digitalWrite(MotorLcntrl, HIGH); 
  digitalWrite(MotorRcntrl, HIGH); 
  //Motor start
  digitalWrite(MotorLp, LOW);
  digitalWrite(MotorLn, HIGH);
  digitalWrite(MotorRp, LOW);
  digitalWrite(MotorRn, HIGH); 
  //Motor ends    
 delay(140); //ON time 
 digitalWrite(MotorLcntrl, LOW); 
 digitalWrite(MotorRcntrl, LOW);
 delay(3000); //OFF time
}


