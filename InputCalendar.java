import java.util.*;

public class InputCalendar
{
  private String myDate;
  private ArrayList<MyDay> daysAndDays;
  private MyDay thisDay;
  public InputCalendar(String date, ArrayList<MyDay> tsf, MyDay today)
  {
    myDate = date;
    daysAndDays = tsf;
    thisDay = today;
  }
  
  public void addDay()
  {
    int day = Integer.parseInt(myDate.substring(3,5));
    int month = Integer.parseInt(myDate.substring(0,2));
    int year = Integer.parseInt(myDate.substring(6,10));
    daysAndDays.add(thisDay);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  /*private ArrayList<ArrayList<ArrayList<ArrayList<ArrayList>Integer>>>>> myCalendar;
  public InputCalendar(ArrayList<ArrayList<ArrayList<ArrayList<ArrayList>Integer>>>>> calendar)
  {
    myCalendar = calendar;
  }

  
  public ArrayList<ArrayList<ArrayList<ArrayList<ArrayList>Integer>>>>> setUp()
  {
  /*   
  Scanner kb = new Scanner(System.in);
  System.out.println("What year?");
  int year = kb.nextInt();
  System.out.println("What month?");
  int month = kb.nextInt();
  System.out.println("What day?");
  int day = kb.nextInt();
  System.out.println("What time?");
  int time = kb.nextInt();
  
  
  ArrayList<Integer> yearData = new ArrayList<Integer>();
  ArrayList<Integer> monthData = new ArrayList<Integer>();
  ArrayList<Integer> dayData = new ArrayList<Integer>();
  ArrayList<Integer> timeData = new ArrayList<Integer>();
  
  yearData.add(year);
  monthData.add(month);
  dayData.add(day);
  timeData.add(time);
  
  ArrayList<Integer> myTime = new ArrayList<Integer>();
  ArrayList<ArrayList<Integer>> myDay = new ArrayList<ArrayList<Integer>>();
  ArrayList<ArrayList<ArrayList<Integer>>> myMonth = new ArrayList<ArrayList<ArrayList<Integer>>>();
  ArrayList<ArrayList<ArrayList<ArrayList<Integer>>>> myYear = new ArrayList<ArrayList<ArrayList<ArrayList<Integer>>>>();
  
  myTime.add(timeData);
  myDay.add(dayData, myTime);
  my
  
  
  
  
  
  myYear.add(yearData, myMonth, myDay, myTime);
  
  
  return myYear;
  }*/
  
}