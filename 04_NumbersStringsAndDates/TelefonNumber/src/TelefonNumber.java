import java.util.Scanner;

public class TelefonNumber {
    public static void main(String[] args){
        System.out.println("Введите номер телефона ");

        Scanner scanner = new Scanner(System.in);
        String phone = scanner.nextLine();        //   909-123-4567

        StringBuilder phone1 = new StringBuilder(phone.replaceAll("[^0-9]",""));

        if (phone1.length() == 10) {
            phone1.insert(0,'7');

        }

        if(phone1.length() == 11);{
            phone1.replace(0, 1, "7");}

        if (phone1.length() < 10 || phone1.length() > 11 ){
            System.out.println("Неверный формат номера");
        }
        else {
            System.out.println(phone1);
        }







    }
}

