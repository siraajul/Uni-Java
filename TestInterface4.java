interface  printable 
{
	void print();
}
interface Showable extends printable 
{
	void show();
}
class TestInterface4 implements Showable
{
	public void print(){System.out.println("Bangladeshi");}
	public void show(){System.out.println("Non-veg");}
	public static void main(String[] args) {
		TestInterface4 obj=new TestInterface4();
		obj.print();
		obj.show();
	}
}