package zohoPrograms;

import java.util.Scanner;

public class Program3 {
	
	public static void SortingGivenArray(int arr[]) {
		for(int i=0;i<arr.length;i+=2) {
			for(int j=0;j<arr.length;j+=2) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
			for(int k=1;k<arr.length;k+=2) {
				for(int l=1;l<arr.length;l+=2) {
					if(arr[k]<arr[l]) {
						int temp=arr[k];
						arr[k]=arr[l];
						arr[l]=temp;
					}
				}
		}
			for(int m=0;m<arr.length;m++) {
				System.out.println(arr[m]);
			}
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int arrSize = scan.nextInt();

		int arr[] = new int[arrSize];
		
		for(int i=0;i<arrSize;i++) {
			arr[i]= scan.nextInt();
		}
		 SortingGivenArray(arr);
	}

}
