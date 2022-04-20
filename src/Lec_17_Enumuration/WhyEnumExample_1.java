package Lec_17_Enumuration;

public class WhyEnumExample_1 {
    public static final int WON = 1;
    public static final int LOST = 2;
    public static final int DRAW = 0;
    public final int abc = 25;

    public static void main(String[] args) {
        int gameStatus = startGame();

        if(gameStatus == WON)
            System.out.println("Player won the game");

        else if(gameStatus == LOST)
            System.out.println("Player lost the game");

        else if(gameStatus == DRAW)
            System.out.println("Game draw. No one won.");
    }

    // Below  method shall return a valid game status
    public static int startGame(){
        // Game logic here

        return 4; // Problem? Java can't verify validity of value at compile time
    }

}
