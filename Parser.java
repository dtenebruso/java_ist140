package parser;
import java.util.*;
/**
 *
 * @author dzt28
 */
public class Parser {

    public static void main(String[] args) {
        /*
        * Declare and initialize:
        * 1) the string vairable for the user comma-separated string of ints
        * 2) the stdin scanner object
        * 3) the integer wrapped ArrayList
        */
        String userString = null;
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<Integer>();
        
        System.out.print("Enter a string of comm-seperated integers:(ex.\"4, 12, 8\")::  ");
        userString = scan.nextLine();
        
        //create a immutable list to stuff the result of splitting the user input
        //this allows us to split the string at each [comma][space] and take out only the integers
        String[] justIntegers = userString.split(", "); //feel free to replace with regex to avoid user error
        // loop over each object in the new list containing the product of splitting out the [comma][space]
        for( String x : justIntegers){
            intList.add(Integer.parseInt(x)); // parse each number in the string list to the integer wrapped ArrayList
            System.out.println(x); // print each digit after adding to the ArrayList  
        } 
        
    }
    
}
