package zohoPrograms;

import java.util.Scanner;

public class StringsContainsOnlyIntegerOrNot {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String value = scan.next();
		boolean ans= true;
		for(int i=0;i<value.length();i++) {
			int a= value.charAt(i);
			if((a>=48)&&(a<=57)) {
				continue;
			}
			else {
				ans = false;
				System.out.println(value + ans);
				break;
			}
		}if(ans) {System.out.println(value + ans);}
	}
}
