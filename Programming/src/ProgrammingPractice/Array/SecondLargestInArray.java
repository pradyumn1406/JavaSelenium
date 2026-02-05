package ProgrammingPractice.Array;

import java.util.Arrays;

public class SecondLargestInArray {
public static void main(String[] args) {
	int [] arr = {10,5,20,8,15};
		
	int largest = Integer.MIN_VALUE;
	int secondLargest =Integer.MIN_VALUE;
	int thirdLargest= Integer.MIN_VALUE;
	
	for(int i=0; i <arr.length;i++)
	{
		if(arr[i]>largest) {
			secondLargest =largest;
			largest=arr[i];
		}else if(arr[i]> secondLargest && arr[i]!=largest){
			thirdLargest = secondLargest;
			secondLargest =arr[i];
		}else if(arr[i]>thirdLargest && arr[i]!=largest&&arr[i] != secondLargest) {
			thirdLargest = arr[i];
		}
	}
	
	    System.out.println(largest);
		System.out.println(secondLargest);
		System.out.println(thirdLargest);

		
	
	}
}
