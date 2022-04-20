package Lec20_Interfaces_1;

public class Robot extends Machine implements Walkable{
    @Override
    public void walk() {
        System.out.println("Logic of walk for robot...");
    }
}
