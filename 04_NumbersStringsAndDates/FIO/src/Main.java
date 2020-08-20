public class Main {
  public static void main(String[] args) {
      String name = "Иванов Сергей Петрович";
      int spaceIndex = name.indexOf(' ');
      int spaceIndex2 = name.lastIndexOf(' ');
      System.out.println("Фамилия:\t " + name.substring(0, spaceIndex) + "\nИмя:\t\t " + name.substring(spaceIndex, spaceIndex2) + "\nОтчество:\t " + name.substring(spaceIndex2));

  }
}

