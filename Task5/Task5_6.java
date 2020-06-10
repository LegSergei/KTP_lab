
public class Task5_6 {
	
	public static void main(String[] args) 
	{
		System.out.println(validateCard(args[0]));
	}

	public static boolean validateCard(String number) 
	{
		if (number.length() < 14 || number.length() > 19) return false;
		int chekDigit = Integer.valueOf(String.valueOf(number.charAt(number.length() - 1)));//Убираем последнюю цифру
		String numberReversed = "";
		for (int i = number.length() - 2; i >= 0; i--)// Переворачиваем число
		{
			numberReversed += String.valueOf(number.charAt(i));
		}
		int Number = 0;
		String NewNumber = "";//Строка нового номера после удвоения цифр в нечетных позициях
		String StringNumber = "";//Вспомогательная строка
		for (int i = 0; i < numberReversed.length(); i++)
		{
			if (i % 2 == 0) 
			{
				Number = Integer.valueOf(String.valueOf(numberReversed.charAt(i))) * 2; 
				if (Number > 9)
				{
					StringNumber = String.valueOf(Number);
					Number = Integer.valueOf(String.valueOf(StringNumber.charAt(0))) + Integer.valueOf(String.valueOf(StringNumber.charAt(1)));
					NewNumber += String.valueOf(Number);
				}
				else { NewNumber += String.valueOf(Number); }
			}
			else { NewNumber += String.valueOf(numberReversed.charAt(i)); }
		}
		Number = 0;
		for (int i = 0; i < NewNumber.length(); i++) 
		{
			Number += Integer.valueOf(String.valueOf(NewNumber.charAt(i)));
		}
		StringNumber = String.valueOf(Number);
		if (10 - Integer.valueOf(String.valueOf(StringNumber.charAt(StringNumber.length()-1))) == chekDigit) { return true;}
		return false;
		
	}
}
//1234567890123456
//1234567890123452