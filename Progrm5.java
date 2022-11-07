package zohoPrograms;

public class Progrm5 {
	public static void mergeNonRepetedArray(int a[],int b[]) {
		int size = a.length + b.length;
		int arr3[] = new int[size];
		int arr4[] = new int[size];
		int count=0,size2=0;
		for(int i=0; i<=a.length-1;i++)
		{
			arr3[i]=a[i];
			
		}
		for(int j=a.length; j<=arr3.length-1;j++)
		{
			arr3[j]=b[count];
			count++;
		}
		
		
		
		for(int k=0; k<=arr3.length-1;k++)
		{

			for(int n=0; n<=arr3.length-1;n++)
			{
				if(arr3[k]<arr3[n]) {
					int temp=arr3[k];
					arr3[k]=arr3[n];
							arr3[n]=temp;
							
				}
					
			}
			
			
		}
		
		for(int p=0; p<arr3.length-1;p++)
		{
			if(arr3[p]!=arr3[p+1]) {
				arr4[size2++]=arr3[p];
						
			}
			}
		arr4[size2]=arr3[size-1];	
		
		for(int p=0; p<=size2;p++)
		{
			System.out.println(arr4[p]);
			}
			
}
	
	
	public static void main(String[] args) {
		int arr1[]= {2,4,5,6,7,9,10,13};
		int arr2[]= {2,3,4,5,6,7,8,9,11,15};
		mergeNonRepetedArray(arr1,arr2);
		
}
	}
