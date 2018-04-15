import java.io.*;
public class Deserialization
{
	public static void main(String args[])
	{
		try 
		{
			Student object2;
			FileInputStream fis = new FileInputStream("serial");
			ObjectInputStream ois = new ObjectInputStream(fis);
			object2 = (Student)ois.readObject();
			ois.close();
			System.out.println("object2: " + object2);
  		}
catch(Exception e) 
		{
			System.out.println("Exception during deserialization: " + e);
			System.exit(0);
   		}
  }
}
 