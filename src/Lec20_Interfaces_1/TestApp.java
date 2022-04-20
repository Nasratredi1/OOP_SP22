package Lec20_Interfaces_1;

import java.util.ArrayList;

public class TestApp {
    public static void main(String[] args) {
       // Walkable walkable = new Robot();
       // proceedWalking(walkable);
        // you may take reference in any type might be parent or child.
//        Robot robot = new Robot();
//        proceedWalking(robot);

        // Human object
        Walkable walkable = new Human();
        //proceedWalking();

        // You may create an arraylist
        ArrayList<Walkable> walkableArrayList  = new ArrayList<>();

        walkableArrayList.add(walkable);
        walkableArrayList.add(new Robot());
        walkableArrayList.add(new Human());

        proceedWalking(walkableArrayList);


    }
    static void proceedWalking (ArrayList<Walkable> walkableArrayList){
        for(Walkable walkable : walkableArrayList)
        walkable.walk();
    }
}

/*
SO, for you may have observed, its inheritance that make
the polymorphism possible but what if we have to
process objects polymorphically even when they do not belong
to same hierarchy. Interface are the answer to this problem.

* We may need to process some object in-general because they share
some behaviour but not the state.

For ex:
       Human and Robot may walk but they are different entities and
       may belong to different inheritance hierarchies.
       * Invoice and Employee are two different entities but both share payable
       behaviour.

   if inheritance is not possible but there is some behavious
   between that. in this place we used interface.

 */
