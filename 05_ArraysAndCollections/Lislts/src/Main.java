import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String deals;
        String nameOfDeal;
        int dealNumber;
        String editName;
        int deleteDeal;
        System.out.println("Выберите действие и введите одну из комманд:  LIST  ADD  EDIT  DELETE");

        Scanner scanner = new Scanner(System.in);
        deals = scanner.nextLine();
        ArrayList<String> toDoList = new ArrayList<>() {{
            add(0, "Встать поутру");
            add(1, "Умыться");
            add(2, "Привести себя в порядок");
            add(3, "Привести планету в порядок");
            add(4, "Выполоть баобабы");
        }};


        if ("ADD".equals(deals)) {
            System.out.println("Введите, какое дело вы хотите добавить ");
            Scanner scanner1 = new Scanner(System.in);
            nameOfDeal = scanner1.nextLine();
            toDoList.add(nameOfDeal);
            System.out.println(toDoList);

        } else if ("EDIT".equals(deals)) {
            System.out.println("Введите порядковый номер дела, которое вы хотите изменить");
            Scanner scanner2 = new Scanner(System.in);
            dealNumber = scanner2.nextInt();
            toDoList.remove(dealNumber);
            System.out.println("Введите, новое задание вместо старого");
            Scanner scanner3 = new Scanner(System.in);
            editName = scanner3.nextLine();
            toDoList.add(dealNumber, editName);
            System.out.println(toDoList);

        } else if ("DELETE".equals(deals)) {
            System.out.println("Введите порядковый номер дела, которое вы хотите удалить");
            Scanner scanner4 = new Scanner(System.in);
            deleteDeal = scanner4.nextInt();
            toDoList.remove(deleteDeal);
            System.out.println(toDoList);
        }
        if ("LIST".equals(deals)) {
            for (String s : toDoList) {
                System.out.println(s);
            }
        }
    }
}