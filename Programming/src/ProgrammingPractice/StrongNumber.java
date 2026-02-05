package ProgrammingPractice;

public class StrongNumber {
	public static void main(String[] args) {
		int num = 145;
		int sum =0;
		int temp =num;
		
		while(num!=0) 
		{
			int rem = num%10;
			int fact=1;
		
			for(int i=rem ;i>=1;i--) 
			{
				fact =fact*i;	
			}
			sum =sum+fact;
			num =num /10;
		}
		if(sum==temp) 
			{
			System.out.println("Strong Number");
			}
		else 
			{
			System.out.println("Not A Strong Number");
			}
		
	}

}
