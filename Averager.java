package averager;
import java.util.Scanner;

/**
 *
 * @author dzt28
 */
public class Averager {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0;
        double scanned;
        int counter = 0;
        
        do{
            System.out.println("Enter a number greater than 0(-1 to stop): ");
            scanned = scan.nextDouble();
            if(scanned != -1){
                total += scanned;
                counter ++;}
            else{continue;}
        }
        while(scanned != -1);
        
        System.out.format("Your avergae is: " +total/counter);
        }
}
