package dtbatch1;
import java.util.*;

public class Mapping {
public static void main(String args[])
	{
		Map<String,String> m= new TreeMap<>();
		Scanner t= new Scanner(System.in);
		for(int i=0;i<10;i++)
		System.out.println(" Enter username and password ");
		m.put(t.nextLine(), t.nextLine());
		System.out.println( "Enter username and password ");
		String user= t.nextLine();
		String pass= t.nextLine();
		Set<String> s= m.keySet();
		for(String key:s)
		{
			if(key.equals(user))
			{
				if(m.get(key).equals(pass))
					System.out.println("Welcome");
				else
					System.out.println("Wrong pass");
			}
			else 
				System.out.println("Wrong user");
		}
		
	}
}
