class IPL
{
	String name,wck alrnd,cpt;
	IPL(String name,String wicket,String allround,String captain);
	{
		name=names;
		wck=wicket;
		alrnd=allround;
		cpt=captain;
	}
	private Player
	{
		String pname;
		Integer price;
		Player(String playername,Integer pricee);
		{
			pname=playername;
			price=pricee;
		}
	}
	Player obj4=new Player("Vicky",120000);
	Player obj5=new Player("Vikash",150000);
	Player obj6=new Player("Varun",90000);
	public void display()
	{
		System.out.println(name+"\t"+wck+"t"+alrnd+"\t"+cpt+"\t");

	}
	class main
	{
		public static void main(String[] args) 
		{
			TreeSet ts= new TreeSet((x,y)->y.price.compareTo(x.price));
			IPL obj1=new IPL("Sakib","Dhoni","Umesh","Rahul");	
			IPL obj2=new IPL("Koli","Fizz","Mash","Tamim");
			IPL obj3=new IPL("Mushi","Rubel","Kartik","Ashraful");
			ts.add(obj1);ts.add(obj2);ts.add(obj3);

			Iterator i=ts.iterator();
			while(i.hasNext())
			{
				IPL t=i.next();
				t.display();
				break;
			}


		}
	}
}