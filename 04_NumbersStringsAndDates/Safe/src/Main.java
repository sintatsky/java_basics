import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер кредитной карты");
        String text = scanner.nextLine();
        System.out.println(text.replaceAll("<4008 1234 5678 8912", "***"));
        System.out.println(searchAndReplaceDiamonds("Номер кредитной карты <4008 1234 5678> 8912", "***"));
    }

  public static String searchAndReplaceDiamonds(String text, String placeholder) {

    placeholder = "***";
    String safe;
      safe = searchAndReplaceDiamonds("Номер кредитной карты <4008 1234 5678 8912", placeholder);
      String var = " ";
    for (int i = 0; i < text.length(); i++) {
      if (Character.isDigit(text.trim().charAt(i))) {
        var = text.substring(i);
      }
    }
return safe;
    }
}
