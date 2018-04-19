import java.util.*;
public class ShortExample
{
	public static void main(String[] args) 
	{
		Set<Integer>tree=new TreeSet<Integer>(new Comparator<Integer>()
		{
			public int compare(Integer o1, Integer o2)
			{
				return o2.compareTo(o1);

			}
		});
		tree.add(1);
		tree.add(1);
		tree.add(1);
		System.out.println("TreeSet"+tree);	
	
	
	}
}