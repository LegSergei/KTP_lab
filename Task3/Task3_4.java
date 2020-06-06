
public class Task3_4 {

	public static void main(String[] args) 
	{
		String s = args[0];
		System.out.println(flipEndChars(s));
	}
	
	public static String flipEndChars(String s)
	{
		if (s.length() <= 2) { return "Несовместимо"; }
		if (s.charAt(0) == s.charAt(s.length() - 1)) { return "Два - это пара"; }
		char char1 = s.charAt(0);
		char char2 = s.charAt(s.length() - 1);
		char[] charmass = s.toCharArray();
		charmass[0] = char2;
		charmass[s.length() - 1] = char1;
		String itog = "";
		for (int i = 0; i < charmass.length; i++)
		{
			itog += String.valueOf(charmass[i]);
		}
		return itog;
	}
}
