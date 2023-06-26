public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("We are in!");
        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {2,3,4};
        dot.setLocationCells(locations);

        String userGuess = "2";
        String guess2 = "1";
        String guess3 = "3";
        String result = dot.checkYourself(userGuess);
        dot.checkYourself(guess2);
        dot.checkYourself(guess3);
        

    
    }
}
