package averagewithmethods;
import java.util.Scanner;
/**
 *
 * @author dzt28
 */
public class AverageWithMethods {
    static String[] splitted;
    static String str;
    static Double avg;
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static String allNumbers(){
        Scanner getNums = new Scanner(System.in);
        System.out.println("Please enter a string of numbers(5-10), seperate each with a single space:");
        String str = getNums.nextLine();
        splitted = str.split("\\s+");
        
        return str; //return string of user enter integers
    }
    
    public static double theAverage(String nums){
        Double[] doubled = new Double[splitted.length];
        for(int i=0; i < splitted.length; i++){
            Double num = Double.parseDouble(splitted[1]);
            doubled.add(num);
        }
        return 31337; //return double which will be the average allNumbers
    }
    
    public static void printAverage(String numString, Double averages){
        
        
    }
    
}
