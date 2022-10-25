package Question3;

import java.util.Random;

public class VotingMachine {
    int labourVotes;
    int conservativeVotes;

    public VotingMachine(){

        Random random = new Random();
        this.labourVotes = random.nextInt(50);

        this.conservativeVotes = 0;
    }

    public void clearMachine(){
        this.labourVotes = 0;
        this.conservativeVotes = 0;
    }

    public void setLabourVotes(){
        this.labourVotes += 1;
    }

    public void setConservativeVotes(){
        this.conservativeVotes += 1;
    }

    public int getLabourVotes(){
        return labourVotes;
    }

    public int getConservativeVotes(){
        return conservativeVotes;
    }
}
