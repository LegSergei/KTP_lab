import java.util.Scanner;
import java.util.ArrayList;

public class Task3_6 {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите массив є1, отдел€€ элементы пробелами");
		String s = in.nextLine();
		String[] mass1 = s.split(" ");
		System.out.println("¬ведите массив є2, отдел€€ элементы пробелами");
		s = in.nextLine();
		String[] mass2 = s.split(" ");
		System.out.println(same(mass1, mass2));
		in.close();
	}
	
	public static boolean same(String[] arr1,String[] arr2) 
	{
		ArrayList<String> unicmass1 = new ArrayList<String>();
		ArrayList<String> unicmass2 = new ArrayList<String>();
		for (int i = 0; i < arr1.length; i++)
		{
			if (unicmass1.indexOf(arr1[i]) == -1) { unicmass1.add(arr1[i]);}
		}
		for (int i = 0; i < arr2.length; i++)
		{
			if (unicmass2.indexOf(arr2[i]) == -1) { unicmass2.add(arr2[i]);;}
		}
		if (unicmass1.size() == unicmass2.size()) { return true;}
		return false;
	}
	
}
