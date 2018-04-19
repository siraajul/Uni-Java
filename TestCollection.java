import java.util.*;
public class TestCollection
{
	public static void main(String[] args) 
	{
			ArrayList<String>al=new ArrayList<String>();
			al.add("Kalyan");
			al.add("Ajay");
			al.add("Vishal");
			al.add(I,"Parvez");
		System.out.println("element 2nd position"+al.get(2));
		ListIterator<String>itr=al.ListIterator();
		System.out.println("traversing elements in forward direction..");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(itr.next);
	}
	System.out.println("traversing elements in backward direction...");
		while (itr.hasPrevious()) 
		{
			System.out.println(itr.previous());
		}
}