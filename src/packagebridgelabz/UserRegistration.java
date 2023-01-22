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
}