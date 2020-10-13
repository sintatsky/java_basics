public class Main {
  public static void main(String[] args) {
    String[] colors = {"Каждый", "охотник", "желает", "знать", "где", "сидит", "фазан"};

//    for (int i = 0; i < colors.length; i++){
//      System.out.println(colors[i]);
//    }
    String temp;

    for (int i = 0; i < colors.length / 2; i++) {
      temp = colors[colors.length - i - 1];
      colors[colors.length - i - 1] = colors[i];
      colors[i] = temp;
    }

    for (int i = 0; i < colors.length; i++) {
      System.out.println(colors[i]);
    }

  }
}
