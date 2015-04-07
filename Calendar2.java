/*import java.util.*;

public class Calendar2
{
  public static void main (String[]args)
  {
    
    //create arraylist year
    ArrayList<ArrayList<ArrayList<ArrayList<ArrayList>Integer>>>>> calendar = new ArrayList<ArrayList<ArrayList<ArrayList<ArrayList>Integer>>>>>(); //a year is an arraylist of an 
                                                                                                           //arraylist(months) of an arraylist(days) of an arraylist(times
                                                                                                           //helped by Amanda Nakanishi and stack overflow
    
    Scanner kb = new Scanner(System.in);
    System.out.println("What would you like to do?  Input or View?");
    String action = new String(kb.nextLine().toLowerCase());      //toLowerCase resovles i/I and v/V (helped by Amanda)
    
    if (action.equals("input"))
    {
      //run input
      
      InputCalendar myinput = new InputCalendar(calendar);
      calendar = myinput.setUp();
      System.out.println(myinput);
    }
    
    if (action.equals("view"))
    {
      //run view
    }
  }
}*/