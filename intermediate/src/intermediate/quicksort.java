package intermediate;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class quicksort {
	private static Scanner sc;
	
	public static void main(String args[]) {
		long startTime = System.nanoTime();
		sc = new Scanner(System.in);
		
		
		System.out.println("Enter No. of terms");
		int n = sc.nextInt();
		
		System.out.println("Enter the terms");
		int arr[]=new int[n];
		
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
			System.out.println("\nThe unsorted Array is: ");
			System.out.println(Arrays.toString(arr));
		
			sort(arr, 0, arr.length - 1);
			
			System.out.println("\nThe Sorted Array is: ");
			System.out.println(Arrays.toString(arr));
			
			long endTime= System.nanoTime();
			
			long timeElapsed = endTime -startTime; 
			
			long milliSeconds = timeElapsed/1000000;
			
			System.out.println("\n\n\n\n Execution time: "+ milliSeconds/1000 +" "+"seconds");
	}
		
		 static void sort(int arr[],int start, int end) {
			if(start<end) {
				int pIndex= partition(arr,start,end);
				sort(arr,start, pIndex-1);
				sort(arr,pIndex+1,end);
			}
		}
		
		static int partition(int arr[],int start, int end) {
			int pivot = arr[end];
			int pIndex=start;
			for(int i=start;i<end;i++) {
				if(arr[i] <= pivot) {
					swap(arr,i,pIndex);
					pIndex++;
				}
			}
			swap(arr,pIndex,end);
			return pIndex;
		}
		
		static void swap(int arr[],int x, int y) {
			int temp = arr[x];
			arr[x]=arr[y];
			arr[y]=temp;
		}
		
	}

