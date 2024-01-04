
import java.io.IOException;
import java.io.FileWriter;
import java.util.Random;


class program {
    public static void main(String []args){


        String path = "/home/nad/aufgaben/aufgaben-java/datei-schreiben/src/src.txt";


          
          
          String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

          StringBuilder sb = new StringBuilder();
          Random rand= new Random();

          int length = 7;

          int i = 0;

          while (i<length) {
            
            int index = rand.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
            i++;
          }
          
          

          String randomString = sb.toString();
          


        

        try (FileWriter writer = new FileWriter(path)){


            writer.write(randomString);             
                
        }catch (IOException e ) {
            System.err.println("404");
        }
    
            
  
        
}
}
 