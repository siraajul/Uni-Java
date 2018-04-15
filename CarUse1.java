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
class CarUse1
{
  public static void main(String args[]) throws FuelTankFull,NotSufficientFuel
  {
    Car d=new Car();
    int x;
    Scanner st=new Scanner(System.in);
    System.out.println("fuel amount");
    x=st.nextInt();
catch
{
  d.addFuel(x);
}
throw(FuelTankFull e)
{
  System.out.println("Tank is Full");
}
throw(NotSufficientFuel e)
{
   System.out.println("Tank is empty");
}


}
}