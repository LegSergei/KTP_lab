
public class Task4_3 {
	
	public static void main(String[] args) 
	{
		String s = args[0];
		if (s.indexOf("_") != -1) 
		{
			System.out.printf("CamelCase: " + toCamelCase(s));
		}
		else 
		{
			System.out.printf("SnakeCase: " + toSnakeCase(s));
		}
	}

	public static String toCamelCase(String s) 
	{
		String itog = "";
		char[] char_mass = s.toCharArray();
		for (int i = 0; i < char_mass.length; i++) 
		{
			if (String.valueOf(char_mass[i]).equals("_") == true) 
			{
				char_mass[i+1] = Character.toUpperCase(char_mass[i + 1]);
				continue;
			}
			itog += String.valueOf(char_mass[i]);
		}
		return itog;
	}


	public static String toSnakeCase(String s) 
	{
		String itog = "";
		char[] char_mass = s.toCharArray();
		for (int i = 0; i < char_mass.length; i++) 
		{
			if (Character.toUpperCase(char_mass[i]) == char_mass[i]) 
			{
				itog += "_";
				itog += String.valueOf(Character.toLowerCase(char_mass[i]));
				continue;
			}
			itog += String.valueOf(char_mass[i]);
		}
		return itog;

	}

}
