
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    final int BOX_IN_CONTAINER = 27;
    final int CONTAINER_IN_TRUCK = 12;
    final int BOX_IN_TRUCK = BOX_IN_CONTAINER * CONTAINER_IN_TRUCK;

    Scanner scanner = new Scanner(System.in);
    for (; ; ){
      System.out.println(" == Введите число ящиков :");
      if (scanner.hasNextInt()) {
        int boxCount = scanner.nextInt();

        int containerCount = 0;
        int truckCount = 0;

        int i = 0;
        while (i < boxCount) {
          if (i % BOX_IN_TRUCK == 0) {
            System.out.println("Грузовик " + ++truckCount);
          }
          if (i % BOX_IN_CONTAINER == 0) {
            System.out.println("\tКонтейнер " + ++containerCount);
          }
          System.out.println("\t\tЯщик " + ++i);
        }
        System.out.printf(
            "Необходимо Грузовиков:%d, Контейнеров:%d %n", truckCount, containerCount);
      } else {
        System.out.println("Ошибка.Введите число повторно");
        scanner.nextLine(); // отчистка сканера
      }
    }
  }
    }