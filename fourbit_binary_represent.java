/* The program must accept an integer N as the input. The program must print the 4-bit binary
representation of each digit in N as the output.
Boundary Condition(s):
1 <= N <= 10^15
Input Format:
The first line contains the integer N.
Output Format:
The lines contain the 4-bit binary representation of each digit in N.
Example Input/Output 1:
Input:
4653
Output:
0100
0110
0101
0011
Explanation:
The 4-bit binary representation of the first digit in 4653 is 0100.
The 4-bit binary representation of the second digit in 4653 is 0110.
The 4-bit binary representation of the third digit in 4653 is 0101.
The 4-bit binary representation of the fourth digit in 4653 is 0011.
Example Input/Output 2:
Input:
102
Output:
0001
0000
0010  

--------------------------------------------------------------------------------------------------------------------------------------------------------
********************************************************************************************************************************************************
--------------------------------------------------------------------------------------------------------------------------------------------------------
*/
import java.util.*;

class Hello {

    public static void main(String[] args) {
		//Your Code Here
		
		Scanner sc =new Scanner(System.in);
		String s1="000";
		String s2="00";
		String s3="0";
		long num=sc.nextLong();
		long res=0;
		long r1;
		while(num!=0)
		{
		    r1=num%10;
		    res=res*10+r1;
		    num=num/10;
		}
		
		
		long n=res;
		long d,d1;
		String result;
		
		String rev="";
		String rev1="";
		while(n!=0)
		{
		    d=n%10;
		    while(d!=0)
		    {
		        d1=d%2;
		        //System.out.print(d1);
		        rev=rev+d1;
		        d=d/2;
		    }
		    n=n/10;
		    //System.out.print(rev);
		    int len=rev.length();
		    for(int i=len-1;i>=0;i--)
		    {
		        rev1=rev1+rev.charAt(i);
		    }
		    //System.out.print(rev1);
		
		    int len1=rev1.length();
		    switch(len1)
		    {
		        case 1:
		            System.out.print(s1+rev1);
		            break;
		        case 2:
		            System.out.print(s2+rev1);
		            break;
		        case 3:
		            System.out.print(s3+rev1);
		            break;
		        case 4:
		            System.out.print(rev1);
		            break;
		        default:
		            System.out.print("0000");
		            break;
		    }
		    rev="";
		    rev1="";
		    
		    
		    System.out.println("");
		}
		
		

	}
}