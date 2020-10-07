
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер кредитной карты ");          //4008 1234 5678 8912
        String text = scanner.nextLine();
        String safe = "Номер кредитной карты <4008 1234 5678>  ";
        String placeholder = "***";
        System.out.println(safe.replaceAll("<(.*?)>", placeholder));

    }



}
