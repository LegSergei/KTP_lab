
public class L1Palindrome {
	// ����� main �������� ����� isPalindrome ��� ������� ���������, ����������� ��� ������ ������,
	// ����� ���� ������� ���������, �������� �� ������ �����������.
	public static void main(String[] args)
	{
		for (int i = 0; i < args.length; i++)
		{
			String s = args[i];
			if (L1Palindrome.isPalindrome(s) == true)
			{
				System.out.println(s + " - ���������");
			}
			else
			{
				System.out.println(s + " -  �� ���������");
			}
		}
	}
	// ����� reverseString ���������� ������, ��������� �� �������� ������-���������,
	// ������������ � �������� �������.
	public static String reverseString(String s)
	{
		String RevString = "";
		for (int i = s.length() - 1; i >=0; i--) { RevString += s.charAt(i); }
		return RevString;
	}
	// ����� isPalindrome �������� ����� reverseString � ���������� �������� ������ � ����������.
	// ���� ��� �����, �� ����� �������� ����������� � ����� ���������� true, ����� - false.
	public static boolean isPalindrome(String s)
	{
		if ((L1Palindrome.reverseString(s)).equals(s) == true) { return true; }
		return false;
	}

}
