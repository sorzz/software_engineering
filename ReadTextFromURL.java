
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.OutputStream;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
 
public class ReadTextFromURL {
     
    public static void main(String[] args) {
        
        String file_str;
        String url_str; 

        Scanner sc = new Scanner(System.in); 
	

        System.out.println("Please enter a URL");
        url_str = sc.nextLine();
        

        System.out.println("Please enter a File Name");
        file_str = sc.nextLine();
        

        try {
            URL url = new URL(url_str);
             

            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            File file = new File(file_str);
            FileWriter  fw = new FileWriter(file,true);

            int tmp;
            String line="";
            String outline="";

            while ((line = in.readLine()) != null) {
                for(int i=0; i<line.length(); i++) {
                    tmp = (int)line.charAt(i);

                   if( (97<=tmp) && (tmp<=122))
                        outline += (char)(tmp-32);
                    else 
                        outline += (char)tmp;
                }

                fw.write(outline);
                fw.flush();
                outline = "";
            }
            fw.close();
            in.close();
             
        }
        catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
         
    } 
 
}