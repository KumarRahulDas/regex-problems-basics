package bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    /**
     * Main method is starting point os this program.
     * @param args
     */
    public static void main(String[] args) {
        String name = "Abc";
        System.out.println(validateFirstName(name));
    }

    /**
     * Method for validating the user first name using regex.
     * @param firstName : user's first name
     * @return
     */
    private static boolean validateFirstName(String firstName){
        Pattern pattern = Pattern.compile("^[A-Z]{1}+[a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
    /**
     * Method for validating the user last name using regex.
     * @param lastName : user's last name
     * @return
     */
    private static boolean validateLastName(String lastName){
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    /**
     * Method for validating the user's email using regex
     * @param email : user's email
     * @return
     */
    private static boolean validateEmail(String email){
        Pattern pattern = Pattern.compile("^[a-zA-Z]+[.][a-zA-Z]+@+[a-zA-Z]+[.][a-zA-Z]+[.][a-zA-Z]*$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    private static boolean validatingMobile(String mNumber){
        Pattern pattern = Pattern.compile("^[9][1]+\\s\\d{10}$");
        Matcher matcher = pattern.matcher(mNumber);
        return matcher.matches();
    }
    /**
     * Method for validating the user's password using regex.
     * Rule1 – minimum 8 characters
     * @param password : user password
     * @return : true or false.
     */
    private static boolean validatePassword(String password){
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]{8,}$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

}