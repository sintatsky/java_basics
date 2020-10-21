import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;


public class Main {
  public static void main(String[] args) throws IOException {

    ArrayList<String> todoList = new ArrayList<>() {{
      add(0, "Встать поутру");
      add(1, "Умыться");
      add(2, "Привести себя в порядок");
      add(3, "Привести планету в порядок");
      add(4, "Выполоть баобабы");
    }};

    String nameOfDeal;
    int dealNumber ;
    String editName;
    int deleteDeal;

String text = "ДОБРО ПОЖАЛОВАТЬ В СПИСОК ДЕЛ НА ДЕНЬ. ВЫБЕРИТЕ ДЕЙСТВИЕ:  \n\nLIST - вывести список дел на экран  " +
        "\nADD - пополнить список дел" +
        "\nEDIT - заменить дело с указанным номером; " +
        "\nDELETE - удалить дело из списка " +
        "\nEXIT - выход";
    System.out.println(text);

    System.out.println("\nВВОД: ");


    while (true) {
      Scanner sc = new Scanner(System.in);
      switch (sc.nextLine())
       {
        case "LIST":
          System.out.println("СПИСОК ДЕЛ: ");
          for (String s : todoList) {
            System.out.println(todoList.indexOf(s) +" "+ s);
          }

          continue;

        case "ADD":
          System.out.println("Введите, какое дело вы хотите добавить ");
          Scanner scanner1 = new Scanner(System.in);
          nameOfDeal = scanner1.next();
          todoList.add(nameOfDeal);
          System.out.println("Дело добавленно и находится в списке под №: " + todoList.size());
          System.out.println();
          for (String s : todoList) {
            System.out.println(todoList.indexOf(s) +" "+ s);
          }

          continue;

        case "DELETE":
          System.out.println("Введите индекс дела, которое вы хотите удалить");
          Scanner scanner4 = new Scanner(System.in);
          deleteDeal = scanner4.nextInt();
          todoList.remove(deleteDeal);
          for (String s : todoList) {
            System.out.println(todoList.indexOf(s) +" "+ s);
          }
          continue;

        case "EDIT":

          System.out.println("Введите порядковый номер дела, которое вы хотите изменить");
          Scanner scanner2 = new Scanner(System.in);
          dealNumber = scanner2.nextInt();
          todoList.remove(dealNumber);
          System.out.println("Введите новое задание вместо старого");
          Scanner scanner3 = new Scanner(System.in);
          editName = scanner3.nextLine();
          todoList.add(dealNumber, editName);
          for (String s : todoList) {
            System.out.println(todoList.indexOf(s) +" "+ s);
          }
          continue;

        default:
          System.out.println("Попробуйте еще раз");
          break;

        case "EXIT":
          System.out.println("ДО НОВЫХ ВСТРЕЧ!");
          break;
      }
      sc.close();
    }

  }
}