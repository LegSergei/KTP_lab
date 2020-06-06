import java.util.*;

public class Task4_8 {
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("Первая строка: ");
		String first = in.nextLine();
		System.out.printf("Вторая строка: ");
		String second = in.nextLine();
		System.out.println(doesRhyme(first, second));
		in.close();
	}
	
	public static boolean doesRhyme(String string1, String string2)
	{
		String glasnie = "AaEeIiUuOoYy";
		String[] words1 = string1.split(" ");
		String[] words2 = string2.split(" ");
		String last_word1 = words1[words1.length - 1];
		String last_word2 = words2[words2.length - 1];
		String glasnie1 = "";
		String glasnie2 = "";
		for (int i = 0; i < last_word1.length(); i++)
		{
			if (glasnie.indexOf(last_word1.charAt(i)) != -1)
			{
				if (glasnie1.indexOf(last_word1.charAt(i)) == -1)
				{
					glasnie1 += String.valueOf(last_word1.charAt(i)).toLowerCase();
				}
			}
		}
		for (int j = 0; j < last_word2.length(); j++)
		{
			if (glasnie.indexOf(last_word2.charAt(j)) != -1)
			{
				if (glasnie2.indexOf(last_word2.charAt(j)) == -1)
				{
					glasnie2 += String.valueOf(last_word2.charAt(j)).toLowerCase();
				}
			}
		}
		if (glasnie1.length() != glasnie2.length()) { return false;	}
		for (int i = 0; i < glasnie2.length(); i++)
		{
			if (glasnie1.indexOf(glasnie2.charAt(i)) == -1) { return false;	}
		}
		return true;
	}
}
