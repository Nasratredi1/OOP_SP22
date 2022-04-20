package Lec_17_Enumuration;

public class WhyEnumExample1 {
    public static void main(String[] args) {

    int gameStatus =  startGame();

        if(gameStatus == 1)
            System.out.println("Player won the game");

        else if(gameStatus == 2)
            System.out.println("Player loss the game");

        else if(gameStatus == 0)
            System.out.println("Game draw");
}

    // Below  method shall return a valid game status
    public static int startGame(){
        // Game logic here

        return 4; // Problem? Java can't verify validity of value at compile time
    }
}
