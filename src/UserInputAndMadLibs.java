/*
 Early Java practice project.
 Simple console game that:
 - Takes user input (name and age)
 - Uses a timer to measure reaction time
 - Randomly checks if the player guessed the correct color
*/

import java.util.Scanner;

class UserInputandMadLibs {
    public static void userInputMadLibs() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String Name = scanner.next();

        System.out.print("Enter your Age: ");
        int Age = scanner.nextInt();
        scanner.nextLine();

        if (Age <= 12){
            System.out.println("You're too young to play. Lil baby boy.");
            return;
        } else {
            System.out.println("Hello " + Name);
            System.out.println("You're " + Age + " years old.");
        }
        System.out.println("Let's do a chance, pick a color: black or red.");

        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000); // Wait for 1 second (1000ms)
        }

        System.out.println("Start! What's your color?");
        long startTime = System.currentTimeMillis();

        String Answer = scanner.nextLine();
        long endTime = System.currentTimeMillis();

        long secondsTaken = (endTime - startTime) / 1000;

        if (secondsTaken > 5){
            System.out.println("Took you " + secondsTaken + " seconds. I told you I don't got all day!");
        } else {
            System.out.println("Quick choice! Let's see if " + Answer + " is...");
        }

        Thread.sleep(2000);
        String correctAnswerIs = (Math.random() < 0.5) ? "Red" : "Black";
        if (Answer.equalsIgnoreCase("red") || Answer.equalsIgnoreCase("black")) {
            // The user actually picked a valid color
            if (Answer.equalsIgnoreCase(correctAnswerIs)) {
                System.out.println("Match! You picked the right color.");
            } else {
                System.out.println("Ouch. It was actually " + correctAnswerIs + ".");
            }
        } else {
            // They typed something else, like "purple" or "banana"
            System.out.println("That's not red or black! You lose by default.");
        }


        scanner.close();
        /* Notes: Do something to check if the Player is saying Red or Black.
        Also, check if the name is a single word and tell them "First Names only."

         */
    }

}
