
public class Task3_7 {
	
	public static void main(String[] args) 
	{
		int a = Integer.valueOf(args[0]);
		System.out.println(Task3_7.isKaprecar(a));
	}
	
	public static boolean isKaprecar(int a)
	{
		String s = String.valueOf((int)Math.pow(a, 2));
		int A;
		int B;
		if (s.length() == 1) 
		{ 
			A = 0;
			B = Integer.valueOf(s.charAt(0));
		}
		else 
		{
			A = Integer.valueOf(s.substring(0,(s.length() / 2)));
			B = Integer.valueOf(s.substring((s.length() / 2)));
		}

		if ( A + B == a) { return true; }
		return false;
	}

}
