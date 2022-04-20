package Lec_17_Enumuration;

public class WhyEnumExample1Solution {
    public static void main(String[] args) {
        Cities city = Cities.LAHORE;
        System.out.println(city.name());
        System.out.println("Area = " + city.getArea());

        GameStatus status = startGame();

        //GameStatus[] gameStatuses = GameStatus.values();
        for (Days day : EnumSet.range(Days.WEDNESDAY, Days.FRIDAY)) {
            System.out.println(day);
        }

        switch (status) {
            case WON:
                System.out.println("Player won the game");
                break;
            case LOST:
                System.out.println("Player loss the game");
                break;
            case DRAW:
                System.out.println("Game draw");
        }
    }

    public static GameStatus startGame() {
        GameStatus status;
        status = GameStatus.WON;
        return status;
    }
}
