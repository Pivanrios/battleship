public class SimpleDotCom {
    //Keys, attributes
    int[] locations;    //An array with coordinates of a ship
    int hits;           // integer with record of hits per boat

    //methods
    public void setLocationCells(int[] location){       //a method that will set the locations of a ship and will return void
        locations = location;       
        System.out.println(locations);
    }
    public String checkYourself( String stringGuess){//mehtod that returns a string 
        int guess = Integer.parseInt(stringGuess);  //convert the guess into integer
        String result = "miss"; //default miss as result

        for (int cell : locations){     //loop thru each item on coordinates
            if (guess == cell){ //check if guess each equal to one coordinate   
                result = "hit";     //change result 
                hits++;     //add to the hits
                break;  //get out of for loop
            }
        }if (hits == locations.length){ //check if you kill the boat
            result = "kill";
        }
         //print result
        return result;      //return result
    }
}
