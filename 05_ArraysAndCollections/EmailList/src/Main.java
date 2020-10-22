import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        String addedEmail;

        System.out.println("Выберите действие и введите одну из комманд:  " +
                "\nLIST - вывести на экран список электронных адресов " +
                "\nADD - добавить электронный адрес  " +
                "\nEXIT - выход");

        TreeSet<String> emails = new TreeSet<>() {{
            add("hello@skillbox.ru");
            add("allday@skillbox.ru");
            add("homeworkdone@skillbox.ru");
            add("lertur@skillbox.ru");
            add("support@skillbox.ru");
        }};

        while (true){
            Scanner sc = new Scanner(System.in);
            switch (sc.nextLine()){

                case  "ADD":
            System.out.println("Введите адрес, который  вы хотите добавить ");
            Scanner scanner1 = new Scanner(System.in);
            addedEmail = scanner1.nextLine();
      if (addedEmail.contains("@")) {
            emails.add(addedEmail);
            System.out.println(emails);}
            else {
                System.out.println("Адрес введен неверно. Повторите попытку");
            }
            continue;

            case "LIST":
            for (String s : emails) {
                System.out.println(s);
            }
            continue;
                case "EXIT":
                    System.out.println("Хорошего дня!");
                    break;
            }
            sc.close();
        }

    }
}