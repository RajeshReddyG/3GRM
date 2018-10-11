
unsigned int TESTLED = 13;

unsigned int N_RED = 22;
unsigned int N_ORANGE = 24;
unsigned int N_GREEN = 26;

unsigned int E_RED = 28;
unsigned int E_ORANGE = 30;
unsigned int E_GREEN = 31;

unsigned int S_RED = 32;
unsigned int S_ORANGE = 33;
unsigned int S_GREEN = 34;

unsigned int W_RED = 35;
unsigned int W_ORANGE = 36;
unsigned int W_GREEN = 37;

volatile unsigned int N_sensor = 50;
volatile unsigned int S_sensor = 51;
volatile unsigned int E_sensor = 52;
volatile unsigned int W_sensor = 53;

unsigned int Traffic_density;

void setup() {
  unsigned int i;
  pinMode(TESTLED,OUTPUT);
  digitalWrite(TESTLED,LOW);

  pinMode(N_sensor,INPUT);
  pinMode(S_sensor,INPUT);
  pinMode(E_sensor,INPUT);
  pinMode(W_sensor,INPUT);
  
  pinMode(N_RED,OUTPUT);
  pinMode(N_ORANGE,OUTPUT);
  pinMode(N_GREEN,OUTPUT);
  
  pinMode(E_RED,OUTPUT);
  pinMode(E_ORANGE,OUTPUT);
  pinMode(E_GREEN,OUTPUT);

  pinMode(S_RED,OUTPUT);
  pinMode(S_ORANGE,OUTPUT);
  pinMode(S_GREEN,OUTPUT);

  pinMode(W_RED,OUTPUT);
  pinMode(W_ORANGE,OUTPUT);
  pinMode(W_GREEN,OUTPUT);


  for(i=0;i<3;i++)
  {
    digitalWrite(N_RED,HIGH);
    digitalWrite(N_ORANGE,HIGH);
    digitalWrite(N_GREEN,HIGH);
  
    digitalWrite(E_RED,HIGH);
    digitalWrite(E_ORANGE,HIGH);
    digitalWrite(E_GREEN,HIGH);

    digitalWrite(S_RED,HIGH);
    digitalWrite(S_ORANGE,HIGH);
    digitalWrite(S_GREEN,HIGH);

    digitalWrite(W_RED,HIGH);
    digitalWrite(W_ORANGE,HIGH);
    digitalWrite(W_GREEN,HIGH);

    delay(500);
    
    digitalWrite(N_RED,LOW);
    digitalWrite(N_ORANGE,LOW);
    digitalWrite(N_GREEN,LOW);
  
    digitalWrite(E_RED,LOW);
    digitalWrite(E_ORANGE,LOW);
    digitalWrite(E_GREEN,LOW);

    digitalWrite(S_RED,LOW);
    digitalWrite(S_ORANGE,LOW);
    digitalWrite(S_GREEN,LOW);

    digitalWrite(W_RED,LOW);
    digitalWrite(W_ORANGE,LOW);
    digitalWrite(W_GREEN,LOW);

    delay(500);
  }   

    digitalWrite(N_RED,HIGH);
    digitalWrite(E_RED,HIGH);
    digitalWrite(S_RED,HIGH);
    digitalWrite(W_RED,HIGH);
    delay(3000);

    Serial.begin(9600);
    Serial.println("Density based Traffic Light Control System Init");   
}

void loop() {

  //Traffic light sequence starts
  delay(1500);
  digitalWrite(N_RED,LOW);
  delay(1000);
  digitalWrite(N_ORANGE,HIGH);
  delay(2000);
  digitalWrite(N_ORANGE,LOW);
  digitalWrite(N_GREEN,HIGH);
  density_dly();
  //delay(7000);
  digitalWrite(N_GREEN,LOW);
  digitalWrite(N_RED,HIGH);
//--------------------------------------------------------------------------
  
  delay(1500);
  digitalWrite(E_RED,LOW);
  delay(1000);
  digitalWrite(E_ORANGE,HIGH);
  delay(2000);
  digitalWrite(E_ORANGE,LOW);
  digitalWrite(E_GREEN,HIGH);
  density_dly();
  //delay(7000);
  digitalWrite(E_GREEN,LOW);
  digitalWrite(E_RED,HIGH);
//--------------------------------------------------------------------------
  
  delay(1500);
  digitalWrite(S_RED,LOW);
  delay(1000);
  digitalWrite(S_ORANGE,HIGH);
  delay(2000);
  digitalWrite(S_ORANGE,LOW);
  digitalWrite(S_GREEN,HIGH);
  density_dly();
  //delay(7000);
  digitalWrite(S_GREEN,LOW);
  digitalWrite(S_RED,HIGH);

//--------------------------------------------------------------------------

  delay(1500);
  digitalWrite(W_RED,LOW);
  delay(1000);
  digitalWrite(W_ORANGE,HIGH);
  delay(2000);
  digitalWrite(W_ORANGE,LOW);
  digitalWrite(W_GREEN,HIGH);
  density_dly();
  digitalWrite(W_GREEN,LOW);
  digitalWrite(W_RED,HIGH);

  Send2Cloud(); 
}

void density_dly(void)
{
  
  if((digitalRead(N_sensor) == 0) && (digitalRead(S_sensor) == 0) && (digitalRead(E_sensor) == 0) && (digitalRead(W_sensor) == 0))
  {
    //Serial.println("All sensed");
    delay(3000);
    Traffic_density = 100;
  }  
  else if((digitalRead(N_sensor) == 0) || (digitalRead(S_sensor) == 0) || (digitalRead(E_sensor) == 0) || (digitalRead(W_sensor) == 0))
  {
    //Serial.println("Single sensed");
    delay(5000);
    Traffic_density = 70;
  }
  else
  {
    delay(9000);
    Traffic_density = 30;
  }
  
}


void Send2Cloud()
{
    Serial.println("AT");
    delay(1000);

    Serial.println("AT+CPIN?");
    delay(1000);

    Serial.println("AT+CREG?");
    delay(1000);

    Serial.println("AT+CGATT?");
    delay(1000);

    Serial.println("AT+CIPSHUT");
    delay(1000);

    Serial.println("AT+CIPSTATUS");
    delay(2000);

    Serial.println("AT+CIPMUX=0");
    delay(2000);
                  
    Serial.println("AT+CSTT=\"airtelgprs.com\"");
    delay(1000);
      
    Serial.println("AT+CIICR");
    delay(3000);
      
    Serial.println("AT+CIFSR");
    delay(2000);
      
    Serial.println("AT+CIPSPRT=0");
    delay(3000);
   
    Serial.println("AT+CIPSTART=\"TCP\",\"api.thingspeak.com\",\"80\"");
    delay(6000);
 
    Serial.println("AT+CIPSEND");
    delay(4000);
            
    String str="GET https://api.thingspeak.com/update?api_key=6B7LONLGUZLBKEQ6&field1="+String(Traffic_density);
    Serial.println(str);
    delay(4000);
      
    Serial.println((char)26);//end commn.
    delay(5000); 
    Serial.println();
 
    Serial.println("AT+CIPSHUT");
    delay(100);
    
} 

