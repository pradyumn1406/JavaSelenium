package ProgrammingPractice;

public class PrimeNumber {
	
	
/*	Method 1
   public static void main(String[] args) {
		int num = 5;
		int count=0;
		
		for(int i =1;i<=num;i++) 
		{
			if(num%i==0)
			{
				count++;
			}
			
		}
		if(count==2) 
		{
			System.out.println("Prime");
		}else 
		{
			System.out.println("Not Prime");
		}
	}
	
	
	Method 2
	public static void main(String[] args) {
		int n = 13;
		if(isPrime(n)) System.out.println("Prime");
		else System.out.println("Not Prime");
		
	}
	
	public static boolean isPrime(int number) {
		int count=0;
		
		if(number ==0 || number ==1)
		{
			return false;
		}
		for(int i =1; i<=number;i++) 
		{
			if(number%i==0)
			{
			count++;	
			}
		}
		return count==2;
	}*/
	
	public static void main(String[] args) {
		int lowerR =1;
		int higherR =20;
		
		for(int i =lowerR; i<=higherR;i++)
		{
			int count =0;
			for(int j =1;j<=i;j++) 
			{
				if(i%j==0) 
				{
					count++;
				}
			}
			if(count ==2) 
			{ 
				System.out.println(i);
			}
		}
		
	}
}
