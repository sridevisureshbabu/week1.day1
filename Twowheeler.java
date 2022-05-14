package week1.day1;

public class Twowheeler {
	int noOfWheels=2;
	short noOfMirrors=2;
	long chasIsNumber=537896532l;
	boolean isPunctured=false;
	String bikename="TVS";
	double runningkm=8769.67;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Twowheeler obj = new Twowheeler();
		int noOfWheels=3;
		System.out.println("No Of Wheels In TwoWheeler are: " + obj.noOfWheels);//Accessing global Variable
		System.out.println("No Of wheels In Twowheeler are:" + noOfWheels);//Accessing local Variable
		System.out.println("NO of Mirrors in Twowheeler are:" + obj.noOfMirrors);
		System.out.println("The Chasisnumber is:" + obj.chasIsNumber);
		System.out.println("Is the bike punctured:" + obj.isPunctured);
		System.out.println("Bikename:" + obj.bikename);
		System.out.println("Kilometersused:" + obj.runningkm);
		
		
		
		
		
		
		
		
				

	}

}
