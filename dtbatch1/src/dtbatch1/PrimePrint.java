package dtbatch1;
import java.util.*;
public class PrimePrint {
public static void main(String args[]){
	 
	Scanner t= new Scanner(System.in);
	int num= t.nextInt();
	if(num>=3)
	{ 
		for(int i=3;i<=num;i++)
		{
			int k=1;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					k=0;
			}
			if(k==1)
			{
				System.out.println(" prime number is " + i);
			}
		}
	}
	if(num==2)
		System.out.println(" Only one prime number which is 2 ");
	if(num == 1)
		System.out.println(" neither prime nor composite ");
}
}
