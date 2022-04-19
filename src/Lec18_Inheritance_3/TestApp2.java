package Lec18_Inheritance_3;

public class TestApp2 {
    public static void main(String[] args) {

        /* if it's exist in parent then you can access it.
        Rectangle shape = new Rectangle(1,2,3)

        System.out.println(shap e.getLength());

         */
          Shape shape = new Rectangle(1,3,4);
         //can't access give an error. for this you must typecast and reference it.
        Rectangle r = (Rectangle) shape;
         //System.out.println(shape.getLength()); // give erro
        // now you can access it through reference which is r.
        System.out.println(r.getLength());





    }
}
