public class Main {
  public static void main(String[] args) {
      String name = "Иванов Сергей Петрович";
      String[] name1 = name.split("\\s");
      for (int i = 0; i < name1.length; i++){
      System.out.println(name1[i]);
      }

  }
}

