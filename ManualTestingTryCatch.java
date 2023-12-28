import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
public class ManualTestingTryCatch {
  public  static void main(String args[]) {
    String urlString="https://jsonplaceholder.typicode.com/posts/1/comments";
      try {
        URL url = new URL(urlString);
        HttpURLConnection connection= (HttpURLConnection) url.openConnection();
         int responseCode=connection.getResponseCode();
         if(responseCode == 200) {
             BufferedReader in=new BufferedReader(new InputStreamReader(connection.getInputStream()));
              String readLine;
              StringBuffer apiData=new StringBuffer();
              while ((readLine = in.readLine())!= null) {
                  apiData.append(readLine);
              }
             System.out.println(apiData.toString());
         }else {
             System.out.println("Api Call is not Be Completing"+ responseCode);
         }
    }catch(IOException e) {
         System.out.println("exceptions Occurs" + e.getMessage());
    }
}
}