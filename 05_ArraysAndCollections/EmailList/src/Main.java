import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String email;
        String addedEmail;

        System.out.println("Выберите действие и введите одну из комманд:  LIST  ADD  ");
        Scanner scanner = new Scanner(System.in);
        email = scanner.nextLine();
        TreeSet<String> emails = new TreeSet<>() {{
            add("hello@skillbox.ru");
            add("allday@skillbox.ru");
            add("homeworkdone@skillbox.ru");
            add("lertur@skillbox.ru");
            add("support@skillbox.ru");
        }};
        if ("ADD".equals(email)) {
            System.out.println("Введите адрес, который  вы хотите добавить ");
            Scanner scanner1 = new Scanner(System.in);
            addedEmail = scanner1.nextLine();
      if (addedEmail.contains("@")) {
            emails.add(addedEmail);
            System.out.println(emails);}
            else {
                System.out.println("Адрес введен неверно. Повторите попытку");
            }
        }

        if ("LIST".equals(email)) {
            for (String s : emails) {
                System.out.println(s);
            }
        }

    }
}