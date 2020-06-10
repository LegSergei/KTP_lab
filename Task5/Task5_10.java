
public class Task5_10 {
	
	public static void main(String[] args) {
		int number = Integer.valueOf(args[0]);
		System.out.println(hexLattice(number));
	}


	public static String hexLattice(int n) 
	{
		if (n % 6 != 1) return "Invalid";
		if (n == 1) return "o";
		int levels = 1;
		int i = 0;
		String answer = "";
		while (levels != n) 
		{
			levels += 6 * i;
			i++;
		}
		for (int k = i; k <= 2 * i - 1; k++) 
		{
			for (int j = k; j < 2 * i - 1; j++) 
			{
				answer += " ";
			}
			for (int j = 0; j < k; j++) 
			{
				answer += "o ";
			}
			answer += "\n";
		}
		for (int k = 2 * i - 2; k >= i; k--) 
		{
			for (int j = k; j < 2 * i - 1; j++) 
			{
				answer += " ";
			}
			for (int j = 0; j < k; j++) 
			{
				answer += "o ";
			}
			answer += "\n";
		}
		return String.valueOf(answer);
	}

}
