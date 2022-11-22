package Question3;

import java.util.ArrayList;
import java.util.Scanner;

public class BookArray {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        boolean loop = true;

        while (loop){
            String menu = selectMenu();
            switch (menu){
                case "a","add" :
                    addBook(books);
                    break;
                case "s", "show" :
                    showBooks(books);
                    break;
                case "0" :
                    loop = false;
                    break;
            }
        }

    }

    public static void addBook(ArrayList<Book> list){

        boolean loop = true;
        while(loop) {
            Scanner get = new Scanner(System.in);
            System.out.print("Book Title : ");
            String title = get.nextLine();
            if (title.equalsIgnoreCase("0")){
                loop = false;
                continue;
            }
            System.out.print("Author : ");
            String author = get.nextLine();
            if (author.equalsIgnoreCase("0")){
                loop = false;
                continue;
            }
            System.out.print("Published Year : ");
            int publishYear = get.nextInt();
            if (publishYear == 0){
                loop = false;
                continue;
            }
            System.out.print("Price : ");
            double price = get.nextDouble();
            if (price == 0){
                loop = false;
                continue;
            }

            list.add(new Book(title, publishYear, author, price));
            System.out.println("\n--" + title + " successfully added--");
        }
    }

    public static void displayMenu(){

        String [] menu = {"Add a Book : a/add", "Show Books : s/show"};

        for (String m: menu) {
            System.out.println(m);
        }
    }

    public static String selectMenu(){
        String selectMenu = "";
        boolean loop = true;

        while (loop) {
            System.out.println();
            displayMenu();
            Scanner get = new Scanner(System.in);
            System.out.print("\nSelect from the menu : ");
            selectMenu = get.nextLine();
            if (selectMenu.equalsIgnoreCase("a") || selectMenu.equalsIgnoreCase("add") ||
                selectMenu.equalsIgnoreCase("s") || selectMenu.equalsIgnoreCase("show")){
                loop = false;
            }
        }
        return selectMenu;
    }

    public static void showBooks(ArrayList<Book>list){
        int index = 1;
        for (Book b: list) {
            System.out.println("\nBook "+index+"\n"+ b.toString());
        }
    }
}
