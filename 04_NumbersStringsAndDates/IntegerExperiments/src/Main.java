
public class Main {

    public static void main(String[] args) {
        Container container = new Container();
        container.count += 5059191;
        System.out.println(sumDigits(container.count));

        // дополнительное задание*
        int i = Character.digit('C', 16 );
        System.out.println("Number of C " + i);


    }

    public static Integer sumDigits(int number) {
        String str = Integer.toString(number);
        int sumDigits = 0;
        for (int i = 0; i < str.length(); i++)
            sumDigits = sumDigits + Integer.parseInt(str.charAt(i) + "");

        return sumDigits;

    }

}
