
public class Task2_7 {
	public static void main(String[] args)
	{
		String s = args[0];
		System.out.println(Task2_7.isValid(s));
	}

	public static boolean isValid(String s)
	{
		if (s.length() != 5) { return false; }
		for (int i = 1; i < 5; i++)
		{
			if (Character.isDigit(s.charAt(i)) == false) { return false; }
		}
		return true;
	}

}
