
public class Ladia {
	
	public static boolean canMove(String start, String end) 
	{
		if (Doska.exists(start) && Doska.exists(end) && !start.equals(end)) 
		{
			if ((int)start.charAt(1) == (int)end.charAt(1) || start.charAt(0) == end.charAt(0)) return true;
		}
		return false;
	}
}
