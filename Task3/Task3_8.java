
public class Task3_8 {

	public static void main(String[] args) 
	{
		String s = args[0];
		System.out.println(Task3_8.longestZero(s));
	}
	public static String longestZero(String s)
	{
		int Flag = 0;
		String A = "";
		String B = "";
		Character zero = '0';
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == zero) 
			{ 
				B += s.charAt(i);
				Flag = 0;
				continue;
			}
			else
			{
				Flag = 1;
			}
			if (Flag == 1)
			{
				if(A.length()< B.length())
				{
					A = B;
					B = "";
				}
				else
				{
					B = "";
				}
			}
		}
		return A;
	}
}
