import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class program {


public static void main (String [] args) {
  
  int woerterZahl = 0;
  System.out.println("Gebe die Addresse der Datei");
  
  Scanner scan = new Scanner(System.in);

  String name = scan.nextLine(); 

  File datei = new File(name);

  try(Scanner datScanner = new Scanner(datei)){

     while (datScanner.hasNext()){

     datScanner.next();
    woerterZahl += 1;
    
   } //while Loop Ende

System.out.println(woerterZahl);

    


  }catch(FileNotFoundException e){
    System.err.println("Datei ist nicht gefunden");
  }
  
 

 

  
scan.close();


}

}