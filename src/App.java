public class App {
    public static void main(String[] args) throws Exception {
       //declare a variable that will hold the number of guesses
       int numOfGuesses = 0;

       // create a instance of a boat
       SimpleDotCom navyBoat = new SimpleDotCom();
       //set the boats coordinates
       int initCoordinate = (int) (Math.random()*5);
       System.out.println(initCoordinate);
       // declare an array to store the variables
       int[] coordinates = {initCoordinate, initCoordinate+1, initCoordinate+2};
       //set locations to boat
       navyBoat.setLocationCells(coordinates);
       //declare a boolean variable to store the state of the boat
       boolean isAlive = true;
       System.out.println(isAlive);
       
       //
       String[] guesses = {"1","2","3","4","5","6","7","8"};
       //create a while loop that holds until the boat is dead
       System.out.println(guesses);
       while(isAlive == true){
            String resultado =  navyBoat.checkYourself(guesses[numOfGuesses]);
            System.out.println(resultado);
            numOfGuesses++;
            if(resultado == "kill"){
                isAlive = false;
                System.out.println("you took " + numOfGuesses + " guesses");
            }
       }

       

    
    }
}
