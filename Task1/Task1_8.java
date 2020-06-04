
public class Task1_8 {
	
	public static void main(String[] args)
	{
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		System.out.println(Task1_8.nextEdge(a,b));
		
	}
	
	public static int nextEdge (int a, int b)
	{
		return a + b - 1;
	}

}
