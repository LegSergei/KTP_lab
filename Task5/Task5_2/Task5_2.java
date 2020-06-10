import java.util.*;

public class Task5_2 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("Начальная позиция ");
		String start = in.nextLine();
		System.out.printf("Конечная позиция ");
		String end = in.nextLine();
		System.out.println(Ferz.canMove(start, end));
		in.close();
	}

}
