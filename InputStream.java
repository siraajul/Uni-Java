import java.io.*;
public class InputStream {
public static void main(String arg s[]) throws IOException{
FileInputStream fis = null;
int i=0;
char c;
try
{
fis = new FileInputStream("test.txt");
while((i=fis.read())!=-1)
{
c=(char)i;
System.out.print(c);
}
}

catch(FileNotFoundException ex) {
System.out.println("File not found");}
finally{if(fis!=null)
fis.close();
}
}
}
 
