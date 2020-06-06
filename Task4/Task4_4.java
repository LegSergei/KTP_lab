
public class Task4_4 {
	
	public static void main(String[] args) 
	{
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		double d = Double.parseDouble(args[3]);
		System.out.println(overTime(a, b, c, d));
	}


	public static String overTime(double time_start, double time_end, double salary, double over_time_mul) 
	{
		String money = "$";
		if (time_end <= 17) { return money + String.valueOf((time_end - time_start) * salary); }
		else 
		{
			money += String.valueOf((17 - time_start) * salary + (time_end - 17) * salary * over_time_mul);
			return money;
		}
			
	}

}
