package zohoPrograms;
import java.util.Scanner;
public class butterly {
public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	int count=scan.nextInt();
	String [] values= new String[count];
	for(int i=0;i<count;i++) {
		System.out.println("enter odd size word"+i);
		String a=scan.next();
		if(a.length()%2==1) {
			values[i]=a;
		}
		else {System.out.println("you entered even size word");
		System.exit(0);}
	}
	
	for(int i=0;i<count;i++) {
		String temp=values[i];
		int len= temp.length(),mid=len/2,mid2=mid-1,b=mid+1;
		
		for(int j=0;j<len;j++) {
			
			if(j<=mid) {
				b--;mid2++;
			for(int k=0;k<len;k++) {
				if(k==0||k==len-1) {
					System.out.print(temp.charAt(mid2));
					
				}
				else if(j>0 && (k==len-j-1||k==j)) {
					System.out.print(temp.charAt(b));
					
				}
				else {System.out.print(" ");
				}
			}
			System.out.println("");
			}
			else if(j>mid) {
				b++;mid2--;
				for(int k=0;k<len;k++) {
					if(k==0||k==len-1) {
						System.out.print(temp.charAt(mid2));
						
					}
					else if(j>0 && (k==len-j-1||k==j)) {
						System.out.print(temp.charAt(b));
						
					}
					else {System.out.print(" ");
					}
				}
				System.out.println("");
				}
			}
			}
		}

}
