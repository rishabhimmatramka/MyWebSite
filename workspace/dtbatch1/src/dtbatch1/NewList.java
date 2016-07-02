package dtbatch1;
import java.util.*;
//import java.util.List;

public class NewList {
/**
 * @param args
 */
public static void main(String args[]){
	
	Scanner t= new Scanner(System.in);
	List<String> l = new ArrayList<String>();
	for(int i=0; i<4; i++)
		{
			l.add(t.nextLine());
		}
	System.out.println("Enter name for 3rd Position");
	String newName= t.nextLine();
	l.add(2, newName);
	for(Object a: l)
	{
		System.out.println(a);
	}
	}
}
