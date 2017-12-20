package charcounter;
import java.util.Scanner;
/**
 *
 * @author dzt
 */
public class CharCounter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputEntry, inputCharacter;
        inputEntry = "";
        inputCharacter = "Null";
        int counter, x;
        counter = 0;
        x = 0;
        while(inputEntry.length() < 2){
            System.out.println("Please type a string of your choosing: ");
            inputEntry = scan.nextLine();
            if(inputEntry.length() < 2){System.out.println("Please enter atleast a 2 character string...");}
        }
        
        while(inputCharacter.length() != 1){
            System.out.println("Now enter the character you would like to find the number of occurences of: ");
            inputCharacter = scan.nextLine();
            if(inputCharacter.length() != 1){System.out.println("Enter only 1 alphanumeric character...");}
        }
        while(x != inputEntry.length()){
            if(!Character.toString(inputEntry.charAt(x)).equals(inputCharacter)){x++;}
            else{counter++; x++;}    
        }
        System.out.format("There was %d occurrence of \"%s\" in %s",counter, inputCharacter, inputEntry);
    }
        
}
