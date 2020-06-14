import java.util.*;

public class Task6_6 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("¬ведите номер: ");
		int n = Integer.valueOf(in.nextLine());
		System.out.println(ulam(n));
		in.close();
	}


	public static Integer ulam(int n) 
	{
		List<Integer> ulm = new ArrayList<Integer>();
		ulm.add(1);
		ulm.add(2);
		int c = 0;
		int sled = ulm.get(ulm.size() - 1) + 1;
		while (ulm.size() != n) 
		{
			c = 0;
			for (int i = 0; i < ulm.size() - 1; i++) 
			{
				for (int j = i + 1; j < ulm.size(); j++) 
				{
					if (ulm.get(i) + ulm.get(j) == sled) c++;
					if (c > 1) { break; }
				}
				if (c > 1) { break; }
			}
			if (c == 1) { ulm.add(sled); }
			sled++;
		}
		return ulm.get(n - 1);
	}

}
