import java.util.*;

public class Task6_2 {
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("Введите слово: ");
		String s = in.nextLine();
		String[] s_mass = s.split(" ");
		System.out.printf("Полученный перевод: ");
		System.out.printf(translateSentence(s_mass));
		in.close();
	}

	public static String translateSentence(String[] sent)
	{
		String answer = "";
		for (int i = 0; i < sent.length; i++)
		{
			answer += translateWord(sent[i]) + " ";
		}
		return answer.trim();
	}
	
	public static String translateWord(String slovo) 
	{
		String simvol = ".,!?;:";
		String glasn = "EeAaUuIiOoYy";
		String answer = "";
		String simv = "";
		if (simvol.indexOf(slovo.charAt(slovo.length() - 1)) != -1) 
		{
			simv += String.valueOf(slovo.charAt(slovo.length() - 1));
			slovo = slovo.substring(0, slovo.length() - 1);
		}
		for (int i = 0; i < glasn.length(); i ++)
		{
			if (slovo.charAt(0) == glasn.charAt(i))
			{
				slovo += "yay" + simv;
				return slovo;

			}	
		}	
		for (int i = 0; i < slovo.length(); i ++)
		{
				if (glasn.indexOf(slovo.charAt(i)) == -1)
				{
					answer += String.valueOf(slovo.charAt(i));
				}
				else
				{
					break;
				}
		}
		slovo = slovo.substring(answer.length());
		slovo += answer + "ay" + simv;
		return slovo;
	}
}
//Apple
//button
//I like to eat honey waffles.