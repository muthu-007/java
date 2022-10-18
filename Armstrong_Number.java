package practice.program;
import java.util.Scanner;
public class Armstrong_Number
{
static int no,count,temp,ans,a;

public static void findCount()
{
while(no>0)
{
count++;
no=no/10;
}
System.out.println(count);

}

public static void findAns()
{

while(a>0)
{
int b=a%10;
a=a/10;
int i=0;
int ansa=1;
while(i<count)
{
ansa= ansa*b;
i++;
}
ans = ans+ansa;

}
}

public static void main(String arg[])
{
Scanner scan = new Scanner(System.in);
no=scan.nextInt();
temp=no;
a=no;
findCount();


findAns();
if(ans==temp)
System.out.println("its an armstrong number");
else
System.out.println("not an armstrong number");
}
}

