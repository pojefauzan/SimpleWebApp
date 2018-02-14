import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {  
      FileReader in = null;
      FileWriter out = null;
      
      
      
      
      
      

      try {
    	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
          System.out.println("Enter input file:");
          String input=br.readLine();
          System.out.println("Enter output file:");
          String output=br.readLine();

        // in = new FileInputStream(".\\input.txt");
         
         //in = new FileReader("C:\\Training\\Basic\\SAMPLES3\\input.txt");
       //  out = new FileWriter("C:\\\\Training\\\\Basic\\\\SAMPLES3\\output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
         System.out.println("File copied!!!!");
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}