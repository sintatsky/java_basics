public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        String money = text.replaceAll("[^0-9]", "");
        String str1 = money.substring(0,4);
        String str2 = money.substring(4,8);
        String str3 = money.substring(8,13);

        int amountMoney = Integer.parseInt(str1) + Integer.parseInt(str2) + Integer.parseInt(str3);

        System.out.println("Вася заработал " + str1+"\u20bd,"+" Петя - "+str2+"\u20bd,"+" а Маша - "+str3+"\u20bd");
        System.out.println("Общая сумма их заработка " + amountMoney);



    }
}
