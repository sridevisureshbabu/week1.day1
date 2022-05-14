package week1.day1.assignments;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber,secondNumber,sum;
		firstNumber=0;
		secondNumber=1;
	
		
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		for(int i=1;i<7;i++)
		{
			sum=firstNumber+secondNumber;
			System.out.println(sum);
			firstNumber=secondNumber;
			secondNumber=sum;
			
			
			
			
			
		}

	}

}
