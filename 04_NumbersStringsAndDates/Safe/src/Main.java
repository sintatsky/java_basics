
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер кредитной карты ");
        String text = scanner.nextLine();

        String safe = "Номер кредитной карты <4008 1234 5678>  ";
        int diamond1 = safe.indexOf('<');
        int diamond2 = safe.indexOf('>');
        String placeholder = "***";
        System.out.println(safe.substring(0, diamond1) + placeholder + safe.substring(diamond2 + 1));
    }
}