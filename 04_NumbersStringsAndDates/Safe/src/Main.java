import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер кредитной карты");
        String text = scanner.nextLine();
        String Str = new String("4008 1234 5678 8912");
        System.out.println(text.replaceAll("4008 1234 5678", "Номер кредитной карты ***"));


        }

  public static String searchAndReplaceDiamonds(String text, String placeholder) {
        String safe = searchAndReplaceDiamonds("Номер кредитной карты <4008 1234 5678> 8912", "***");

    return safe;

    }

}



