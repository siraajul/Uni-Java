interface printable
{
	void print();
}
interface Showable
{
	void print();
}
class Testinterface3 implements printable, Showable
{
	public void print(){System.out.println("Hello Vishal");}
	public static void main(String[] args) 
	{
		Testinterface3 obj=new Testinterface3();
		obj.print();
	}
}