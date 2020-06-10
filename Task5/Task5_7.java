
public class Task5_7 {
	
		public static void main(String[] args) 
		{
			System.out.println(numToEng(Integer.parseInt(args[0])));
		}
		
		public static String numToEng(int num) 
		{
			if (num == 0) return "zero";
			String answer = "";
			String[] first20 = new String[] {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	        String[] decades = new String[] { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	        if (num < 20) 
	        {
	        	answer = first20[num];
	        }
	        else if (num < 100) 
	        {
	        	answer += decades[num / 10];
	        	if (num % 10 != 0) { answer += " " +  first20[num % 10]; }
	        	else { answer += "" +  first20[num % 10];  }
	        	
	        }
	        else if (num < 1000) 
	        {
	        	answer += first20[num / 100]+ " hundered ";
	        	if (num % 100 != 0) { answer += numToEng(num % 100); }
	        	else { answer += "";  }
	        }
	        return answer;
		}
}

