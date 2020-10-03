import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;



public class Loader {
  public static void main(String[] args) {


      DateFormat dateFormat = new SimpleDateFormat("EEEE d MMM y");

      Calendar calendar = Calendar.getInstance();
      calendar.set(1988,1, 23);

      for (int i = 0; i <= 31; i++ ){

          calendar.add(calendar.YEAR, 1);
          System.out.println(dateFormat.format(calendar.getTime()));
      }



  }
}
