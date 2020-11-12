import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;



public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<String> todoList = new ArrayList<>() {{
            add(0, "Get up in the morning");
            add(1, "Wash up");
            add(2, "Put yourself in order");
            add(3, "Put the planet in order");
            add(4, "Weed out the baobabs");
        }};

        String nameOfDeal;
        int dealNumber;
        String editName;
        int deleteDeal;



        String text = "WELCOME TO THE DAY TO-DO LIST. SELECT THE ACTION: " +
                "\n\nLIST - display the to-do list on the screen \nADD - add to the to-do list" +
                "\nEDIT - replace the case with the specified number;" +
                "\nDELETE - delete a case from the list" +
                "\nEXIT - exit";
        System.out.println(text);
        System.out.println("\nENTER: ");

        while (true) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            String [] words = input.split("\\s+", 3);

            if (words[1].contains("[0-9]")); {
                System.out.println("Enter which case you want to add ");
                Scanner scanner2 = new Scanner(System.in);
                nameOfDeal = scanner2.nextLine();
                System.out.println("Enter the index of the case you want add");
                dealNumber = scanner2.nextInt();
                todoList.add(dealNumber,nameOfDeal);
                for (String s : todoList) {
                    System.out.println(todoList.indexOf(s) + " " + s);
                }




            switch (input){

            case "LIST":
                    System.out.println("TO-DO LIST: ");
                    for (String s : todoList) {
                        System.out.println(todoList.indexOf(s) + " " + s);
                    }

                    continue;



                case "ADD":
                    System.out.println("Enter which case you want to add ");
                    Scanner scanner1 = new Scanner(System.in);
                    nameOfDeal = scanner1.nextLine();
                    todoList.add(nameOfDeal);
                    System.out.println("The case has been added and is listed under No.: " + todoList.size());
                    System.out.println();
                    for (String s : todoList) {
                        System.out.println(todoList.indexOf(s) + " " + s);
                    }



                case "DELETE":
                    System.out.println("Enter the index of the case you want to delete");
                    Scanner scanner4 = new Scanner(System.in);
                    deleteDeal = scanner4.nextInt();
                    todoList.remove(deleteDeal);
                    for (String s : todoList) {
                        System.out.println(todoList.indexOf(s) + " " + s);
                    }
                    continue;

                case "EDIT":

                    System.out.println("Enter index of the case you want to change");
                    Scanner scanner2 = new Scanner(System.in);
                    dealNumber = scanner2.nextInt();
                    todoList.remove(dealNumber);
                    System.out.println("Enter a new task instead of the old one");
                    Scanner scanner3 = new Scanner(System.in);
                    editName = scanner3.nextLine();
                    todoList.add(dealNumber, editName);
                    for (String s : todoList) {
                        System.out.println(todoList.indexOf(s) + " " + s);
                    }
                    continue;

                default:
                    System.out.println("Try again");
                    break;

                case "EXIT":
                    System.out.println("UP TO NEW MEETINGS!");
                    break;
            }
                sc.close();

        }

    }
}}
