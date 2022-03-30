import java.util.ArrayList;
public class ArrayListTest1
{
public static void main(String[] args)
{
ArrayList<String> list = new ArrayList<String>();
list.add("Red");
list.add("Yellow");
list.add("Blue");
System.out.println("Display the contents of Array List");
for(int y=0;y<list.size(); y++)
{
System.out.printf("%s\n", list.get(y));
}
list.clear();
System.out.println("no element will be displayed here " );
System.out.println("\nDisplay list:"+list);
list.add("Red");
list.add("Yellow");
list.add("Blue");
list.add("Orange");
list.add("Violent");
System.out.println("List "+list);
for(int z=0;z<list.size(); z++)
{
System.out.printf("%s\n", list.get(z));
}
list.remove(1);
list.remove(2);
list.remove(3);
System.out.println("Remove elements at index 1,2 and 3 :"+list);
list.add(1,"Green");
list.add(2,"Black");
list.add(3,"White");
System.out.println("Adding three elments at 1, and 3 index "+list);
System.out.printf("\"Green\" is %s in the list %n",list.contains("Green") ?"":"not");
int size = list.size();
System.out.printf("Size:%s\n",list.size());
System.out.println("Size" +size);
}
}
