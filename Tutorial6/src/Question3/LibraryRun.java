package Question3;

public class LibraryRun {
    public static void main(String[] args) {

        //Created a library object
        Library l1 = new Library();
        //Populated the object using the populate methode
        l1.populate();
        /*Display author name and book title of each book in
        the library Book object ArrayList*/
        l1.displayAllBook();
    }
}
