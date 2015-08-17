
import java.io.*;
import java.util.regex.*;
import java.lang.String;
public class lab001 { 
	public static void main (String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
    			String line;
    			while ((line = br.readLine()) != null) {
       				if (line.matches("message=.*")) {
					int count = line.length();
					count = count - 8;
					System.out.println(count);
				
				}	
   			 }
		}
		catch (FileNotFoundException ex) {
			 System.out.println("File Not Found");	
		}
	}
}