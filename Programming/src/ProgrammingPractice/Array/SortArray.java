package ProgrammingPractice.Array;

public class SortArray {
	public static void main(String[] args) {
//		int[] arr = {4,3,2,1};
//		int temp;
//		System.out.println("Sorted Array");
//		for(int i =0 ;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				
//				if(arr[i] > arr[j]) {
//					temp=arr[i];
//					arr[i] =arr[j];
//					arr[j]=temp;
//					
//				}
//				
//			}
//			System.out.print(arr[i] + " ");
//
//		}
//	}

		        int[] arr = {5, 2, 8, 1, 3};
		        int i = 0, j, temp;

		        do {
		            j = i + 1;
		            do {
		                if (arr[i] > arr[j]) {
		                    temp = arr[i];
		                    arr[i] = arr[j];
		                    arr[j] = temp;
		                }
		                j++;
		            } while (j < arr.length);

		            i++;
		        } while (i < arr.length);
		        System.out.println(arr[i]);

//		        System.out.println("Sorted Array:");
//		        for (int k = 0; k < arr.length; k++) {
//		            System.out.print(arr[k] + " ");
//		        }
		    }
		}

	


