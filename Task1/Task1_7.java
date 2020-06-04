
public class Task1_7 {
	public static void main(String[] args)
	{
		int a = Integer.valueOf(args[0]);
		System.out.println(Task1_7.addUpTo(a));
		
	}
	
	public static int addUpTo (int a)
	{
		int n = 0;
		for (int i = 1; i <= a; i++)
		{
			n +=i;
		}
		return n;
	}

}
