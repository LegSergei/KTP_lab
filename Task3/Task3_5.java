
public class Task3_5 {
	
	public static void main(String[] args) 
	{
		String s = args[0];
		System.out.println(isValidHexCode(s));
	}
	
	public static boolean isValidHexCode(String s)
	{
		if (Character.toString(s.charAt(0)).equals("#") == false) { return false; }
		if (s.length() != 7) { return false; }
		String code = "0123456789ABCDEF";
		String s1 = s.toUpperCase();
		for (int i = 1; i < 7; i++)
		{
			if (code.indexOf(s1.charAt(i)) == -1) { return false; }
		}
		return true;
	}
}
