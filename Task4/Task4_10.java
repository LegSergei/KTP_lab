import java.util.*;

public class Task4_10 {
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("¬ведите строку: ");
		String string = in.nextLine();
		System.out.printf("¬ведите символ-разделитель: ");
		String book_end = in.nextLine();
		System.out.println(countUniqueBooks(string, book_end));
		in.close();
	}
	public static int countUniqueBooks(String s, String book_end) 
	{
		char[] book = s.toCharArray();
		int flag = 0;
		Map<Character, Integer> book_symb = new HashMap<Character, Integer>();
	    for (int i = 0; i < book.length; i++) 
	    {
	    	if (flag == 1 && book[i] != book_end.charAt(0)) { book_symb.put(book[i],i); }
	    	if (book[i] == book_end.charAt(0))
	    	{
	    		if (flag == 0) { flag = 1;}
	    		else {flag = 0; }
	    	}
	    }
	    return book_symb.size();
	}

}
//AZYWABBCATTTA
//ZZABCDEF
//$AA$BBCATT$C$$B$
