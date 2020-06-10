import java.util.*;

public class Task5_1 {
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("Введите 1 для кодирования или 2 для декодирования ");
		String s = in.nextLine();
		if (s.equals("1"))
		{
			System.out.printf("Введите строку для кодирования\n");
			String s1 = in.nextLine();
			System.out.println(encrypt(s1));
		}
		else if (s.equals("2"))
		{
			System.out.printf("Введите код для декодирования\n");
			String s2 = in.nextLine();
			System.out.println(decrypt(s2));
		}
		else { System.out.printf("Команда не распознана"); }
		in.close();
	}
	
	
	public static String encrypt(String s)
	{
		int[] code = new int[s.length()];
		char[] charmass = s.toCharArray();
		int pred = 0;
		for (int i = 0; i < charmass.length; i++) 
		{
			code[i] = (int)charmass[i] - pred;
			pred = (int)charmass[i];
		}
		String answer = "";
		for (int i = 0; i < code.length; i++) 
		{
			if ( i != code.length - 1) { answer += String.valueOf(code[i]) + " ";}
			else { answer += String.valueOf(code[i]);}
		}
		return answer;
	}
	
	public static String decrypt(String string) 
	{
		String[] code = string.split(" ");
		int pred = 0;
		String answer = "";
		for (int i = 0; i < code.length; i++) 
		{
			answer += String.valueOf((char)(Integer.valueOf(code[i]) + pred));
			pred += Integer.valueOf(code[i]);
		}
		return answer;
	}
	
}
//72 33 -73 84 -12 -3 13 -13 -68