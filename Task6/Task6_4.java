import java.util.*;

public class Task6_4 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите url: ");
		String url = in.nextLine();
		System.out.println("¬ведите параметры через пробел: ");
		String[] par = in.nextLine().split(" ");
		if (par.length > 0) System.out.printf(stripUrlParams(url, par));
		else System.out.printf(stripUrlParams(url));
		in.close();
	}


	public static String stripUrlParams(String url, String... args) 
	{
		String answer = "";
		Map<String, String> par = new HashMap<String, String>();
		if (url.split("\\?").length == 1) return url;
		String[] urlparams = url.split("\\?")[1].split("\\&");
		PARAMS:
		for (String param: urlparams) 
		{
			String key = param.split("\\=")[0];
			String value = param.split("\\=")[1];
			for (String arg: args) 
			{
				if (arg.equals(key)) continue PARAMS;
			}
			par.put(key, value);
		}
		for (Map.Entry<String, String> entry: par.entrySet())
		{
			answer += entry.getKey() + "=" + entry.getValue() + " ";
		}
		return url.split("\\?")[0] + "?" + answer.trim().replace(" ", "&");
		
	}
}
	
	
//https://edabit.com?a=1&b=2&a=2, b
