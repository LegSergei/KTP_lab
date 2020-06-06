import java.util.*;

public class Task3_10 {

	public static void main(String[] args) 
	{
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		int c = Integer.valueOf(args[2]);
		System.out.println(rightTriangle(a,b,c));
	}


	public static boolean rightTriangle(int x, int y, int z) 
	{
		int[] arr = {x, y, z};
		Arrays.sort(arr);
		if (Math.sqrt(Math.pow(arr[0], 2) + Math.pow(arr[1], 2)) == arr[2])
		{
			return true;
		}
		return false;
	}
}
