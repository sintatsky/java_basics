import java.util.Arrays;

public class Loader {
  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

    String money = text.replaceAll("[^0-9]"," ").trim();
    int spaceIndex = money.indexOf(' ');
    int spaceIndex2 = money.lastIndexOf(' ');

    String vasya = money.substring(0, spaceIndex);
    String petya = money.substring(spaceIndex, spaceIndex2).trim();
    String masha = money.substring(spaceIndex2+1);

    int vasyaMoney = Integer.parseInt(vasya);
    int petyaMoney = Integer.parseInt(petya);
    int mashaMoney = Integer.parseInt(masha);

    int moneyAmount = vasyaMoney + petyaMoney + mashaMoney;

    System.out.println("Вася заработал " + vasyaMoney + ", Петя - " + petyaMoney + ", а Маша - " + mashaMoney);
    System.out.println("Общая сумма их заработка " + moneyAmount);


     }
  }

