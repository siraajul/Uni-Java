import java.util.*;
class Car
{
	int fuel;
	static int mile=20;
	static in maxfuel=85;
	int max=21;

public int addFuel(int ltr)throws FuelTankFull
	{
		System.out.println("\nTank Check");
		throw new FuelTankFull("Tank is Full");
		return ltr;
	}

}			