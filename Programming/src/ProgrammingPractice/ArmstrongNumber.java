package ProgrammingPractice;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int n =153 ,temp=n,sum=0;
		
		//Step 1
		//String.valueOf(n): This takes your integer (e.g., 153) and turns it into a String (e.g., "153"). 
		int digits = String.valueOf(n).length();
		
		//Step 2
		while(temp>0) 
		{
			int lastdigit = temp%10; 			// Get the last digit (e.g., 3)
			sum += Math.pow(lastdigit, digits); // Power it and add to sum
			temp = temp/10; 					// Remove the last digit
		}
		
		//Step 3
		if(sum==n) {
			System.out.println(n + "is an Armstrong Number");
		}else {
			System.out.println(n + "is not an Armstrong Number");
		}
		
	}

}
