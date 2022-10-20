package practice_programs.practice.program;
import java.util.Scanner;
public class ZohoProgram {
	 int arraySize,gap;
	int arr[] = new int[arraySize];
	
	public void getInput() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size");
		arraySize = scan.nextInt();
		 int arr[] = new int[arraySize];
		System.out.println("Enter array values");

		for(int i=0;i<arraySize;i++) {
			
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Enter Gap");
		gap = scan.nextInt();
		
		if(gap<arraySize) {
		
			for(int i=0;i<gap;i++)
		      {int sum=0;
			for(int j=i;j<arraySize;j+=gap) {
				
				sum += arr[j]; 
			}
			System.out.println(sum);
		      }}
		else
				System.out.println("Enter a number less than arraysize");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZohoProgram obj1 = new ZohoProgram();
    obj1.getInput();
    
    
	}

}
