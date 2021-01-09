import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Email {
    public static void main(String[] args) throws IOException {

        TreeSet<String> email = new TreeSet<>() {{
            add("hello@skillbox.ru");
            add("allday@skillbox.ru");
            add("homeworkdone@skillbox.ru");
            add("lertur@skillbox.ru");
            add("support@skillbox.ru");
        }};

        System.out.println("Выберите действие и введите одну из комманд:  " +

                "\nLIST " +
                "\nADD " +
                "\nEXIT");

        while (true){
            Scanner sc = new Scanner(System.in);
            String mail = sc.nextLine();
            String[] addedEmail = mail.split("\\s+", 2);
            switch (addedEmail[0]){

                case  "ADD":
                    if (addedEmail[1].contains("@")){

                        email.add(addedEmail[1]);

                        for (String s : email) {
                            System.out.println(s);
                        }}

                    else {
                        System.out.println("Адрес введен неверно. Повторите попытку");
                    }
                    continue;

                case "LIST":
                    for (String s : email) {
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
