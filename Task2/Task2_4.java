
public class Task2_4 {
	
	public static void main(String[] args)
	{
		int[] n = new int[args.length];
		for (int i = 0; i < args.length; i++) 
		{
			n[i] = Integer.valueOf(args[i]);
		}
		int[] k = new int[args.length];
		k = Task2_4.cumulativeSum(n);
		for (int i = 0; i < k.length; i++) 
		{
			System.out.println(k[i]);
		}
	}

	public static int[] cumulativeSum(int[] arr) 
	{
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j <= i; j++) 
			{
				arr2[i] += arr[j];
			}
		}
		return arr2;
	}

}
