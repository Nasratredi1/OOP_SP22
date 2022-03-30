package Methods;
/*
// Create a method called displayHighScorePosition
// it should a players name as a paramater, and a 2nd paramater as a position in the high score table
// you should display the player name along with a massage like "managed to get into position" and the
// and the position they got and a further massage "on the high score table "
//
// Create a second metod called calculatedHigHScorePosition
// it should be sent one argument only, the player score
// it should return an int
// The return data should be
// 1 if the score is >1000
// 2 id the score is >500 and <1000
// if the socre is  >100 and <500
// 4 in all other cases
// call both methods and display the result of the following
// a score of 1500,900,400  and 50
 */
public class TestClass {
    public static void main(String[] args) {
    int highScorePosition = calculatedHighScorePosition(1500);
    displayHighScorePosition("Redi",highScorePosition);

     highScorePosition = calculatedHighScorePosition(900);
    displayHighScorePosition("Najam",highScorePosition);

    highScorePosition = calculatedHighScorePosition(400);
    displayHighScorePosition("wali",highScorePosition);

    highScorePosition = calculatedHighScorePosition(50);
    displayHighScorePosition("ahmad",highScorePosition);



    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position"
        + highScorePosition + " On the high score table");
    }

    public  static int calculatedHighScorePosition (int playerScore){
//        if (playerScore > 1000){
//            return 1;
//        }else if (playerScore > 500 && playerScore < 1000){
//            return 2;
//        }else if (playerScore > 100 &&playerScore < 500){
//            return 3;
//        }else {
//            return 4;
//        }

        //2nd ways

        int position = 4 ;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500){
            position = 2;
        }else if (playerScore >= 100){
            position = 3;
        }
        return  position;
    }
}
