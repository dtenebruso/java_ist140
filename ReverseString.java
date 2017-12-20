/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;
import java.util.Scanner;
/**
 *
 * @author dzt28
 */
public class ReverseString {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       String userString = "NUL";
       int i = 0;
       
       while(userString.length() < 5){
           System.out.print("Please enter a string you'd like to see backwards: ");
           userString = scan.nextLine();
       }
       String revStr1 = "";
        
        for (int n = userString.length()-1 ; n >= 0 ; n--){
            revStr1 = revStr1 + userString.charAt(n);}
       System.out.println("\n\nYour string reversed is:\n"+revStr1);
       
    }
    
}
