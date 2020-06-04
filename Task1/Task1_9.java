
public class Task1_9 {
	public static void main(String[] args)
	{
		int[] a = new int[args.length];
		for (int i = 0; i < args.length; i++)
		{
				a[i] = Integer.valueOf(args[i]);
		}
		System.out.println(Task1_9.sumOfCubes(a));
	}
	
	public static int sumOfCubes(int[] arr) {
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			n += Math.pow(arr[i], 3);
		}
		return n;
	}
}
