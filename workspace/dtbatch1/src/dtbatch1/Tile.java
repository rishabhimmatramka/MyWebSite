package dtbatch1;
import java.util.*;

public class Tile {
public static void main(String args[]){
	System.out.println(" Enter the dimensions of your room ");
	Scanner t= new Scanner(System.in);
	int i= t.nextInt();
	int j= t.nextInt();
	double price=0; double cost=0; double orgPrice=0; 
	for (int k=0; k<i; k++)
	{
		for (int m=0; m<j;m++)
		{
			if(k==0 && m==0)
				cost=1;
			else if(k==0 && m== j-1)
				cost=1;
			else if(k==i-1 && m== 0)
				cost=1;
			else if(k==i-1 && m== j-1)
				cost=1;
			else if(k==0 || m==0 || k== i-1 || m== j-1)
				cost=1.5;
			else 
				cost= 2;
			orgPrice = orgPrice + cost;
		}
	}
	for(int p=0; p< i*j; p++)
	{
		System.out.println("Enter the position of next tile");
		int i1= t.nextInt();
		int j1= t.nextInt();
		if(i1==0 && j1==0)
			cost=1;
		else if(i1==0 && j1== j-1)
			cost=1;
		else if(i1==i-1 && j1== 0)
			cost=1;
		else if(i1==i-1 && j1== j-1)
			cost=1;
		else if(i1==0 || j1==0 || i1== i-1 || j1== j-1)
			cost=1.5;
		else 
			cost= 2;
		price = price + cost;
	}
	System.out.println(" Original price of tiling is " + orgPrice );
	System.out.println( " Your arrangement costs " + price );
	if ((orgPrice-price)>0)
		System.out.println(" You need pay additional amount of " + (orgPrice-price));
	else
		System.out.println(" You will be given back an amount of " + (orgPrice-price));
}
}
