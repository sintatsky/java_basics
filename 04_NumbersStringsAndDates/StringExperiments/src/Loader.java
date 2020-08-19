public class Loader
{
    public static void main(String[] args)
    {
    String text = "Вася заработал 5000\u20bd, Петя - 7563\u20bd, а Маша - 30000\u20bd";

        System.out.println(text);
        int v1 = text.indexOf("Вася заработал");
        int v2 = text.indexOf("\u20bd");
        String str1 = text.substring(v1 + 14, v2).trim();

        int m1 = text.indexOf("Маша - ");
        int m2 = text.lastIndexOf("\u20bd");
        String str2 = text.substring(m1 + 6, m2).trim();

        int amountMoney = Integer.parseInt(str1)+Integer.parseInt(str2);
        System.out.println("Сумма заработка Васи и Маши равна " + amountMoney + " \u20bd");
    }
}