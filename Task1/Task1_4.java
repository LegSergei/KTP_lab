
public class Task1_4 {
	
	public static void main(String[] args)
	{
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		System.out.println(Task1_4.profitableGamble(a, b, c));
		
	}
	
	public static boolean profitableGamble (double a, double b, double c)
	{
		double profit = a*b - c;
		if (profit > 0) { return true; }
		else { return false; }
	}
}
