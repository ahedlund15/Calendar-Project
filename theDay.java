public class theDay
{
  private String myDate;
  public theDay(String date)   //the date in the form dd/mm/yyyy
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
    int day = 0;
    return weekNames[0];    //0 just a placeholder rn
  }
}