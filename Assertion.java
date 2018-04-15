import java.util.Scanner;
class Assertion {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your Sallary");
		int value= scanner.nextInt();
		assert value>=500:"Not Valid";
		System.out.println("Salary is\n"+value);
	}

}
