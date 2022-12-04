package APP;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello");
        Mframe mainFrame = new Mframe();
        mainFrame.setSize(600, 500);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
    }
}
