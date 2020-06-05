
public class Task2_6 {
	public static void main(String[] args)
	{
		int FibNumber = Integer.valueOf(args[0]);
		System.out.println(Task2_6.Fibonacci(FibNumber));
	}

	public static int Fibonacci(int FibNumber)
	{
		int Fib = 1;
		int a = 1;
		int b = 1;
		if (FibNumber == 0 || FibNumber == 1) { return Fib; }
		for (int i = 1; i < FibNumber; i++)
		{
			Fib = a + b;
			a = b;
			b = Fib;
		}
		return Fib;
	}

}
