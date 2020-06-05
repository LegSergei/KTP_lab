
public class Task2_5 {
	public static void main(String[] args)
	{
		String s = args[0];
		System.out.println(Task2_5.getDecimalPlaces(s));
	}

	public static int getDecimalPlaces(String s)
	{
		int position = s.indexOf('.');
		if (position >= 0) 
		{
			return s.length() - position - 1;
		}
		return 0;
	}
}
