
public class L1Palindrome {
	// ћетод main вызывает метод isPalindrome дл€ каждого аргумента, полученного при вызове класса,
	// после чего выводит сообщение, €вл€етс€ ли строка палиндромом.
	public static void main(String[] args)
	{
		for (int i = 0; i < args.length; i++)
		{
			String s = args[i];
			if (L1Palindrome.isPalindrome(s) == true)
			{
				System.out.println(s + " - палиндром");
			}
			else
			{
				System.out.println(s + " -  не палиндром");
			}
		}
	}
	// ћетод reverseString возвращает строку, состо€щую из символов строки-аргумента,
	// составленных в обратном пор€дке.
	public static String reverseString(String s)
	{
		String RevString = "";
		for (int i = s.length() - 1; i >=0; i--) { RevString += s.charAt(i); }
		return RevString;
	}
	// ћетод isPalindrome вызывает метод reverseString и сравнивает исходную строку с полученной.
	// ≈сли они равны, то слово €вл€етс€ палиндромом и метод возвращает true, иначе - false.
	public static boolean isPalindrome(String s)
	{
		if ((L1Palindrome.reverseString(s)).equals(s) == true) { return true; }
		return false;
	}

}
