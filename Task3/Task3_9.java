
public class Task3_9 {
	
	public static void main(String[] args) 
	{
		int a = Integer.valueOf(args[0]);
		System.out.println(Task3_9.nextPrime(a));
	}
	public static int nextPrime(int n)
	{
		int isSimple = 1;
		for (int i = 2; i < n; i++) 
			if (n%i == 0) { isSimple = 0; }
		if (isSimple == 1) { return n; }
		int m = Task3_9.nextPrime(n + 1);
		return m;
	}
	

}
