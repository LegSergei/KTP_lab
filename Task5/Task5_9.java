import java.util.*;

public class Task5_9 {
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("¬ведите строку: ");
		String s = in.nextLine();
		System.out.printf(correctTitle(s));
		in.close();
	}


	public static String correctTitle(String Title) 
	{
		String[] Slova = Title.split(" ");
		String[] constS = new String[] {"and", "the", "of", "in"};
		String Slovo = "";
		String answer = "";
		int flag = 0;
		for (int i = 0; i < Slova.length; i++) 
		{
			flag = 1;
			Slovo = Slova[i];
			for (int j = 0; j < constS.length; j ++) 
			{
				if (constS[j].equals(Slovo.toLowerCase()) | constS[j].equals(Slovo.toLowerCase().substring(0, Slovo.length()-2))) 
				{
					answer += constS[j] + " ";
					flag = 0;
				}
			}
			if (flag == 1) { answer += String.valueOf(Slovo.charAt(0)).toUpperCase() + Slovo.substring(1).toLowerCase() + " "; }
		}
		return answer;
	}
}

//jOn SnoW, kINg IN thE noRth.
//sansa stark, lady of winterfell.
