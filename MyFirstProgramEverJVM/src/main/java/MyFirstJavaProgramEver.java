public class MyFirstJavaProgramEver {
  private static String asleep(int hour) {
    return message(hour, "asleep");
  }

  private static String awake(int hour) {
    return message(hour, "awake");
  }

  private static String message(int hour, String state) {
    return String.format("It's %s o'clock, so I'm %s", hour, state);
  }

  public static void main(String[] args) {
    boolean isWorkday = true;

    int currentHour = 0; // 12am

    while(currentHour <= 23) {
      if(isWorkday) {
        if(currentHour < 7)
          System.out.println(asleep(currentHour));
        else if (currentHour < 23)
          System.out.println(awake(currentHour));
        else
          System.out.println(asleep(currentHour));
      }
      else {
        if(currentHour < 9)
          System.out.println(asleep(currentHour));
        else
          System.out.println(awake(currentHour));
      }

      currentHour = currentHour + 1;
    }
  }
}
