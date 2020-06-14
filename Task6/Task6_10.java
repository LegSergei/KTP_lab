import java.util.*;
	
public class Task6_10 
{
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите число: ");
		int n = Integer.valueOf(in.nextLine());
		System.out.println(palindromedescendant(n));
		in.close();
	}


	public static String reverseString(String s) 
	{
		String answer = "";
		for (int i = s.length() - 1; i > -1; i--) 
		{
			answer += s.charAt(i);
		}
		return answer;
	}
	public static boolean palindromedescendant(int n) 
	{
		String s = String.valueOf(n);
		String nov = "";
		int value;
		if (n < 10) return false;
		if (s.equals(reverseString(s))) return true;
		for (int i = 0; i < s.length(); i += 2) {
			value = 0;
			value += Integer.parseInt(String.valueOf(s.charAt(i)));
			value += Integer.parseInt(String.valueOf(s.charAt(i + 1)));
			nov += String.valueOf(value);
		}
		return palindromedescendant(Integer.valueOf(nov));
		}
	}

//11211230
//13001120
//23336014
//11