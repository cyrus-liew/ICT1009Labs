/*
Develop a program that displays the current time in GMT (Greenwich Mean Time) in the format hour:minute:second, such as 13:19:8. 
The CurrentTimeMillis method in the System class returns the current time in milliseconds elapsed since midnight, January 1, 1970 GMT

*/

class Main {
    public static void main(String[] args) {
      long totalMilliseconds = System.currentTimeMillis();
      long totalSeconds = totalMilliseconds / 1000;
      long currentSecond = totalSeconds % 60;
      long totalMinutes = totalSeconds / 60;
      long currentMinute = totalMinutes % 60;
      long totalHours = totalMinutes / 60;
      long currentHour = totalHours % 24;

      System.out.println("Current time is "+currentHour+":"+currentMinute+":"+currentSecond+" GMT");
    }
  }