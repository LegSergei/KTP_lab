
import java.util.Scanner;

public class Task5_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("������� ��� ����� ����� ������ ");
		String s = in.nextLine();
		String incomplete = s.substring(0, s.indexOf(" "));
		String complete = s.substring(s.indexOf(" ") + 1);
		System.out.println(canComplete(incomplete, complete));
		in.close();
	}
	
	public static boolean canComplete(String incomplete, String complete) 
	{
		char[] inc = incomplete.toCharArray();// ��������� ����� ������ �� ������ ��������
		int flag = 0;
		for (int i = 0; i < inc.length; i++) //���� ������ ����� ������ � �������
		{
			flag = 0;// ���� ���� �� ��� ������, �� ������� �� ����� ������ ��� � �������
			for (int j = 0; j < complete.length(); j++) 
			{
				if (inc[i] == complete.charAt(j)) // ���� ���� ����������
				{
					complete = complete.substring(j + 1); // ������� ��������� �� ������� ������ �� ��������� �����
					flag = 1;
					break;
				}
			}
			if (flag == 0) { return false; }
		}
		return true;
				
	}
}

//bbutl beautiful
//butlz beautiful
//butl beautiful
//tulb beautiful