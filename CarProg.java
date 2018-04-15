class FuelTankFull extends Exception
{
}
class NotSufficientFuel extends Exception
{
}
class Car
{
 int fuel;
 final int speed=20;
 final int maxfu=400;
 public void addFuel(int ltr) throws FuelTankFull,NotSufficientFuel
 {
   if(ltr<maxfu)
    throw new FuelTankFull();
   if(ltr=0)
    throw new NotSufficientFuel();
 }
}
class CarProg
{
  public static void main(String args[]) throws FuelTankFull,NotSufficientFuel
  {
    Car d=new Car();
    int x;
    Scanner st=new Scanner(System.in);
    System.out.println("fuel amount");
    x=st.nextInt();
try
{
  d.addFuel(x);
}
catch(FuelTankFull e)
{
  System.out.println("Tank is Full");
}
catch(NotSufficientFuel e)
{
   System.out.println("Tank is empty");
}


}
}