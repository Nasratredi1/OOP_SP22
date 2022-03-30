import java.util.ArrayList;
public class ArrayListTest2
{
public static void main(String[] args)
{
ArrayList<String> my = new ArrayList<String>();
my.add("Arslan");
my.add("Subhan");
my.add("Ziya");
my.add("Zubair");
my.add("Akbar");
my.add("Sultan");
my.add("Salman");
my.add("Azlan");
my.add("Ijaz");
my.add("hassaan");
System.out.println("The objects in ARrayList are " +my);
my.clear();
System.out.println("we have clear all the objects so nthing will be displayed "+my);
my.add("Arslan");
my.add("Subhan");
my.add("Ziya");
my.add("Zubair");
my.add("Akbar");
my.add("Sultan");
my.add("Salman");
my.add("Azlan");
my.add("Ijaz");
my.add("hassaan");
System.out.println("Displaying the contents of Array list by Loop");
for(int x=0;x<my.size();x++)
{
System.out.printf("%s\n",my.get(x));
}
System.out.println("Display the contents of the Array list by enhanced for loop: " +my);
my.add("Hasham");
my.add("Sunny");
my.add("Faysal");
my.add("Nouman");
System.out.println("Displaying the contents of the Array list with 3 newobjects are added to it \n" +my);
my.remove(1);
my.remove(2);
my.remove(3);
System.out.println("now we remove three objects from the list at the index 1,2 and 3");
System.out.println("after removing three objects the Array List is " +my);
my.add(1,"Shehroze");
my.add(2,"Mubashir");
my.add(3,"Luqman");
System.out.println("now we add three more objects in to the index 1,2 and 3 of the Array list");
System.out.println("After adding this three objects the ArrayList is " +my);

int ind = my.indexOf(5);
System.out.println("return the index of the Array List " +ind);

}
}
 

