import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class Loader {
  public static void main(String[] args) {
      final String PRINT_DATE_FORMAT = "EE d.MM.yyyy ";
      final Locale LOCALE = new Locale("ru");
      SimpleDateFormat sdf = new SimpleDateFormat(PRINT_DATE_FORMAT, LOCALE);
      Calendar today = Calendar.getInstance();
      Calendar birthday = Calendar.getInstance();
      birthday.set(1989, Calendar.FEBRUARY, 23);


      while (birthday.before(today)) {
          Date date = birthday.getTime();
          birthday.add(Calendar.YEAR, 1);
          System.out.println(sdf.format(date));


      }












    /*  DateFormat dateFormat = new SimpleDateFormat("EEEE d MMM y");
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
*/


  }
}
