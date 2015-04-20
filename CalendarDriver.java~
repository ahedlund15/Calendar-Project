import java.util.*;

public class CalendarDriver
{
  public static void main(String[]args)
  {
    ArrayList<MyDay> tsf = new ArrayList<MyDay>();
    ArrayList<MyEvent> events = new ArrayList<MyEvent>();
    Scanner kb = new Scanner(System.in);
    System.out.println("Please enter your date mm/dd/yyyy");
    String date = new String(kb.nextLine());
    //MyDay today = new MyDay(date, event);
    System.out.println("What would you like to do?  Input or View?");
    String action = new String(kb.nextLine().toLowerCase());      //toLowerCase resovles i/I and v/V (helped by Amanda)
    
    if (action.equals("input"))
    {
      System.out.println("What is the name of your event?");
      String eventName = new String(kb.nextLine());
      System.out.println("What time does your event start at?  hh:mm");
      String startEvent = new String(kb.nextLine());
      System.out.println("What time does your event end at?  hh:mm");
      String endEvent = new String(kb.nextLine());
      System.out.println("What are the details of your event?");
      String details = new String(kb.nextLine());
      MyDay today = new MyDay(date, events);
      MyEvent newEvent = new MyEvent(eventName, startEvent, endEvent, details);
      //addDay();
      //addEvent();
      System.out.println("Awesome! A new event has been inputted!");
    }
    
    /*else if (action.equals("view"))
    {
      if there's a day that has the same date show the events
      if there isn't a day that matches that date say there isn't and ask if they want to add events
    }*/
    
    //System.out.println(today.leapYear());
    //System.out.println(today.monthDays());
    //System.out.println(today.tDay());
    //System.out.println(today.getName());
  }
}