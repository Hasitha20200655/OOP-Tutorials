package Question1;

public class TwoDimensionalTest {

    public static void main(String[] args) {
        Board board1 = new Board(5);
        board1.print();

        System.out.println("\nMax Number in column   : " +board1.findMaxInColumn(3));
        System.out.println("Max Number in row      : " + board1.findMaxInRow(4));
        System.out.println("Max Number in Diagonal : " + board1.findMaxInDiagonal());
    }
}
