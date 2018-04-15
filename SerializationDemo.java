import java.io.*;
public class SerializationDemo
{
	public static void main(String[] args) 
	{
		try{
				Student object1=new Student("Parvez",56,7.00);
				System.out.println("object1:"+object1);
				FileOutputStream fos=new FileOutputStream("serial.txt");
				ObjectOutputStream oos=new ObjectOutputStream (fos);
				oos.writeObject(object1);
				oos.flush();
				oos.close();
			}
		catch(IOException e){
			System.out.println("Exception during serialization:"+e);
			System.exit(0);
		}
	}
}