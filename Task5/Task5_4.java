
public class Task5_4 {
	
	public static void main(String[] args) 
	{
		System.out.println(sumDigProd(args));
	}
	
	public static int sumDigProd(String[] args) 
	{
		int sum = 0;
		for (int i = 0; i < args.length; i ++) // ���� ����� ���� ��������� �����
		{
			sum += Integer.valueOf(args[i]);
		}
		String s = String.valueOf(sum); //���������� ������� 4.6
		int chislo = 1;
		while (s.length() != 1) 
		{
			for (int i = 0; i < s.length(); i++) //���� ������������ ���� ����
			{
				chislo *= Integer.valueOf(String.valueOf(s.charAt(i)));
			}
			s = String.valueOf(chislo);
			chislo = 1; 
		}
		return Integer.valueOf(s);
	}
}
