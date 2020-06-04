
public class Task1_10 {
	public static void main(String[] args)
	{
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		int c = Integer.valueOf(args[2]);
		System.out.println(Task1_10.abcmath(a, b, c));
	}
	
	public static boolean abcmath (double a, double b, double c)
	{
		for (int i = 0; i < b; i++ ) { a = a + a; }
		if (a % c == 0) { return true; }
		else { return false; }
	}
}
