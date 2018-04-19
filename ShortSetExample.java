import java.util.*;
public class ShortSetExample
{
	public static void main(String...a) 
	{
		Employee emp1=new Employee("cse","4");
		Employee emp2=new Employee("eee","5");
		Employee emp3=new Employee("mec","7");
	Set<Employee>treeSet=new Treeset<Employee>(new Comparator<Employee>()
	{
		public int compare(Employee o1,Employee o2)
		{
			return o1.name.compareTo(o2.name);
		}
	});
	treeSet.add(emp1);
	treeSet.add(emp2);
	treeSet.add(emp3);
System.out.println("treeSet:"+treeSet);
	}
}