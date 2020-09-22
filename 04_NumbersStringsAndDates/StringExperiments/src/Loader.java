import java.util.Arrays;

public class Loader {
  public static void main(String[] args) {
    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

      String[] money = text.split(" ");
      for (int i = 0; i < money.length; i++) ;
    {
        System.out.println("Вася заработал " + money[2]+"\u20bd," +" Петя - "+ money[6]+"\u20bd,"+" а Маша - "+money[11]+"\u20bd");
    }
        int amountMoney = Integer.parseInt(money[2]) + Integer.parseInt(money[6]) + Integer.parseInt(money[11]);
        System.out.println("Общая сумма их заработка " + amountMoney);
    }
  }

