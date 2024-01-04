import java.util.Random;
import java.util.Scanner;


public class program {



    public static void main(String[] args) {

    int versuche_max = 5;
    int versuche =  0;
   
  

    Scanner reader = new Scanner(System.in);      
    Random random = new Random();

    int random_zahl = random.nextInt(20);
    

    

        while (versuche < versuche_max){

        System.out.println("Eine erratene Zahl geben (vom 1 bis 20): ");    

        int user_guess = reader.nextInt();

        if (user_guess == random_zahl){

            System.out.println("Richtig gut geraten");
            versuche +=5;   
        }

        else if (user_guess - random_zahl ==1 ||user_guess - random_zahl ==2 ||user_guess - random_zahl ==3    ){
            System.out.println("Du bis 1 oder 2 oder 3 ziffern entfernt von der richtige lösung ");
            versuche += 1;
        }

        else if (user_guess < random_zahl ){
            
            System.out.println("Zu klein ! Großere Zahl geben !");
            versuche += 1;

        }

        else if (user_guess > random_zahl ){

            System.out.println("Zu Groß ! kleinere Zahl geben !");
            versuche += 1;
        }
        
       
    }
    
            
}
}



    


    
        
   

  
    
