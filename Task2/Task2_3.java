
public class Task2_3 {
	
	public static void main(String[] args)
	{
		double[] n = new double[args.length];
		for (int i = 0; i < args.length; i++) 
		{
			n[i] = Double.parseDouble(args[i]);
		}
		System.out.println(Task2_3.isAvgWhole(n));
	}

	public static boolean isAvgWhole(double [] arr)
	{
		int middle = 0; 
		for (int i = 0; i < arr.length; i++) { middle += arr[i]; }
		if (middle % arr.length == 0) { return true;}
		return false;
	}

}
