
public class Task2_9 {

	public static void main(String[] args) {
		if (Character.toString(args[1].charAt(0)).equals("-")){
			System.out.println(isSuffix(args[0], args[1]));
		}
		else {
			System.out.println(isPrefix(args[0], args[1]));
		}
	}


	public static boolean isPrefix(String s1, String s2) 
	{
		s2 = s2.replace("-", "");
		for (int i = 0; i < s2.length(); i++) 
		{
			if (s1.charAt(i) == s1.charAt(i)) {}
			else { return false; }
		}
		return true;
	}


	public static boolean isSuffix(String s1, String s2) 
	{
		s2 = s2.replace("-", "");
		int Rast = s1.length() - s2.length();
		for (int i = Rast; i < s1.length(); i++) 
		{
			if (s2.charAt(i - Rast) == s1.charAt(i)) {}
			else { return false; }
		}
		return true;
	}
}
