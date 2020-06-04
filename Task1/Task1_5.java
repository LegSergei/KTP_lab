
public class Task1_5 {
	
	public static void main(String[] args)
	{
		int N = Integer.valueOf(args[0]);
		int a = Integer.valueOf(args[1]);
		int b = Integer.valueOf(args[2]);
		System.out.println(Task1_5.operation(N, a, b));
		
	}
	
	public static String operation (int N, int a, int b)
	{
		if (a + b == N) { return "Сложить"; }
		if (a - b == N) { return "Вычесть"; }
		if (a * b == N) { return "Умножить"; }
		if (a / b == N) { return "Разделить"; }
		return "none";
	}
}
