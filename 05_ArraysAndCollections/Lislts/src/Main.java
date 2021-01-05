import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;



public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<String> todoList = new ArrayList<>() {{
            add(0, "Купить ёлку");
            add(1, "Купить подарки");
            add(2, "Положить подарки под ёлку");

        }};

        String nameOfDeal;
        int dealNumber;
        String editName;
        int deleteDeal;


        System.out.println("Выберите действие: \nLIST \nADD \nEDIT \nDELETE \nEXIT");


        while (true) {
            Scanner sc = new Scanner(System.in);
            String task = sc.nextLine();
            String[] words = task.split("\\s+", 3);
            switch (words[0]){

                    case "LIST":
                        System.out.println("Ваш список дел: ");
                        for (String s : todoList) {
                            System.out.println(todoList.indexOf(s) + " " + s);
                        }

                        continue;


                    case "ADD":

                    if (words[1].matches("\\d+")){
                        int index = Integer.parseInt(words[1]);
                        todoList.add(index, words[2]);

                        for (String s : todoList) {
                            System.out.println(todoList.indexOf(s) + " " + s);
                        }}

                   else if (words[1].matches("\\d+") & Integer.parseInt(words[1]) < todoList.size()) {
                        todoList.add(words[2]);
                        for (String s : todoList) {
                            System.out.println(todoList.indexOf(s) + " " + s);
                        }
                    }

                    else {
                        todoList.add(words[1]);
                    for (String s : todoList) {
                        System.out.println(todoList.indexOf(s) + " " + s);
                    }}
                    continue;




                    case "DELETE":
                        System.out.println("Введите индекс дела, которое хотите удалить");
                        Scanner scanner3 = new Scanner(System.in);
                        deleteDeal = scanner3.nextInt();
                        todoList.remove(deleteDeal);
                        for (String s : todoList) {
                            System.out.println(todoList.indexOf(s) + " " + s);
                        }
                        continue;

                    case "EDIT":

                        System.out.println("Введите номер дело, которое хотите заменить");
                        Scanner scanner4 = new Scanner(System.in);
                        dealNumber = scanner4.nextInt();
                        todoList.remove(dealNumber);
                        System.out.println("Введите новую задачу");
                        Scanner scanner5 = new Scanner(System.in);
                        editName = scanner5.nextLine();
                        todoList.add(dealNumber, editName);
                        for (String s : todoList) {
                            System.out.println(todoList.indexOf(s) + " " + s);
                        }
                        continue;

                    default:
                        System.out.println("Попробуйте еще раз");
                        break;

                    case "EXIT":
                        System.out.println("До скорых встреч! С наступающим!");
                        break;
                }
                sc.close();

            }

        }
    }
