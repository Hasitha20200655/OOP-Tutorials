package Question1;

public class Letter implements Printable{
    String textField;

    public Letter(String textField) {
        this.textField = textField;
    }

    @Override
    public void print() {
        System.out.println("\n"+textField);
    }
}
