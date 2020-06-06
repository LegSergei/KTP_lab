import java.util.*;

public class Task4_2 {
	
	public static void main(String[] args) 
	{
		String s = args[0];
		System.out.println(split(s));
	}


	public static List<String> split(String skobki) 
	{
		List<String> itog = new ArrayList<String>();
		String s = "";
		int balance = 0;
		char[] char_mass = skobki.toCharArray();
		for (int i = 0; i < char_mass.length; i++ ) 
		{
			if (String.valueOf(char_mass[i]).equals("(")) 
			{
				s += "("; 
				balance += 1;
			}
			else 
			{
				s += ")";
				balance -= 1;
			}
			if (balance == 0)
			{
				itog.add(s);
				s = "";
			}
		}
		return itog;
	}

}
