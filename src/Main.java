public class Main {

    public static void main (String[] args){
        UserInputandMadLibs Module = new UserInputandMadLibs();

        try {
            Module.userInputMadLibs();
        } catch (InterruptedException e) {
            // This runs if the sleep is interrupted
            System.out.println("The countdown was interrupted!");
        }
    }

}
