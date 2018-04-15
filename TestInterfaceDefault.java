interface Drawable 
{
	void draw();
	default void msg(){System.out.println("General Method");}
}
class Circle implements Drawable{
	public void draw(){System.out.println("Drawing Circle");}
}
class TestInterfaceDefault{
	public static void main(String[] args) {
		Drawable d=new Circle();
		d.draw();
		d.msg();
	}
}