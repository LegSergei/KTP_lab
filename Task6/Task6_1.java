import java.util.*;

public class Task6_1 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("Введите размер массива: ");
		int n = Integer.parseInt(in.nextLine());
		System.out.printf("Полученное число Белла: ");
		System.out.println(bell(n));
		in.close();
	}


	public static int bell(int l) 
	{
		int[][] arr = new int[l + 1][l + 1];
		arr[0][0] = 1;
		for (int i = 1; i <= l; i++) 
		{
			arr[i][0] = arr[i - 1][i - 1];
			for (int j = 1; j <= i; j++) 
			{
				arr[i][j] = arr[i - 1][j - 1] + arr[i][j - 1];
			}
		}
		return arr[l][0];
	}

}
