import java.util.*;

public class Task4_1 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("������� N: ");
		int n = Integer.parseInt(in.nextLine());
		System.out.printf("������� K: ");
		int k = Integer.parseInt(in.nextLine());
		System.out.printf("������� ������ ");
		String s = in.nextLine();
		System.out.println(Task4_1.essay(n, k, s));
		in.close();
	}


	public static String essay(int n, int k, String text) 
	{
		String[] words = text.split(" ");
		String current_String = "";
		String final_String = "";
		for (int i = 0; i < words.length; i++) 
		{
			String current_Word = words[i];
			if (current_String.replace(" ", "").length() + current_Word.length() <= k) 
			{
				if (i + 1 < words.length) // �������� �������� �� ����������� ����� ���������.
				{
					if (current_String.replace(" ", "").length() + current_Word.length() + words[i+1].toString().length() <= k) // �������� ���� �� ������� ������ � ����� ������
					{
						current_String += current_Word + " ";
					}
					else
					{
						current_String += current_Word;
					}
				}
			}
			else 
			{
				final_String += current_String + "\n";
				current_String = current_Word + " ";
			}
		}
		if (current_String.length() > 0) 
		{
			final_String += current_String + "\n";
		}
		return final_String;
	}

}
