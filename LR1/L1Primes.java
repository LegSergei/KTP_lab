
public class L1Primes {
	// ����� main ������� ������ ������, ����� ���� �������� ����� isPrime ��������� ��� ����� �� 2 �� 100
	// ���� ����� ���������� true, ���������� �������� ����������� � ������ ������� �����, ������� ���������
	// �� ����� ����� ���������� ����� for.
	public static void main (String[] args)
	{
		String simple = "";
		for (int n = 2; n <=100; n++)
		{
			if (L1Primes.isPrime(n) == true) { simple += String.valueOf(n) + " ";}
		}
		System.out.println("��������� ������� �����: ");
		System.out.println(simple);
	}
	// ����� isPrime ����������, �������� �� ���������� ��� �������� ������� ������ ��� ���.
	// ���� �������� �������� ������� ������ ������������ true, ����� - false.
	public static boolean isPrime(int n)
	{
		for (int i = 2; i < n; i++) // ���� for ���������, ���� �� ����� ����� �� 2 �� n-1, �� ������� n ������� ��� �������
			if (n%i == 0) { return false; }
		return true;
	}
}
