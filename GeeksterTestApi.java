  import java.io.BufferedReader;
  import java.io.IOException;
  import java.io.InputStreamReader;
  import java.net.HttpURLConnection;
  import java.net.URL;
  import java.util.*;

public class GeeksterTestApi {
    public static void main(String[] args) {
        //https://jsonplaceholder.typicode.com/posts/1/comments //
         String urlString="https://jsonplaceholder.typicode.com/posts/1/comments";

           try{
               URL url=new URL(urlString);
               HttpURLConnection connection=(HttpURLConnection)url.openConnection();
                 int responceCode=connection.getResponseCode();
                   if(responceCode == 200)  {//it gives the ok response...
                       BufferedReader in=new BufferedReader(new InputStreamReader(connection.getInputStream()));
                       String readLine;
                       StringBuilder apiData=new StringBuilder();
                        while((readLine =in.readLine())!=null) {
                            apiData.append(readLine);
                        }
                       System.out.println(apiData.toString());
                   }else {
                       System.out.println("Api could not be Hit in this case"+" "+responceCode);
                   }
           }catch(IOException e) {
               System.out.println("Exception occurence in this case" + " "+ e.getMessage());
           }
    }
}
