
public class Slon {
	
	public static boolean canMove(String start, String end) {
		if (Doska.exists(start) && Doska.exists(end) && !start.equals(end)) {
			return Math.abs((int)start.charAt(1) - (int)end.charAt(1)) == Math.abs((int)start.charAt(0) - (int)end.charAt(0));
		}
		return false;
	}

}
