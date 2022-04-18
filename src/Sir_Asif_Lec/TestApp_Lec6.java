package Sir_Asif_Lec;

public class TestApp_Lec6 {
    public static void main(String[] args) {
      //  Student_Lec6 std = new Student_Lec6();

//        std.id = 1;
//        std.name = "Redi";
//        std.marks1 = 75;
//        std.marks2 = 80;

        // methodName pass the object name
      // dosomething(std);

  // can access to methods by using . operator and we assign to average.
       // double average = std.calculateAverage();
          //System.out.println(average);

        // Rectangle class
        Rectangle rect = new Rectangle();
        rect.length = 3;
        rect.width = 4;
        System.out.println(rect.calculateArea());
        System.out.println(rect.calculatePerimeter());
    }
    // pass the reference of the objects.
    public static void dosomething (Student_Lec6 s) {
        System.out.println(s.calculateAverage());
    }


}


  /* this is not a good approach that must did. abviously the result / output is same.
        double average = std.calculateAverage(80,75);
        System.out.println(average);


        Instance varible mean: y sirf wo class ki instance kelye banaya han. ya object kelye.
        e exist karta han until object refernce is exist.

        Jo method ki andar jo varible hum define karty han osko hum local varible kehty han.
        when we call to method  they maked it when method body is finished then they destroyed.

         */