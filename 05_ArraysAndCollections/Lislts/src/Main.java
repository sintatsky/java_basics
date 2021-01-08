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
//
//                   else if (words[1].matches("\\d+") & Integer.parseInt(words[1]) < todoList.size()) {
//                        todoList.add(words[2]);
//                        for (String s : todoList) {
//                            System.out.println(todoList.indexOf(s) + " " + s);
//                        }
//                    }

                    else {
                        todoList.add(words[1]);
                    for (String s : todoList) {
                        System.out.println(todoList.indexOf(s) + " " + s);
                    }}
                    continue;


                    case "DELETE":
                        if (words[1].matches("\\d+")){
                            int index = Integer.parseInt(words[1]);
                            todoList.remove(index);
                            System.out.println("Дело " + index + " удалено");

                            for (String s : todoList) {
                                System.out.println(todoList.indexOf(s) + " " + s);
                            }
                        }
                        continue;



                    case "EDIT":

                        if (words[1].matches("\\d+")){
                            int index = Integer.parseInt(words[1]);
                            todoList.remove(index);
                            todoList.add(index, words[2]);
                            System.out.println("Дело " + index + " заменено на " + words[2]);

                            for (String s : todoList) {
                                System.out.println(todoList.indexOf(s) + " " + s);
                            }}
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
