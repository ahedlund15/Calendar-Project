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
    
    tDay = (year - startYear) * yearDays;
    
    return weekNames[0];    //0 just a placeholder rn
  }
  
  public boolean leapYear() //determines whether a year is a leap year
  {                          //important bc 365 vs. 366 days
    boolean leap = false;
    int year = Integer.parseInt(myDate.substring(6,10));
    if (year % 4 == 0)
    {
      if (year % 100 == 0)
      {
        if (year % 400 == 0)
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
    int numbDays = 0;
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
    return numbDays;
  }
}