import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Loader {
  public static void main(String[] args) {

      int day = 23;
      int month = Calendar.FEBRUARY;
      int year = 1989;

      Date birthday = new Date(0);
      Date today = new Date(31);

      DateFormat dateFormat = new SimpleDateFormat("EEEE d MMM y");
      Calendar calendar = Calendar.getInstance();
      calendar.set(year, month, day);
      calendar.setTime(new Date());
      int birthday1 = calendar.get(Calendar.DATE);

       while (today.after(birthday)) {

          birthday1 = birthday1 +1;
          calendar.add(calendar.YEAR, 1);
          System.out.println(dateFormat.format(calendar.getTime()));
      }



  }
}
