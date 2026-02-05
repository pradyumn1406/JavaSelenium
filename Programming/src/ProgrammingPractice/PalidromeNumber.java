package ProgrammingPractice;

public class PalidromeNumber {
	public static void main(String[] args) {
		int num=12121, rev = 0,temp;
		temp = num;
		while(num>0) {
			int remainder = num%10;
			rev= (rev*10)+remainder;
			num=num/10;
			
		}
		if(temp==rev) {
			System.out.println("Palidrome");
		}else {
			System.out.println("Not Palidrome");
		}
	}

}
