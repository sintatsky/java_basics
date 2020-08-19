
public class Loader
{
    public static void main(String[] args)
    {
    String text = "Вася заработал 5000\u20BD,\tПетя - 7563\u20BD, \tа Маша - 30000\u20BD";
    String vasyaSalary = text.substring(15, 19);
    int spaceLastIndex = text.lastIndexOf(' ');
    String mashaSalary = text.substring(51, spaceLastIndex);
    int i = Integer.parseInt(vasyaSalary);
    int k = Integer.parseInt(mashaSalary);
    try{
       int result = Integer.parseInt(mashaSalary);
        System.out.println(result);
    } catch (NumberFormatException e) {
        System.err.println("Unable to convert input string :" + mashaSalary + " to int");
    }
    int amountSalary = i + k;
    System.out.println(amountSalary);
    }
}