 #include <SoftwareSerial.h>

SoftwareSerial mySerial(9, 10);
int vib_pin=7;
int led_pin=13;
static const int RXPin = 4, TXPin = 3;
static const uint32_t GPSBaud = 9600;
SoftwareSerial ss(RXPin, TXPin);

void setup()
{
  pinMode(vib_pin,INPUT);
  pinMode(led_pin,OUTPUT);
  mySerial.begin(9600);   // Setting the baud rate of GSM Module  
  Serial.begin(9600);    // Setting the baud rate of Serial Monitor (Arduino)
  ss.begin(GPSBaud);
  delay(100);
}


void loop()
{
  int val;
  val=digitalRead(vib_pin);
  if(val==1)
  {
    digitalWrite(led_pin,HIGH);
    SendMessage();
    delay(1000);
    digitalWrite(led_pin,LOW);
    delay(1000);
   }
   else
    digitalWrite(led_pin,LOW);

   if (Serial.available()>0)
   Serial.write(Serial.read());
  /*if (Serial.available()>0)
   switch(Serial.read())
    {
      case 's':
        SendMessage();
        break;
      case 'r':
        RecieveMessage();
        break;
    }

 if (mySerial.available()>0)
   Serial.write(mySerial.read());*/
}


void SendMessage()
{
  getGps();
  mySerial.println("AT+CMGF=1");    //Sets the GSM Module in Text Mode
  delay(1000);  // Delay of 1000 milli seconds or 1 second
  mySerial.println("AT+CMGS=\"+918978213974\"\r"); // Replace x with mobile number
  delay(1000);
  mySerial.println("Your Vehicle Numbered AP05 AB1245 is met with an Accident @ 13.630652, 78.478438");// The SMS text you want to send
  delay(100);
   mySerial.println((char)26);// ASCII code of CTRL+Z
  delay(1000);
}

void getGps()
{
  while (ss.available() > 0)
  {
    Serial.write(ss.read());
  }
}

 void RecieveMessage()
{
  mySerial.println("AT+CNMI=2,2,0,0,0"); // AT Command to receive a live SMS
  delay(1000);
 }
 
