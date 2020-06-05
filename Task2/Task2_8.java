
public class Task2_8 {
	
	public static void main(String[] args)
	{
		String s1 = args[0];
		String s2 = args[1];
		System.out.println(Task2_8.isStrangePair(s1, s2));
	}

	public static boolean isStrangePair(String s1, String s2)
	{
		if (s1.charAt(0) == s2.charAt(s2.length()-1) && s2.charAt(0) == s1.charAt(s1.length()-1)) { return true; }
		return false;
	}

}
