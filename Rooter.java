package rooter;
import java.util.Scanner;
/**
 *
 * @author dzt28
 */
public class Rooter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start;
        start = 0;
        
        while(start <= 0){    
            System.out.println("Please enter a number greater than 0: ");
            start = scan.nextInt();
            if(start <= 0){
                System.out.format("%d is not greter than 0.. Try something like 982007569\n", start);
            }}

        while(start != -1){
            System.out.format("The square root of %d is %.4f%n", start, Math.sqrt(start));
            start--;
        }
    }
    
}
