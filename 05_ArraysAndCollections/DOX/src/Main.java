

public class Main {
    public static void main(String[] args) {
        String[][] cross = new String[3][3];
        for(int i = 0; i < cross.length; i++){
            for(int k = 0; k <= i; k++){
                System.out.println(" ");
            }
            for (int j = cross.length - 1; j > i; j--){
                if (j == cross.length - i  - 1 || j == i + 1)
                    System.out.println("x");
                else
                    System.out.println("  ");

            }
            System.out.println();
        }
        for (int i = 0; i < cross.length; i++ ){
            for (int v = cross.length; v > i; v --){
                System.out.println(" ");
            }
            for (int j = 0; j < i; j++){
                for (int h = 0; h <= j; h++)
                System.out.println("x");
            }
        }
      }
}











