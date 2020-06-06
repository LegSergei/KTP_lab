
public class Task3_3 {
	
	public static void main(String[] args)
	{
		int a = Integer.valueOf(args[0]);
		System.out.println(Task3_3.checkPerfect(a));
		
	}
	public static boolean checkPerfect(int a) 
	{
		int Sum = 0;
		for (int i = 1; i < a; i++) 
		{
			if (a % i == 0) { Sum += i; }
			if (Sum > a) { return false; }
		}
		if (Sum == a) { return true; }
		return false;	
	}
	

}
