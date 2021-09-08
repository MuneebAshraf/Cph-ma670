void setup() {
  MethodOne(); 
  MethodTwo(); 
}

/*
  The following method has an error in it. Fix the error and run it. 
*/

void MethodOne()
{
  int i = 1000; // You are not allowed to change this line. 
  String output = "";
  int max = 10;
  
  if (i > max)
  {
    output = "i is greater than "+max+".";   
  }
  
  println(output);
   
}

/* 
  Finish the following method so that we can change the number assigned 
  to the weekday and it prints the correct output.  
*/
void MethodTwo() 
{
  int weekDay = 0; // 0 = Monday, 6 = Sunday. 
  String weekDayName = "Monday";
  boolean weekend = false;
  String isItWeekend = "It is not weekend";
  
  if (weekDay < 5)
  {
    weekend = false;
    
  }
  else 
  {
    weekend = true;
    isItWeekend = "it is weekend!";
  }
  
  // Print the name of the weekday here: 
  switch(weekDay) {
    case 0:weekDayName = "Monday";break;
    case 1:weekDayName = "Tuesday";break;
    case 2:weekDayName = "Wednesday";break;
    case 3:weekDayName = "Thursday";break;
    case 4:weekDayName = "Friday";break;
    case 5:weekDayName = "Saturday";break;
    case 6:weekDayName = "Sunday";break;
  }
  println("today is "+weekDayName);
    
  // Print if it is weekend here:
   println(isItWeekend);
}
