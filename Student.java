import java.io.*;
class Student implements Serializable
{
	String name;
	int id;
	double d;
public Student(String name,int id,double d){
	this.name=name;
	this.id=id;
	this.d=d;
}
public String toString()
       {
       	return "name="+name+";id="+id+";d="+d;
       }
}