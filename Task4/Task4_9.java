import java.util.*;

public class Task4_9 {
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("Введите первое число: ");
		String a = in.nextLine();
		System.out.printf("Введите второе число: ");
		String b = in.nextLine();
		System.out.println(trouble(a, b));
		in.close();
	}
	
	public static boolean trouble(String a, String b) 
	{
		int count = 0;
		String s1 = ""; // Строка содержит символы которые встречаются в первом числе ровно 3 раза подряд
		String ban = "";// Строка содержит символы которые встречаются в первом числе больше 3х раз подряд
		String ban2 = "";// Строка содержит символы которые встречаются в втором числе больше 2х раз подряд
		String cha = "";
		for (int i = 0; i < a.length()- 1; i++)// Заполняем строку s1
		{
			cha = String.valueOf(a.charAt(i));
			if (cha.equals(String.valueOf(a.charAt(i + 1)))) { count +=1; }
			else { count = 0;}
			if (count == 2)
			{
				if (i + 2 < a.length()) 
				{
					if (String.valueOf(a.charAt(i + 1)).equals(String.valueOf(a.charAt(i + 2))))
					{
						count = 0;
						ban += a.charAt(i);
						continue;
					}
				}
				if (ban.indexOf(a.charAt(i)) == -1) 
				{
					s1 += String.valueOf(a.charAt(i));
				}
			}
		}
		if (cha.equals("")) { return false; }
		count = 0;
		for (int j = 0; j < s1.length(); j++)
		{
			cha = String.valueOf(s1.charAt(j));

for (int k = 0; k < b.length(); k++)
			{
				if (cha.equals(String.valueOf(b.charAt(k)))) { count +=1; }
				else { count = 0; continue;}
				if (count == 2)
				{
					if (k + 1 < b.length()) 
					{
						if (String.valueOf(b.charAt(k)).equals(String.valueOf(b.charAt(k+1))))
						{
							count = 0;
							ban += b.charAt(k);
							continue;
						}
					}
					if (ban2.indexOf(b.charAt(k)) == -1) 
					{
						return true;
					}
				}

			}
		}
		return false;
	}
}
