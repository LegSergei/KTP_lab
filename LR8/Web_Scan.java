import java.io.*;
import java.net.UnknownHostException;
import java.sql.SQLException;


public class Web_Scan {

	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, SQLException 
	{
		String test = "http://ya.ru";
		Crawler crawl = new Crawler(test, 5);
		crawl.met8(10);
		
 	}
}
