
public class Kon {
	
	public static boolean canMove(String start, String end) 
	{
		if (Doska.exists(start) && Doska.exists(end) && !start.equals(end)) 
		{
			//������� � ������ ����� ������� � ������
			int diff = (int)start.charAt(1) - (int)end.charAt(1);
			//���������, ���������� �� ����� ������ � ����� 
			boolean equal = start.charAt(0) != end.charAt(0);
			if (Math.abs(diff) <= 2 && diff != 0 && equal) 
			{
				if (Math.abs(diff) == 2) 
				{
					if (Math.abs(((int)start.charAt(0) - (int)end.charAt(0))) == 1) 
					{
						return true;
					}
				}
				else {
					if (Math.abs(((int)start.charAt(0) - (int)end.charAt(0))) == 2) 
					{
						return true;
					}
				}
			}
		}
		return false;
	}

}
