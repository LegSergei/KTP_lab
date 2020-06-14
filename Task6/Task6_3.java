import java.util.*;
import java.util.regex.*;

public class Task6_3 {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите rgb или rgba: ");
		String s = in.nextLine();
		System.out.println(validColor(s));
		in.close();
	}
	
	public static boolean validColor(String color)
	{
		String s_rgb = "rgb()";
		String s_rgba = "rgba()";
		String par = "";
		String subs = color.substring(0, 4) + color.substring(color.length() - 1);
		String subs2 = color.substring(0, 5) + color.substring(color.length() - 1);
		int flag = 0;
		if (subs.equals(s_rgb))
		{
			par = color.substring(4,color.length() - 1);
			String[] param = par.split(",");
			if (param.length != 3) { return false; }
			for (int i = 0; i < 3; i ++)
			{
				if (String.valueOf(param[i]).equals("")) { return false; }
				if (Double.parseDouble(param[i]) >=0 && Double.parseDouble(param[i]) <= 255) { continue;}
				else { return false;}
			}
			flag = 1;
		}
		if (flag == 1) { return true; }		
		if (subs2.equals(s_rgba))
		{
			par = color.substring(5,color.length() - 1);
			String[] param = par.split(",");
			if (param.length != 4) { return false; }
			for (int i = 0; i < 3; i ++)
			{
				if (String.valueOf(param[i]).equals("")) { return false; }
				if (Double.parseDouble(param[i]) >=0 && Double.parseDouble(param[i]) <= 255) { continue;}
				else { return false;}
			}
			if (Double.parseDouble(param[3]) >=0 && Double.parseDouble(param[3]) <= 1) {return true;}
			else { return false;}
		}
		return false;
	}
	
	
	
	
	
	
	
	
//	public static String rgb = "rgb\\(([0-9]|[1-9][0-9]|[1-2][0-9][0-9])\\,([0-9]|[1-9][0-9]|[1-2][0-9][0-9])\\,([0-9]|[1-9][0-9]|[1-2][0-9][0-9])\\)";
//	public static String rgba = "rgba\\(([0-9]|[1-9][0-9]|[1-2][0-9][0-9])\\,([0-9]|[1-9][0-9]|[1-2][0-9][0-9])\\,([0-9]|[1-9][0-9]|[1-2][0-9][0-9])\\,[0-1]\\)";
	
//	public static void main(String[] args) 
//	{
//		Scanner in = new Scanner(System.in);
//		System.out.println("¬ведите rgb или rgba: ");
//		String color = in.nextLine();
//		System.out.println(validColor(color));
//		in.close();
//	}


//	public static boolean validColor(String color) {
//		if (Pattern.matches(rgb, color)) return true;
//		if (Pattern.matches(rgba, color)) return true;
//		return false;
//	}

}

