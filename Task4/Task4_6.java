
public class Task4_6 {
	
	public static void main(String[] args) 
	{
		int a = Integer.valueOf(args[0]);
		System.out.println(bugger(a));
	}
	
	public static int bugger(int a) 
	{
		String s = String.valueOf(a);
		int chislo = 1;
		int count = 0;
		while (s.length() != 1) 
		{
			for (int i = 0; i < s.length(); i++) 
			{
				chislo *= Integer.valueOf(String.valueOf(s.charAt(i)));
			}
			s = String.valueOf(chislo);
			chislo = 1;
			count += 1;
		}
		return count;
	}

}
