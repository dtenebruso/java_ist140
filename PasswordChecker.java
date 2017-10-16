package passwordchecker;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 *
 * @author dzt28
 */
public class PasswordChecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputPassword;
        inputPassword = "";
        boolean hasUpper, hasInt;
        
        while(inputPassword.length() != 3){
            System.out.println("Please enter a password(3 characters long, 1 uppercase and 1 number)::> ");
            inputPassword = scan.nextLine();
            hasUpper = !inputPassword.equals(inputPassword.toLowerCase());
            hasInt = Pattern.matches(".*\\d+.*", inputPassword);
            
            if(!hasUpper){
                inputPassword = "";
                System.out.println("You're missing an Uppercase letter\n\nPlease re-enter a password conforming to the ruleset(3 characters long, 1 uppercase and 1 number)...");
                System.out.print("yup");            }
            else{
                if(hasInt){
                    System.out.println("Thank you for the super 31337 password, it will only take a total of 7 milliseconds to crack!");
                    
                }
                else{
                    inputPassword = "";
                    System.out.println("You're missing a number\n\nPlease re-enter a password conforming to the ruleset(3 characters long, 1 uppercase and 1 number)...");
                }
            }
            
        }
    }
    
}
