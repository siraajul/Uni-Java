class TestMemberOuter1 
{
private int data=344;
class Inner
{
	void msg() {System.out.println("Data is "+data);}
}
public static void main(String args[])
{
	TestMemberOuter1 obj=new TestMemberOuter1();
	TestMemberOuter1.Inner in=obj.new Inner();
	in.msg();
}
}
