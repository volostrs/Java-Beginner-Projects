
import java.util.Scanner;
public class Square {
    public static void Square (){
        Scanner reader = new Scanner(System.in);
        Scanner reader1 = reader;


        System.out.println("If you want to find the square root of a number input 2. If you want to square a number input 2.");

        int Choice = Integer.valueOf(reader1.nextLine());
        if (Choice == 1){
            System.out.print("Pick a number to be squared:");


            int Squared = Integer.valueOf(reader1.next());

            int product = Squared * Squared;
            System.out.println(product);
        }
        else if(Choice == 2){
            System.out.print("Pick a number to find the square root of:");


            int Square = Integer.valueOf(reader1.next());

            double product = Math.sqrt(Square);
            System.out.println(product);
        }
        else{
            System.out.println("You did not follow the instructions listed.");
        }

        reader1.close();
    }
}
