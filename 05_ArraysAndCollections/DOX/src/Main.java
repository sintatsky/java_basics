public class Main {
    public static void main(String[] args) {
        String[][] cross = new String[5][5];
        for(int i = 0; i < cross.length; i++){
            for (int j = 0; j < cross[i].length; j++){
                if (j == i || j == cross.length - 1 - i) {
                    cross[i][j] = "x";
                }
                else {cross[i][j] = " ";}
                System.out.print(cross[i][j]);
            }
            System.out.println();

        }
}
}









