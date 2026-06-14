
import java.util.Scanner;
public class Square {
    public static void SquareCheck (){
        Scanner reader = new Scanner(System.in);


        System.out.println("If you want to square a number input 1. If you want to find the square root of a number input 2.");

        int Choice = Integer.parseInt(reader.nextLine());
        if (Choice == 1){
            System.out.print("Pick a number to be squared:");


            int Squared = Integer.parseInt(reader.next());

            int product = Squared * Squared;
            System.out.println(product);
        }
        else if(Choice == 2){
            System.out.print("Pick a number to find the square root of:");


            int Squares = Integer.parseInt(reader.next());

            double product = Math.sqrt(Squares);
            System.out.println(product);
        }
        else{
            System.out.println("You did not follow the instructions listed.");
        }

        reader.close();
    }
}
