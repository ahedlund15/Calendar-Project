import java.util.*;
import java.util.Scanner;

public class Calendar
{
  public static void main (String[]args)
  {
    Scanner kb = new Scanner(System.in);
    System.out.println("What would you like to do?  Input or View?");
    String action = new String(kb.nextLine().toLowerCase());
    
    if (action.equals("input"))
    {
      System.out.println("You would like to input an event for what date?  mm/dd/yyyy?");
      String inputDate = new String(kb.nextLine());
      
      
      
      //create event
    }
    
    /*if (action.contains("iew"))
    {
      System.out.println("You would like to view events for what date?  mm/dd/yyyy?");
      String inputDate = in.next();
      
      
      //view events
    }
    */
  }
  
  //months
  
  /*public static int getDay()
  {
    Scanner day = new Scanner(System.in);
    String inputday = new String(day.nextLine());
    int dd = Integer.parseInt(inputday.substring(0,2));
    return dd;
  }
 
  public static int getMonth()
  {
    Scanner month = new Scanner(System.in);
    String inputmonth = new String(month.nextLine());
    int mm = Integer.parseInt(inputmonth.substring(3,5));
    return mm;
  }
  
  public static int getYear()
  {
    Scanner year = new Scanner(System.in);
    String inputyear = new String(year.nextLine());
    int yyyy = Integer.parseInt(inputyear.substring(6,10));
    return yyyy;
  }
   
  */
  
  //event creator
  
  //event viewer
  
}