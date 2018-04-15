interface printable {
	void print();
}
class Av implements printable
{
	public  void print(){
		System.out.println("HI PARVEZ");

	}
	public static void main(String args[]) {
		Av obj = new Av();
		obj.print();
		
	}
}