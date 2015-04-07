public class MyDay
{
  private String myDate;
  public MyDay(String date)   //the date in the form dd/mm/yyyy
  {
    myDate = date;           //will use parseint to get date as ints
  }
  
  public String getName()    //use this to get day of the week
  {
    String[] weekNames =
    {
      "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
      "Saturday", "Sunday"
    };
    int startYear = 2001; //because 2001 starts on monday jan 1
    int yearDays = 0;
    int tDay = 0;
    int day = Integer.parseInt(myDate.substring(0,2));
    int month = Integer.parseInt(myDate.substring(3,5));
    int year = Integer.parseInt(myDate.substring(6,10));
    
    if (leapYear() == true)
    {
      yearDays = 366;
    }
    else yearDays = 365;
    
    tDay = ((year - startYear) * yearDays) + monthDays() + day;
    
    return weekNames[0];    //0 just a placeholder rn
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
  
  public int monthDays()
  {
    int fullMonth = 0;
    int totalDays = 0;
    int month = Integer.parseInt(myDate.substring(3,5));
    int preMonths = month - 1;
    if (preMonths == 0) month = 0;
    else if (preMonths > 0)
    {
      if (preMonths == 1) totalDays = 31;
      if (preMonths == 2) totalDays = 59;
      if (preMonths == 3) totalDays = 90;
      if (preMonths == 4) totalDays = 120;
      if (preMonths == 5) totalDays = 151;
      if (preMonths == 6) totalDays = 181;
      if (preMonths == 7) totalDays = 212;
      if (preMonths == 8) totalDays = 243;
      if (preMonths == 9) totalDays = 273;
      if (preMonths == 10) totalDays = 304;
      if (preMonths == 11) totalDays = 334;
    }
    if (leapYear() == true) totalDays++;
    return totalDays;
    /*int numbDays = 0;
    int myMonthDays = 0;
    int month = Integer.parseInt(myDate.substring(3,5));
    if ((month == 1) ||
        (month == 3) ||
        (month == 5) ||
        (month == 7) ||
        (month == 8) ||
        (month == 10) ||
        (month == 12))
    {
      numbDays = 31;
    }
    else if ((month == 4) ||
             (month == 6) ||
             (month == 9) ||
             (month == 11))
    {
      numbDays = 30;
    }
    else if (month == 2)
    {
      if (leapYear() == true)
      {
        numbDays = 29;
      }
      else numbDays = 28;
    }
    myMonthDays = 
    return myMonthDays;*/
  }
}