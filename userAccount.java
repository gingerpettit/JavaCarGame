import java.util.Scanner;

public class userAccount {

    // Setting up variables to store string requirement data
	int reqLength = 7;
	int reqLower = 2;
	int reqUpper = 3;
	int reqDigit = 2;
	int numLower;
	int numUpper;
	int numDigit;
	String userString;
	boolean isValid = false;
	Scanner keyboard = new Scanner(System.in);

	// A default constructor that keeps all of the constant values
    public userAccount() {
    }

    // A constructor that sends new variables to replace the constants
    public userAccount(int newLength, int newLower, int newUpper, int newDigit){
        reqLength = newLength;
        reqLower = newLower;
        reqUpper = newUpper;
        reqDigit = newDigit;
    }

    // A method that verifies if the string is valid with the given instructions
    public void verifyString() {
        numLower = 0;
        numUpper = 0;
        numDigit = 0;

        // A for loop that iterates through each letter in the string
        for (int i = 0; i < userString.length(); i++) {
            // An if statement that checks if the character is lowercase, uppercase, or a digit and counts it.
            if (Character.isLowerCase(userString.charAt(i))) {
                numLower++;
            } else if (Character.isUpperCase(userString.charAt(i))) {
                numUpper++;
            } else if (Character.isDigit(userString.charAt(i))) {
                numDigit++;
            }
        }


        // Checking all of the accumulated values against the requirements set
        if (userString.length() >= reqLength && numLower >= reqLower && numUpper >= reqUpper && numDigit >= reqDigit) {
            isValid = true;
        }

    }


    // A setter to set the user's String
    public void setUserString(String stringIn){
        userString = stringIn;
    }

    // A setter to set the required length
    public void setReqLength(int reqLengthIn){
        reqLength = reqLengthIn;
    }

    // A setter to set the required number of lowercase letters
    public void setReqLower(int reqLowerIn){
        reqLower = reqLowerIn;
    }

    // A setter to set the required number of uppercase letters
    public void setReqUpper(int reqUpperIn){
        reqUpper = reqUpperIn;
    }

    // A setter to set the required number of digits
    public void setReqDigit(int reqDigitIn){
        reqDigit = reqDigitIn;
    }

    // A setter to set the number of lowercase letters
    public void setNumLower(int numLowerIn){
        numLower = numLowerIn;
    }

    // A setter to set the number of uppercase letters
    public void setNumUpper(int numUpperIn){
        numUpper = numUpperIn;
    }

    // A setter to set the number of digits
    public void setNumDigit(int numDigitIn){
        numDigit = numDigitIn;
    }

    // A setter to set the validity checker
    public void setIsValid(boolean isValidIn){
        isValid = isValidIn;
    }


    // A getter that returns the user's String
    public String getUserString(){
        return userString;
    }

    // A getter that returns the required length
    public int getReqLength(){
        return reqLength;
    }

    // A getter that returns the required lowercase letter count
    public int getReqLower(){
        return reqLower;
    }

    // A getter that returns the required uppercase letter count
    public int getReqUpper(){
        return reqUpper;
    }

    // A getter that returns the required digit count
    public int getReqDigit(){
        return reqDigit;
    }

    // A getter that returns the number of lowercase letters
    public int getNumLower(){
        return numLower;
    }

    // A getter that returns the number of uppercase letters
    public int getNumUpper(){
        return numUpper;
    }

    // A getter that returns the number of digits
    public int getNumDigit(){
        return numDigit;
    }

    // A getter that returns the validity of the string
    public boolean getIsValid(){
        return isValid;
    }
keyboard.close();

}
