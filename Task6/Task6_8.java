import java.util.*;

public class Task6_8 {
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("Введите число: ");
		int n = Integer.parseInt(in.nextLine());
		if (n > 3999) 
		{
			System.out.println("Число слишком большое");
		}
		else
		{
			System.out.println(convertToRoman(n));
		}
		in.close();
	}


	public static String convertToRoman(int n) 
	{
		String[] menshe10 = new String[] {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String[] ot10do100 = new String[] {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String[] ot10do1000 = new String[] {"", "С", "СС", "ССС", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String answer = "";
		if (n > 999) {
			for (int i = 0; i < n / 1000; i++)
			{
				answer += "M";
			}
			n = n % 1000;
		}
		if (n / 100 > 0) 
		{
			answer +=  ot10do1000[n / 100];
			n = n % 100;
		}
		if (n / 10 > 0) 
		{
			answer += ot10do100[n / 10];
			n = n % 10;
		}
		if (n > 0) { answer += menshe10[n]; }
		return answer;
	}

}
