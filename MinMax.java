package minmax;
import java.util.Scanner;
/**
 *
 * @author dzt28
 */
public class MinMax {
    //define and initialize public array to use in multiple methods
    public static double userNums[] = new double[5];
    
    public static void main(String[] args) {
        getInput();
        printDiff();
    }
    
    public static double getInput(){     
        Scanner scan = new Scanner(System.in);
        //receive user input(doubles) and stuff them into the array
        for(int x = 0; x < 5; x++){ 
            System.out.print("Please enter a number: ");
            userNums[x] = scan.nextDouble();
            System.out.println();
        }
        return 1;
    }
    
    public static void printDiff(){
        double high = userNums[0]; //initialize with variable object to avoid assigning a number higher than input
        double low = userNums[0];  //initialize with variable object to avoid assigning a number lower than input
        //loop over the array, comparing each value against the next
        for(int x=0; x < userNums.length; x++){
            for(int i=1; i < userNums.length; i++){
                
                if(userNums[x] <= userNums[i]){
                    //after comparing against eachother; compare against current lowest
                    if(userNums[x] <= low){
                        low = userNums[x];
                    }
                    //after comparing against eachother; compare against current highest
                    if(userNums[i] > high){
                        high = userNums[i];
                    }
                }
            }
            
        }
        System.out.format("The highest number entered is %f and the lowest number was %f",high,low);
        
    }
    
}
