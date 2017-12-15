package stringslicer;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author dzt28
 */
public class StringSlicer {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList stringSlice = new ArrayList();
        String userInput;
        
        System.out.println("Please enter a string, one string, any string you'd like:: ");
        userInput = scan.nextLine();
        userInput = userInput.toCharArray();
        for(char x: userInput.toCharArray()){
            stringSlice.add(userInput.charAt(x));
        }
        for(int i=0; i < stringSlice.size(); i++){
            System.out.println(stringSlice.charAt(i));
        }
        
        
    }
    
}
