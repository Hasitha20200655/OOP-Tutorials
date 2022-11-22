package Question3;

public class Book {

    String title;
    double price;
    int publishYear;
    String author;

    Book(String title, int publishYear, String author,double price){
        this.title = title;
        this.publishYear = publishYear;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString(){
        return "\nTitle : " + title + "\nAuthor : " + author +
                "\nPublished Year : " + publishYear;
    }
}
