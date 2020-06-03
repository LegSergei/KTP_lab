
public class L1Primes {
	// Метод main создает пустую строку, после чего вызывает метод isPrime передавая ему числа от 2 до 100
	// Если метод возвращает true, переданный аргумент добавляется в строку простых чисел, которая выводится
	// на экран после завершения цикла for.
	public static void main (String[] args)
	{
		String simple = "";
		for (int n = 2; n <=100; n++)
		{
			if (L1Primes.isPrime(n) == true) { simple += String.valueOf(n) + " ";}
		}
		System.out.println("Найденные простые числа: ");
		System.out.println(simple);
	}
	// Метод isPrime определяет, является ли переданный ему аргумент простым числом или нет.
	// Если аргумент является простым числом возвращается true, иначе - false.
	public static boolean isPrime(int n)
	{
		for (int i = 2; i < n; i++) // Цикл for проверяет, есть ли такое число от 2 до n-1, на которое n делится без остатка
			if (n%i == 0) { return false; }
		return true;
	}
}
