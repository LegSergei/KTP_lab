
public class Task1_1 {
	
	public static void main(String[] args)
	{
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		System.out.println(Task1_1.remainder(a, b));
		
	}
	
	public static int remainder (int a, int b)
	{
		return a % b;
	}

}
