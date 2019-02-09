package Task01;

import java.util.Scanner;

public class View {
    // Fields
    private Scanner scanner = new Scanner(System.in);
    private String userInput;

    // Getter
    public String getUserInput(){
        return userInput;
    }

    // Methods
    // Takes 1st input from user
    void takeFirstInput () {
        printOut("You need to input two strings separately.");
        printOut("Please, enter a first string:");
        userInput = scanner.nextLine();
    }

    // Takes 2nd input from user
    void takeSecondInput () {
        printOut("Please, enter a second string:");
        userInput = scanner.nextLine();
    }

    // Shows alert that input string is incorrect and try again
    void showAlert(){
        printOut("Incorrect data. Please, try again:");
        userInput = scanner.nextLine();
    }


    // Prints out a string received from Controller
    void printOut(String text){
        System.out.println(text);
    }

    // Stops scanner
    void stopScanner(){
        scanner.close();
    }

}