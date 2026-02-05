package ProgrammingPractice;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Java is a high level";
		String rev = "";
		
		//Method 1
		for (int i = str.length()-1 ; i>=0 ; i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Using For-loop : "+rev);
		
		//Method 2
		StringBuffer str1	= new StringBuffer(str);
		System.out.println("Using String Buffer : "+str1.reverse());
	
		//Method 3
		StringBuilder str2= new StringBuilder(str);
		System.out.println("Using String Builder: "+ str2.reverse() );
	}
}
