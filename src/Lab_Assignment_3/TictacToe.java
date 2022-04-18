package Lab_Assignment_3;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class TictacToe extends Game  {
    //---------- Enum Types ---------------
    private enum Moves { X, O, EMPTY };
    private final int boardSize = 3;
    private int[][][] winScenarios = {
            {{0,0}, {0,1}, {0,2}},
            {{1,0}, {1,1}, {1,2}},
            {{2,0}, {2,1}, {2,2}},
            {{0,0}, {1,0}, {2,0}},
            {{1,0}, {1,1}, {1,2}},
            {{2,0}, {2,1}, {2,2}},
            {{0,0}, {1,1}, {2,2}},
            {{0,2}, {1,1}, {2,0}}
    };
    // ---------Two Dimensional Array---------------
    private Moves[][] board = new Moves[boardSize][boardSize];
    private final List<String> alphaMap = new ArrayList <>(Arrays.asList("A","B","C","D","E","F","G","H","I"));
    private Moves currentPlayer = Moves.X;
    private Moves winner = Moves.EMPTY;
    Scanner input = new Scanner(System.in);

    TictacToe (){
        // init with empty board
        for(int row = 0; row < board.length; row++){
            Arrays.fill(board[row],Moves.EMPTY);
        }
        ShowBoard(board);
        NextTurn();
    }

    private void ShowBoard(Moves[][] board){
        int alphaCounter = 0;
        System.out.printf("%n  TIC-TAC-TOE %n  ------------ %n");
        for(int row = 0; row < board.length; row++){
            for (int cell = 0; cell < board[row].length; cell++) {
                System.out.printf(" | ");
                if(board[row][cell] == Moves.EMPTY){
                    System.out.print(alphaMap.get(alphaCounter));
                } else {
                    System.out.print(board[row][cell]);
                }
                alphaCounter++;
            }
            System.out.printf(" | %n  ------------ %n");
        }
    }

    private void UpdateBoard(int[] boardPosition, Moves player ){
        board[boardPosition[0]][boardPosition[1]] = player;
        ShowBoard(board);
    }

    private void HelpInvalidInput(String playerChoice){
        System.out.printf("%n Player ");
        System.out.print(currentPlayer);
        System.out.printf("%n %s isn't an open box on the board. %n", playerChoice);
        ShowBoard(board);
        System.out.printf("%n Enter a letter A-I that is still open: ");
        MakeMove(input.next());
    }

    private void NextTurn(){
        if (!isGameOver()){
            currentPlayer = currentPlayer == Moves.X ? Moves.O : Moves.X;
            System.out.printf("%n Player ");
            System.out.println(currentPlayer);
            System.out.println(" enter letter in the box where you'll make your move: ");
            MakeMove(input.next());
            return;
        }
        GameOver();
    }

    private void MakeMove(String playerChoice){
        playerChoice = playerChoice.toUpperCase();
        if( isValidBox(playerChoice) ){
            // determine board position once input is validated
            int[] boardPosition = alphaToBoardPosition( playerChoice );
            if ( isBoxEmpty(boardPosition) ){
                UpdateBoard( boardPosition, currentPlayer );
                NextTurn();
            } else {
                HelpInvalidInput( playerChoice );
            }
        } else {
            HelpInvalidInput( playerChoice );
        }
    }

    private int[] alphaToBoardPosition(String alpha){
        int boxInt = alphaMap.indexOf(alpha);
        int[] boardPosition = { boxInt / boardSize, boxInt % boardSize };
        return boardPosition;
    }

    private boolean isValidBox(String playerChoice){
        return alphaMap.contains(playerChoice);
    }

    private boolean isBoxEmpty(int[] boardPosition){
        return board[boardPosition[0]][boardPosition[1]] == Moves.EMPTY;
    }

    private boolean isGameOver(){
        int emptyCount = 0;
        // for winScenario in 8 possible scenarios (complete row, column or diagonal)
        for (int i = 0; i< winScenarios.length; i++){
            int xCount = 0;
            int oCount = 0;

            for( int j = 0; j< winScenarios[i].length; j++){
                int[] boardPosition = winScenarios[i][j];
                Moves currentPlayer = board[boardPosition[0]][boardPosition[1]];
                emptyCount = currentPlayer == Moves.EMPTY ? emptyCount+1 : emptyCount;
                xCount = currentPlayer == Moves.X ? xCount+1 : xCount;
                oCount = currentPlayer == Moves.O ? oCount+1 : oCount;

                // set winner & end game if relevant
                if (xCount == 3){
                    winner = Moves.X;
                    return true;
                }
                if (oCount == 3){
                    winner = Moves.O;
                    return true;
                }
            }
        }
        return emptyCount == 0;
    }

    private void GameOver(){
        if (winner != Moves.EMPTY){
            System.out.printf("%n Congratulations Player ");
            System.out.print(currentPlayer);
            System.out.printf("! You win. %n");
            return;
        }
        System.out.printf("%n  game is Tie (Draw)! Better luck next time %n");
    }
 //------------ Overriden_Methods -----------------
    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void restart() {
        super.restart();
    }
}








