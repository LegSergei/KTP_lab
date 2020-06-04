
public class Task1_3 {
	
	public static void main(String[] args)
	{
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		int c = Integer.valueOf(args[2]);
		System.out.println(Task1_3.animals(a, b, c));
		
	}
	
	public static int animals (int a, int b, int c)
	{
		return a*2 + b*4 + c*4;
	}
}
