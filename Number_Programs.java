package practice.program;
import java.util.Scanner;
import java.lang.Math;
public class Number_Programs{
	
	 static Scanner scan = new Scanner(System.in);
//method for primenumbers
      public void primeNumbers()
      {
         System.out.println("Enter a number to find prime or not ");
        int no,div=0;
      
        no = scan.nextInt();

        for(int i=2;i<no;i++)
        {
         div = no%i;
  
            if(div==0)
               System.out.println("its not an prime number");
            break;

        }

         if(div>0)
             System.out.println("its an prime number");

        }

//method for divisors
       public void countDivisors()
        {
           System.out.println("Enter a number to find divisors");
           int no,count=0;
          
           no = scan.nextInt();

           for(int i=1;i<=no;i++)
          {
           if(no%i==0)
           {
           System.out.println(i);
           count++;
           }

          }
          System.out.println("number of divisors"+ count);
        }

//method for factorial
        public void factorial()
         {

           System.out.println("Enter a number to find factorial");
           int no,count=1;
           
           no = scan.nextInt();

           for(int i=no;i>0;i--)
            {
               count = count*i; 
            }

              System.out.println(count);

          }
        
        //binary to decimal
        public void binaryToDecimal(){

            System.out.println("Enter a number to Binary To Decimal");
            int no,pow=0,rem=0;int ans=0;
           
            no = scan.nextInt();
            while(no>0)
            {
            	rem=no%10;
            	no=no/10;
            	ans += rem*Math.pow(2, pow);
            	pow++;
            	}
            System.out.println(ans);
            
        	
        }
        
        //Fibonacci series
        public void fibonacciSeries()
        {  int no,first=-1,second=1,ans=0;

            System.out.println("Enter a number ");
            no=scan.nextInt();
            while(ans<no)
            {
            	ans=first+second;
            	second +=first;
            	first=second-first;
            	
            	System.out.println(ans);
            }
            
        } 

//main method
          public static void main(String args[])
           {
              Number_Programs obj = new Number_Programs();
             obj.primeNumbers();
             obj.countDivisors();
             obj.factorial();
             obj.binaryToDecimal();
             obj.fibonacciSeries();
           }

      }
