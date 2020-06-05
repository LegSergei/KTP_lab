
public class Task2_2 {
	public static void main(String[] args)
	{
		int[] n = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			n[i] = Integer.valueOf(args[i]);
		}
		System.out.println(Task2_2.differenceMaxMin(n));
	}

	public static int differenceMaxMin(int[] arr)
	{
		int min = arr[0]; 
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) 
		{
			if (min > arr[i]) { min = arr[i];}

		}
		for (int i = 1; i < arr.length; i++) 
		{
			if (max < arr[i]) { max = arr[i];}

		}
		return max - min;
	}
}
