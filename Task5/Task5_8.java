import java.nio.charset.*;
import java.security.*;

public class Task5_8 {
	
	public static void main(String[] args) throws NoSuchAlgorithmException 
	{
        System.out.println(getHash(args[0]));
	}

		public static String getHash(String str) throws NoSuchAlgorithmException 
		{
	        MessageDigest md = MessageDigest.getInstance("SHA-256");
	        byte[] hashInBytes = md.digest(str.getBytes(StandardCharsets.UTF_8));
	        StringBuilder sb = new StringBuilder();
	        for (byte b : hashInBytes) {
	            sb.append(String.format("%02x", b));
	        }
	        return sb.toString();
		}
}
