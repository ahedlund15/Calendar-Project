import java.util.*;

public class CalendarDriver
{
  public static void main(String[]args)
  {
    
    ArrayList<MyDay> tsf = new ArrayList<MyDay>();  //an arraylist of all the days that are inputted
    ArrayList<MyEvent> events = new ArrayList<MyEvent>(); //an arraylist of all the events that are inputted
    String date = "";  //so that it wouldn't be reinitialized each time it went through the loop
    String action = "";
    Scanner kb = new Scanner(System.in);
    boolean keepGoing = true;
    while (keepGoing == true) //need a way to input multiple events/view multiple dates so i looped it it'll end when keepGoing == false
    {
      System.out.println("Please enter your date mm/dd/yyyy");
      date = new String(kb.nextLine());
      //MyDay today = new MyDay(date, event);
      System.out.println("What would you like to do?  Input or View?");
      action = new String(kb.nextLine().toLowerCase());      //toLowerCase resovles i/I and v/V (helped by Amanda)
      
      if (action.equals("input"))
      {
        System.out.println("What is the name of your event?");
        String eventName = new String(kb.nextLine());
        System.out.println("What time does your event start at?  Military Time hh:mm");
        String startEvent = new String(kb.nextLine());
        System.out.println("What time does your event end at?  Military Time hh:mm");
        String endEvent = new String(kb.nextLine());
        System.out.println("What are the details of your event?");
        String details = new String(kb.nextLine());
        MyDay today = new MyDay(date, events);  //creates a new day
        MyEvent newEvent = new MyEvent(eventName, startEvent, endEvent, details);  //creates a new event
        for (int i = 0; i < tsf.size(); i++)
        {
          for (int j = 0; j < events.size(); j++)
          {
            if ((tsf.get(i).equals(today)) && ((events.get(j).makeTime() > newEvent.makeTime()) && (events.get(j).makeTime() < newEvent.makeTimeEnd())))
              //if the day equals this day and the event's start is greater than the other events start and less than the other events end
            { //this is supposed to make it so that if you have a day that's the same as a previously inputted day
              //and the day's event starts between the start and end of a different event of the same day
              //it won't let you add it, but it's not necessary
              System.out.println("You cannot input conflicting events."); //can't get this to work, but not necessary
              keepGoing = false;
            }
            
          }
        }
        tsf.add(today); //adds a day to tsf
        events.add(newEvent); //adds an event to newEvent
        System.out.println("Awesome! A new event has been inputted!");
        System.out.println(newEvent.getEventName());
        System.out.println(today.getName());
        System.out.println(date);
        System.out.println("From " + newEvent.getEventTime());
        System.out.println("Details: " + newEvent.getEventDetails());
        System.out.println("Is that all?  If you want to input a new date or view a date say 'yes', else say 'no'.");
        String answer = new String(kb.nextLine());
        if (answer.equals("no")) keepGoing = false;
      }
      
      else if (action.equals("view"))
      {
        //if there's a day that has the same date show the events
        for (int i = 0; i < tsf.size(); i++)
        {
          if (tsf.get(i).getDate().equals(date))
          {
            MyDay viewDay = new MyDay(date, events);
            viewDay = tsf.get(i); //can't use today since it's in the input if statement
            //so need a new day, this goes through all the days in tsf and finds the days with the same date as the one entered
            for (int j = 0; j < events.size(); j++)
            {
              System.out.println(viewDay.getEventList().get(j).getEventName()); //so the eventlist of this specific day, you get each event, and you get the event name of each event
              System.out.println(viewDay.getName()); //prints the name of the day (ie saturday)
              System.out.println(date); //prints the date mm/dd/yyyy
              System.out.println("From " + viewDay.getEventList().get(j).getEventTime());
              System.out.println("Details: " + viewDay.getEventList().get(j).getEventDetails());
            }
            System.out.println("Is that all?  If you want to input a new date or view a date say 'yes', else say 'no'.");
            String answer = new String(kb.nextLine());
            if (answer.equals("no")) keepGoing = false; //as long as you don't type no for this it'll keep going 
          }
          else
          { 
            System.out.println("There was no such date in the calendar.  Would you like to input a date?"); 
            String answer = new String(kb.nextLine());
            if (answer.equals("no")) keepGoing = false;
          }
        }
      }
    }
  }
  
  //if there isn't a day that matches that date say there isn't and ask if they want to add events
}

//System.out.println(today.leapYear());
//System.out.println(today.monthDays());
//System.out.println(today.tDay());
//System.out.println(today.getName());


