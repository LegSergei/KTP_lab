
public class Task5_5 {
	
	public static void main(String[] args) 
	{
		System.out.println(sameVowelGroup(args));
	}
	
	public static String sameVowelGroup(String[] args) //���������� ������� 4.8
	{
		String glasnie = "AEIUOY"; // ��������� ������ �������
		String firstWordgl = "";// C����� ������� ������� �����
		String answer = args[0] + " ";// �������� ������
		for (int i = 0; i < args[0].length(); i++)// ��������� ������ ������� ������� �����
		{
			if (glasnie.indexOf(String.valueOf(args[0].charAt(i)).toUpperCase()) != -1) 
			{ 
				firstWordgl += String.valueOf(args[0].charAt(i)).toUpperCase();
			}
		}
		int flag = 1;
		for (int i = 1; i < args.length; i++)//���� �� ��������� ������ ������� � �������
		{
			flag = 1;
			for (int j = 0; j < args[i].length(); j++) 
			{
				if (glasnie.indexOf(String.valueOf(args[i].charAt(j)).toUpperCase()) != -1 && firstWordgl.indexOf(String.valueOf(args[i].charAt(j)).toUpperCase()) == -1)
				{
					//���� � ����� ���� ������� ������� �� ���������� � ������ �����
					flag = 0;
				}
				
			}
			if (flag == 1) { answer += args[i] + " "; }

		}
		return answer;
	}

}


// toe ocelot maniac
// many carriage emit apricot animal
// hoops chuff bot bottom