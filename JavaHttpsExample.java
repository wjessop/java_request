import java.io.*;
import java.net.*;

public class JavaHttpsExample {
   public static void getURL(String urlToRead) throws Exception {
		 	CookieHandler.setDefault(new CookieManager());
			URL url = new URL(urlToRead);
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();

			int code = connection.getResponseCode();
   }

   public static void main(String[] args) throws Exception
   {
     getURL(args[0]);
		 System.out.println("Done");
   }
}
