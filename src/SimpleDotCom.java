public class SimpleDotCom {
    int[] locations;
    int hits;

    public void setLocationCells(int[] location){
        locations = location;
        System.out.println(locations);
    }
    public String checkYourself( String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";

        for (int cell : locations){
            if (guess == cell){
                result = "hit";
                hits++;
                break;
            }
        }if (hits == locations.length){
            result = "kill!";
        }
        System.out.println(result);
        return result;
    }
}
