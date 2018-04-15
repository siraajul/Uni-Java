interface Drawables 
{
	void draw();
	static int cube(int h){return h*h*h;}
}
class Circles implements Drawables
{
	public void draw(){System.out.println("Drawing Circle");}
}
class TestInterfaceStatic{
{
	Drawables d=new Circles();
	d.draw();
	System.out.println(Drawables.cube(3));
}
}