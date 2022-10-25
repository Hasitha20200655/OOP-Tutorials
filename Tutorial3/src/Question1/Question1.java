package Question1;

public class Question1 {

        private int numberOfCans;
        private int numberOfTokens;

        public Question1(int numberOfCans){
            this.numberOfCans   = numberOfCans;
            this.numberOfTokens = 0;
        }

        public Question1(){
            this.numberOfCans   = 10;
            this.numberOfTokens = 0;
        }

        public void fillUp(int cans){
            numberOfCans += cans;
        }

        public void insertToken()
        {
            if(numberOfCans > 0){
                numberOfTokens++;
                numberOfCans--;
            }
            else {
                System.out.println("Sorry for the inconvenience Vending Machine is Empty please try again later");

            }
        }

        public int getCanCount(){
            return numberOfCans;
        }

        public int getTokenCount(){
            return numberOfTokens;
        }
}
