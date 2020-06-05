
public class Task2_1 {
	public static void main(String[] args)
	{
		int n = Integer.valueOf(args[1]);
		String m = args[0];
		System.out.println(Task2_1.repeat(m, n));
	}

	public static String repeat(String s, int n)
	{
		String NewString = "";
		for (int i = 0; i < s.length(); i++)
		{
			for (int j = 0; j < n; j++)
			{
				NewString += s.charAt(i);
			}
		}
		return NewString;
	}

}
