import java.util.Scanner;

public class theCar {

    // Setting up variables to hold certain information
    int carPosition = 0;
    boolean parkedLast = false;
    boolean turnTaken = false;
    String userChoice = "";
    theDie moveDie = new theDie(6);
    Scanner keyboard = new Scanner(System.in);
    int parkedMulti = 1;


    // A default constructor that keeps default data.
    public theCar() {

    }


    // A method to play the game for the user.
    public void playGame() {
        // Setting turn taken to false to prep for the loop
        turnTaken = false;

        // A loop to get the user's choice and play their move depending on input.
        do {
            userChoice = "";


            // Displaying the user's choices
            System.out.println("Enter R to roll Die and move that value.");
            System.out.println("Enter P to park the car to double your speed next turn.");
            System.out.println("Enter L to check your location.");
            System.out.print("Your choice: ");

            // Getting the user's input and checking it against their options and performing the related action
            userChoice = keyboard.next();

            System.out.println();

            if (userChoice.toUpperCase().equals("R")) {
                moveDie.roll();
                System.out.println("Die Roll: " + moveDie.getValue());
                carPosition += moveDie.getValue() * parkedMulti;
                System.out.println("You moved: " + (moveDie.getValue() * parkedMulti) + " space(s).");
                parkedMulti = 1;
                turnTaken = true;
                parkedLast = false;

            } else if (userChoice.toUpperCase().equals("P") && !parkedLast) {
                System.out.println("Your parked this turn. You don't move this turn but your next roll is doubled.");
                parkedMulti = 2;
                turnTaken = true;
                parkedLast = true;

            } else if (userChoice.toUpperCase().equals("P") && parkedLast) {
                System.out.println("You parked last turn, check your position or move this turn.");

            } else if (userChoice.toUpperCase().equals("L")) {
                System.out.println("Current Position: " + carPosition);

            } else {
                System.out.println("ERROR: Invalid input.");

            }

            System.out.println();

        } while (!turnTaken);

    }


    // The computer's turn. It doesn't believe in luck and always does a default roll
    public void compPlay() {
        moveDie.roll();
        System.out.println("Die Roll: " + moveDie.getValue());
        System.out.println("The computer moved: " + moveDie.getValue() + " space(s).");
        System.out.println();
        carPosition += moveDie.getValue();
    }


    // A setter for

    // A getter for the car's position
    public int getCarPosition() {
        return carPosition;
    }
keyboard.close();

}
