package Question1;

public class QuestionRun {
    public static void main(String [] args){

        Question1 q1 = new Question1();
        Question1 q2 = new Question1(20);

        System.out.println("Number of cans : "+q1.getCanCount());
        System.out.println("Number of cans : "+q2.getCanCount());

    }
}
