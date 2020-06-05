
public class Task2_10 {

	public static void main(String[] args)
	{
		int Step = Integer.valueOf(args[0]);
		System.out.println(Task2_10.boxSeq(Step));
	}

	public static int boxSeq(int Step)
	{
		if (Step%2 == 0) { return Step; }
		return Step+2;
	}
}
