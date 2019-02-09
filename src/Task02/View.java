package Task02;

import java.util.Scanner;

public class View {

    Scanner scan = new Scanner(System.in);
    private String userInput;

    void requestUserInput (int min, int max) {
        printOut("Enter a number between " + min + " and " + max + ":");
        userInput = scan.nextLine();
    }

    void incorrectFormatMsg (int min, int max) {
        printOut("Wrong format! You have to input an integer between " + min + " and " + max + ".");
    }

    void wrongResultMsg (int input) {
        printOut("You input a number " + input + ". The answer is wrong but you are close.");
    }

    void winMsg (int qty) {
        printOut("Congrats! This is correct answer!");
        printOut("Number of attempts: " + qty);
    }

    void printOut (String s) {
        System.out.println(s);
    }

    String getUserInput(){
        return userInput;
    }

    void stopScanner(){
        scan.close();
    }

}