package phonenumberconversion;
import java.util.Scanner;
/**
 *
 * @author dzt28
 */
public class PhoneNumberConversion {

    public static void main(String[] args) {
        String userPhoneNum = null; //declare & initialize string variable for users phone number
        Scanner scan = new Scanner(System.in); //scanner object to grab stdin
        
        System.out.print("Please enter your phone number "+
                "(Digits Only; No Spaces, No Dashes)\n:/>");
        userPhoneNum = scan.nextLine();
        // print out the users phone number concatenated with parantheses and dashes
        // Example output: (###) ###-####
        System.out.print("("+ userPhoneNum.substring(0,3) + ") "+userPhoneNum.substring(3,6) + "-" + userPhoneNum.substring(6,10));
    
    }
    
}
