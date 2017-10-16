package patternmaker;
import java.util.Scanner;
/**
 *
 * @author dzt28
 */
public class PatternMaker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNum1, userNum2;
        String strtPtn, endPtn, midPtn;
        
        
        System.out.println("Please enter a number between 1-10 to represent number or rows: ");
        userNum1 = scan.nextInt();
            
        System.out.println("Please enter another number between 1-10 to represent number of columns: ");
        userNum2 = scan.nextInt();

        System.out.println("Please enter a string that will start your pattern: ");
        strtPtn = scan.nextLine();
        
        System.out.println("Please another string that will end your pattern: ");
        endPtn = scan.nextLine();
        
        System.out.println("Please enter a final string that will seperate your start and end pattern: ");
        midPtn = scan.nextLine();
        
        for(int i = 1 ;i <= userNum1; i++){ 
            for(int x = 1;x <= userNum2 - 1; x++){ 
               
                if(((i + x) %2 ) == 0){ 
                    System.out.print(strtPtn + midPtn); }
                
                else{ System.out.print(endPtn + midPtn); } 
            } 
            
            int x = 1;

            if(((i + x) %2 ) == 0){
             System.out.print(strtPtn); }
            
            else{ System.out.print(endPtn); }
        } 
    } 
}