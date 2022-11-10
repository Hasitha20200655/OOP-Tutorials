package Question3;

import java.util.ArrayList;

public class Library {

    //Created a ArrayList to store Book objects
    ArrayList<Book> books = new ArrayList<Book>();

    public void populate(){

        //Created four Book objects
        books.add(new Book("WILLIAM FAULKNER","ABSALOM, ABSALOM!" ));
        books.add(new Book("JOHN GRISHAM","A TIME TO KILL" ));
        books.add(new Book("EDITH WHARTON","THE HOUSE OF MIRTH " ));
        books.add(new Book("JOHN STEINBECK","EAST OF EDEN" ));

//        for (int i = 0; i < 4; i++){
//            books.add(new Book());
//        }
    }

    public void displayAllBook(){

        /* Used a foreach loop to print each book object
         author name and book title in the ArrayList */
        for (Book b: books) {
            int i = books.indexOf(b)+1;
            System.out.println("\nBook "+ i);
            System.out.println("Author : "+b.author+
                    "\n"+
                    "Book Title : "+b.title);
        }
    }
}
