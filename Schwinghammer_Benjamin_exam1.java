import java.util.Scanner;

public class Schwinghammer_Benjamin_exam1 {

    public static void main(String[] args) {
        // Creating a keyboard object
        //To hold user input
        Scanner keyboard = new Scanner(System.in);

        // Creating two flags to track what user information is valid
        boolean userValid = false;
        boolean passValid = false;

        // Variables to hold the amount of turns and the max length before winning
        int numTurns = 0;
        int raceLength = 0;
        int turnsPassed = 0;


        // Creating a userAccount objects for the username and password
        userAccount userName = new userAccount(5, 0, 0, 0);
        userAccount userPass = new userAccount();


        // Creating theCar objects to hold the user's and the computer's car information.
        theCar userCar = new theCar();
        theCar computerCar = new theCar();


        // A loop to ensure that the user's username and passwords are valid
        do {

            // Checking if the user's username is valid and if not entering a new one
            if (!userValid) {
                // Getting the user's input username
                System.out.println("A username must be 5 characters long.");
                System.out.print("Enter your username: ");
                userName.setUserString(keyboard.nextLine());
                System.out.println();

                // Running the verifyString method to check its validity
                userName.verifyString();
            }

            // Checking if the user's password is valid and if not entering a new one
            if (!passValid) {
                // Getting the user's input password
                System.out.println("A password must be 7 characters long, contain atleast 3 uppercase letters" +
                        ", 2 lowercase letters, and 2 digits.");
                System.out.print("Enter your password: ");
                userPass.setUserString(keyboard.nextLine());
                System.out.println();

                // Running the verifyString method to check its validity
                userPass.verifyString();
            }


            // Checking if the user's username is valid and telling them if it is or not.
            if (userName.getIsValid() && !userValid) {
                System.out.println("Your username is valid.");
                userValid = true;
            } else if (!userName.getIsValid()){
                System.out.println("Your username is not valid.");
            }

            // Checking if the user's password is valid and telling them if it is or not.
            if (userPass.getIsValid() &&  !passValid) {
                System.out.println("Your password is valid.");
                passValid = true;
            } else if (!userPass.getIsValid()) {
                System.out.println("Your password is not valid.");
            }

            System.out.println();

        } while (!userValid || !passValid);


        // Getting the user's input for the number of turns and race length
        // A loop for input verification on the number of turns
        do {
            System.out.println("Enter the number of turns to play in the game.");
            System.out.print("Number of turns: ");

            // Checking if the input is an int
            if (keyboard.hasNextInt()) {
                numTurns = keyboard.nextInt();

                // Making sure a positive number was entered for the length
                if (numTurns <= 0) {
                    System.out.println();
                    System.out.println("ERROR: Number of turns must be above 0.");
                    numTurns = 0;
                }

            } else {
                System.out.println();
                System.out.println("ERROR: Number of turns must be an integer number.");
                keyboard.next();
            }

            System.out.println();

        } while (numTurns == 0);


        // A loop for input verification on the length
        do {
            System.out.println("Enter the number of length of the track.");
            System.out.print("Length of track: ");

            // Checking if the input is an int
            if (keyboard.hasNextInt()) {
                raceLength = keyboard.nextInt();

                // Making sure a positive number was entered for the length
                if (raceLength <= 0) {
                    System.out.println();
                    System.out.println("ERROR: Length of track must be above 0.");
                    raceLength = 0;
                }

            } else {
                System.out.println();
                System.out.println("ERROR: Length of track be an integer number.");
                keyboard.next();
            }

            System.out.println();

        } while (raceLength == 0);


        // A loop that is playing the game
        do {
            // Counting up the number of turns that have passed
            turnsPassed++;

            // Printing out the current turn.
            System.out.println("Round #" + turnsPassed);

            System.out.println();

            // Playing the game for the user.
            System.out.println("Your turn.");
            userCar.playGame();


            // Playing the game for the computer.
            System.out.println("Computer's Turn.");
            computerCar.compPlay();



        } while (turnsPassed < numTurns && userCar.getCarPosition() < raceLength &&
                computerCar.getCarPosition() < raceLength);


        // Printing out each player's position
        System.out.println("The game is over!");
        System.out.println();
        System.out.println("User's position: " + userCar.getCarPosition());
        System.out.println("Computer's position: " + computerCar.getCarPosition());
        System.out.println();


        // Checking who won and printing an appropriate message
        if (userCar.getCarPosition() > computerCar.getCarPosition()) {
            System.out.println("Congratulations, you have won!");
        } else if (computerCar.getCarPosition() > userCar.getCarPosition()) {
            System.out.println("The computer has won!");
        } else {
            System.out.println("A tie! Better luck next time.");
        }
        keyboard.close();
    }
}
