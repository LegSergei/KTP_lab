import java.util.*;
import java.util.regex.*;


public class Task6_5 
{
	
	public static Pattern textPattern = Pattern.compile("[a-zA-Z]+");
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите заголовок: ");
		String s = in.nextLine();
		List<String> itog = getHashTags(s);
		System.out.println(itog);
		in.close();
	}


	public static List<String> getHashTags(String text) 
	{
		List<String> answer = new ArrayList<String>();
		Matcher match;
		String LongWord = "";
		int indexMax = -1;
		int i = 0;
		List<String> hashtags = new ArrayList<String>();
		match = textPattern.matcher(text);
		while (match.find()) 
		{
			hashtags.add(match.group().toLowerCase());
		}
		while (i < 3 && hashtags.size() != 0) 
		{
			LongWord = "";
			for (int j = 0; j < hashtags.size(); j++) 
			{
				if (hashtags.get(j).length() > LongWord.length()) 
				{
					LongWord = hashtags.get(j);
					indexMax = j;
				}
			}
			hashtags.remove(indexMax);
			answer.add("#" + LongWord);
			i++;
		}
		return answer;
	}

}
//How the Avocado Became the Fruit of the Global Trade
//Hey Parents, Surprise, Fruit Juice Is Not Fruit
//Why You Will Probably Pay More for Your Christmas Tree This Year