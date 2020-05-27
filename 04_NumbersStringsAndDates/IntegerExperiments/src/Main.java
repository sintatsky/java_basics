
public class Main {

    public static void main(String[] args) {
        Container container = new Container();
        container.count += 7843;


    }

    public static Integer sumDigits(int number) {
        String str = Integer.toString(number);
        int a = 0;
        for (int i = 0; i < str.length(); i++)
            a = a + Integer.parseInt(str.charAt(i) + "");

        return a;

    }

}
