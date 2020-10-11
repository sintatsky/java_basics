public class Main {
    public static void main(String[] args) {

        String[][] cross = {{"x      x",
                " x   x",
                "  x x",
                "   x",
                "  x x",
                " x   x",
                "x      x"}};

        int i = 0;
        for (int j = 0; j < cross[i].length; j++) {
            System.out.println(cross[i][j]);
        }
    }
}
