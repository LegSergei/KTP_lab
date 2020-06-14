import java.util.*;

public class Task6_7 {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("¬ведите строку: ");
		String s = in.nextLine();
		System.out.println(longestNonrepeatingSubstring(s));
		in.close();
	}


	public static String longestNonrepeatingSubstring(String s) 
	{
		ArrayList<String> uniques = new ArrayList<String>();
		String s1 = "";
		String chr = "";
		int index = 0;
		for (int i = 0; i < s.length(); i++)
		{
			chr = String.valueOf(s.charAt(i));
			if (s1.indexOf(chr) != -1) 
			{
				uniques.add(s1);
				s1 = chr;
				continue;
			}
			s1 += chr;
		}
		if (s1.length() != 0) uniques.add(s1);
		for (int i = 0; i < uniques.size(); i++) 
		{
			if (uniques.get(index).length() < uniques.get(i).length()) 
			{
				index = i;
			}
		}
		return uniques.get(index);
	}

}
//abcabcbb
