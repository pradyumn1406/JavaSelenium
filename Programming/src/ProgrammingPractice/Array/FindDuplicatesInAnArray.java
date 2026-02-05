package ProgrammingPractice.Array;

import java.util.Arrays;

public class FindDuplicatesInAnArray {
	public static void main(String[] args) {
		int[] arr = {1,2,2,3,5,3,6,7};
		
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j =i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicates element : "  + arr[i]);
				}
			}
		}	
	}
}
