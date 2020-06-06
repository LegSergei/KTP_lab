public class Task3_1 {
	
	public static void main(String[] args)
	{
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		int c = Integer.valueOf(args[2]);
		System.out.println(Task3_1.solutions(a, b, c));
	}
	public static int solutions(int a, int b, int c) 
	{
		double Dis = Math.pow(b, 2) - 4 * a * c;
		if (Dis > 0) 
		{
			return 2;
		}
		else if (Dis == 0) 
		{
			return 1;
		}
		return 0;
	}
}