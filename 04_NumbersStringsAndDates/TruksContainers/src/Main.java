
import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
      int container = 0;
      try (Scanner scanner = new Scanner(System.in)) {
          System.out.println("How many containers you have?");
          container = scanner.nextInt();
      } catch (Exception e) {
          e.printStackTrace();
      }
      Cargo cargo = new Cargo(container);
      System.out.println(cargo);
      cargo.result();

  }
}

class Cargo{
    private int truck;
    private int container;
    private int box;
    final int CONTAINERS_IN_TRUCK = 12;
    final int BOXES_IN_CONTAINER = 27;

    public Cargo(int box){
        this.box = box;
       if (box != 0) {
            container = box % BOXES_IN_CONTAINER == 0 ? box / BOXES_IN_CONTAINER : box / BOXES_IN_CONTAINER + 1;
        }
        if (container != 0){
            truck = container % CONTAINERS_IN_TRUCK == 0 ? container / CONTAINERS_IN_TRUCK : container / CONTAINERS_IN_TRUCK + 1;
        }
    }
    public int getTruck(){
        return truck;
    }
    public int getContainer(){
        return container;
    }
    public int getBox(){
        return box;
    }
    public void result(){
        int j=1;
        int i;
        for (i = 1; i <= container; i++){

           if (i % 27 == 0 && j % 12 == 0){
               container++;
               truck++;
               System.out.println("Контейнер " + container);
               System.out.println("Грузовиков " + truck);

            }
        }
    }
    }

