import java.util.*;

public class MyDay
  //notes:
  //create an array list of arrays each array is a year with 365 or 366 elements each of which is a day
{
  private String myDate;
  private ArrayList<MyDay> daysAndDays;
  private ArrayList<MyEvent> myEvents;
  
  public MyDay(String date, ArrayList<MyEvent> events)   //the date in the form dd/mm/yyyy
  {
    myDate = date;           //will use parseint to get date as ints
    myEvents = events;
  }
  
  public String getName()    //use this to get day of the week
  {
    String[] weekNames =
    {
      "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
      "Saturday", "Sunday"
    };
    //int yearDays = 0;
    //int tDay = 0;
    /*int day = Integer.parseInt(myDate.substring(3,5));
    int month = Integer.parseInt(myDate.substring(0,2));
    int year = Integer.parseInt(myDate.substring(6,10));
    */
    /*if (leapYear() == true)
    {
      yearDays = 366;
    }
    else yearDays = 365;*/
    
    //tDay = ((year - startYear) * yearDays) + monthDays() + day;
    
    int name = (tDay() % 7) - 1;  //7 days per week
    if (name == -1) name = 6; //because array starts at 0
    
    return weekNames[name];    
  }
  
  public boolean leapYear() //determines whether a year is a leap year
  {                          //important bc 365 vs. 366 days
    boolean leap = false;
    int year = Integer.parseInt(myDate.substring(6,10));
    if (year % 4 == 0)  //leap years are divisible by 4
    {
      if (year % 100 == 0) //but if it's also divisible by 100 it's not
      {
        if (year % 400 == 0) //unless it's also divisible by 400
        {
          leap = true;
        }
        else leap = false;
      }
      else leap = true;
    }
    else leap = false;
    return leap;
  }
  
  public int tDay()
  {
    int day = Integer.parseInt(myDate.substring(3,5));
    int month = Integer.parseInt(myDate.substring(0,2));
    int year = Integer.parseInt(myDate.substring(6,10));
    int startYear = 2001; //because 2001 starts on monday jan 1
    int yearDays = 365;
    
    int theDay = ((year - startYear) * yearDays) + monthDays() + day;
    
    
    
    return theDay;
  }
  
  public int saveLeapYear() //figures out how many years before had leap years and gets the number so it can be added to the total days from 1/1/2001 onward
  {
    int save = 0;
    int year = Integer.parseInt(myDate.substring(6,10));
    for (int i = 2001; i < year; i++) //gets the # of leap years from 2001 to the specified year
    {
      boolean leap = false;
      if (i % 4 == 0)  //leap years are divisible by 4
      {
        if (i % 100 == 0) //but if it's also divisible by 100 it's not
        {
          if (i % 400 == 0) //unless it's also divisible by 400
          {
            leap = true;
          }
          else leap = false;
        }
        else leap = true;
      }
      else leap = false;
      if (leap == true) save++;
    }
    return save;
  }
  
  public int monthDays()
  {
    int fullMonth = 0;
    int totalDays = 0;
    int month = Integer.parseInt(myDate.substring(0,2));
    int preMonths = month - 1;  //number of months before this specific month
    if (preMonths == 0) month = 0;
    else if (preMonths > 0)
    {
      if (preMonths == 1) totalDays = 31; //january
      if (preMonths == 2) totalDays = 59; //february + january
      if (preMonths == 3) totalDays = 90; //j + f + m
      if (preMonths == 4) totalDays = 120; //etc.
      if (preMonths == 5) totalDays = 151;
      if (preMonths == 6) totalDays = 181;
      if (preMonths == 7) totalDays = 212;
      if (preMonths == 8) totalDays = 243;
      if (preMonths == 9) totalDays = 273;
      if (preMonths == 10) totalDays = 304;
      if (preMonths == 11) totalDays = 334;
    }
    if (leapYear() == true) totalDays++; //because leap years have 366 vs. normal 365
    return totalDays + saveLeapYear();  //adds in the additional leap years from previous years
  }
  
  public String getDate()
  {
    return myDate;
  }
  
  public ArrayList<MyEvent> getEventList()
  {
    return myEvents;
  }
  
  /*public void addDay()
  {
    daysAndDays.add(this.MyDay);
  }*/
  
}