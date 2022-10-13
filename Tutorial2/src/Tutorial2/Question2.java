package Tutorial2;

public class Question2 {

    public void run(){
        String animal1 = "the quick brown fox ";
        String animal2 = "lazy dog";
        String article = "the";
        String action  = "jumps over";

        String fullSentence = animal1.concat(action).concat(" ").concat(article).concat(" ").concat(animal2);
        int length = fullSentence.length();

        System.out.println("\n"+fullSentence);
        System.out.println("\""+fullSentence+"\"\sstring length is\s"+length);
        System.out.println("\n"+animal1 + action +" "+article+ " " + animal2);
    }
}
