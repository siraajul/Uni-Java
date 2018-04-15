abstract class Person
{
	abstract void eat();
}
class TestAnonymousInner
{
	public static void main(String[] args) {
		Person p= new Person()
	{
	void eat(){System.out.println("nice food");}
};
p.eat();
}
}