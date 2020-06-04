
public class Task1_2 {
	
	public static void main(String[] args)
	{
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		System.out.println(Task1_2.TriArea(a, b));
		
	}
	
	public static double TriArea (double a, double b)
	{
		return 0.5*(a*b);
	}

}
