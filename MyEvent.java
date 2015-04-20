import java.util.*;

public class MyEvent
{
  private String myName;
  private String myStart;
  private String myEnd;
  private String myDetails;
  
  public MyEvent(String eventName, String startEvent, String endEvent, String details)
  {
    myName = eventName;
    myStart = startEvent;
    myEnd = endEvent;
    myDetails = details;
  }
  
  public double makeTime()  //makes the start time into a double
  {
    double theTime = 0;
    double stime = Integer.parseInt(myStart.substring(0,2));
    double etime = Integer.parseInt(myStart.substring(3,5));
    theTime = stime + (etime/60);
    return theTime;
  }
  
  public double makeTimeEnd()  //makes the end time into a double
  {
    double theTime = 0;
    double stime = Integer.parseInt(myEnd.substring(0,2));
    double etime = Integer.parseInt(myEnd.substring(3,5));
    theTime = stime + (etime/60);
    return theTime;
  }
  
  public String getEventName() //return the name of the event
  {
    return myName;
  }
  
  public String getEventTime() //return the time range of the event
  {
    return myStart + " to " + myEnd;
  }
  
  public String getEventDetails() //return the details of the event
  {
    return myDetails;
  }
  
  //if a new event's start time is between another's start time and end time produce an error
}