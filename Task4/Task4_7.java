
public class Task4_7 {

	public static void main(String[] args) 
	{
		if (args.length == 0) { System.out.println(""); }
		else
		{
		String s = args[0];
		System.out.println(toStarShorthand(s));
		}
	}


	public static String toStarShorthand(String s)
	{
		
		int count = 0;
		int flag = 0; // Переменная определяет были ли повторяющиеся символы.
		char cha = '1';
		String itog = "";
		for (int i = 0; i < s.length(); i++) 
		{
			if (i + 1 < s.length())// Проверка не последний ли это сивол
			{
				if (s.charAt(i) == s.charAt(i + 1))// Проверка равен ли текущий символ следующему
				{
					cha = s.charAt(i);
					count +=1;
					flag = 1;
				}
				else 
				{ 
					if (flag == 1)
					{
						itog += String.valueOf(cha) + "*" + String.valueOf(count + 1);
						flag = 0;
						count = 0;
					}
					else 
					{
						itog += String.valueOf(s.charAt(i)); 
						flag = 0; 
					}
				}	
			}
			else
			{
				if (flag == 1)
				{
					itog += String.valueOf(cha) + "*" + String.valueOf(count + 1);
					flag = 0;
				}
				else 
				{
					itog += String.valueOf(s.charAt(i)); 
					flag = 0; 
				}
			}
		}
		return itog;
	}

}

