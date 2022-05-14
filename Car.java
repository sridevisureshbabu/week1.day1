package week1.day1;

public class Car {
	public void applyBreak()
	{
		System.out.println("Apply Break when you want to slow");
	}
	public void applyGear()
	{
		System.out.println("Apply gear when you want to speed up the car");
	}
public void switchOnAc()
{
	System.out.println("Running the AC allows the coolant to move around the system.");
}

public void applyAccelerate()
{
	System.out.println("Accelerator control the speed of the vechile");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar = new Car();
		myCar.applyBreak();
		myCar.applyGear();
		myCar.switchOnAc();
		myCar.applyAccelerate();
		
		
		

	}

}
