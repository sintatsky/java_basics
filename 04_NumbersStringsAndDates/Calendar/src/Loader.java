import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;



public class Loader {
  public static void main(String[] args) {


      DateFormat dateFormat = new SimpleDateFormat("EEEE d MMM y");
      Calendar calendar = Calendar.getInstance();
      calendar.set(1988,1, 23);
      int yearsOld = 0;
      int nowYears = 31;
      while (yearsOld <= nowYears){
          yearsOld = yearsOld + 1;
          calendar.add(calendar.YEAR, +1);
          System.out.println(dateFormat.format(calendar.getTime()));
      }



  }
}
