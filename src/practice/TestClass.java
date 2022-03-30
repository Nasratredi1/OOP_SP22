package practice;

public class TestClass {
    public static void main(String[] args) {
      /*  boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 4000){
            System.out.println("Your Score is 4000");
        }
        if (score < 5000 && score > 1000)
        {
            System.out.println("Your score was less that 5000 but greater that 1000");
        }
        else if (score < 1000){
            System.out.println("Your score is lees that 1000");
        }
        else {
            System.out.println("Got here");
        }
        if (gameOver == true){
            int finalScore = score + (levelCompleted * bonus);   // create variable and then assign value to it
            finalScore += 1000;
            System.out.println("Your final score is " + finalScore);
        }

       */

        /*exercise
        print out a second score on the secreen with the following
        score set to 10000
        leverlCompleted set to 8
        bonus set to 200
        But make sure the first printout above still displays as well

         */

        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if (newGameOver == true){
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your final score was "+ finalScore);
        }

    }
}

