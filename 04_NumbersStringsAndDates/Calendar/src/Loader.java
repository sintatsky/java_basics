import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Loader {
  public static void main(String[] args) {

      DateFormat dateFormat = new SimpleDateFormat("EEEE d MMM y");
      Calendar calendar = Calendar.getInstance();

      int day = 23;
      int month = Calendar.FEBRUARY;
      int year = 1989;

      int birthday = 0;
      int today = 31;



      calendar.set(year, month, day);

       while (birthday < today) {
              birthday = birthday + 1;
              calendar.add(Calendar.YEAR, 1);
              System.out.println(dateFormat.format(calendar.getTime()));
      }



  }
}
