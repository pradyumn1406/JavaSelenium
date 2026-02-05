package ProgrammingPractice;

import java.util.Arrays;

public class CategorizedSort {

	public static void main(String[] args) {
		
		String str = "1!SDERTer@#$%^&*(bB";
		
		// 1. Convert and Sort using your logic
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);		
		
		// 2. Create buckets for each category
		 StringBuilder order = new StringBuilder();
		 StringBuilder specialChar = new StringBuilder();
		 StringBuilder upperCase = new StringBuilder();
		 StringBuilder lowerCase = new StringBuilder();
		 int Ocount=0,sCount=0,uCount=0,lcount=0;

		 
		// 3. Categorize the sorted characters
		 
		 for(char ch:charArray) 
		 {
			 if(Character.isDigit(ch)) {
				 order.append(ch);
				 Ocount++;
			 }
			 else if(Character.isUpperCase(ch)) {
				 upperCase.append(ch);
				 uCount++;
			 }
			 else if(Character.isLowerCase(ch)) {
				 lowerCase.append(ch);
				 lcount++;
				 
			 }else {
				 specialChar.append(ch);
				 sCount++;
			 }
	
		 }
		 
		// 4. Print the final result
	        System.out.println("Order : " + order + " Count of Order: " + Ocount);
	        System.out.println("Special character : " + specialChar +  " Count of Special Charater: " + sCount);
	        System.out.println("Uppercase : " + upperCase + " Count of Uppercase: "+ uCount);
	        System.out.println("Lowercase : " + lowerCase + " Count of Lowercase: " + lcount);

		 
	}

}
