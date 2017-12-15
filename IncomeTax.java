package incometax;
import java.util.Scanner;
/**
 *
 * @author dzt28
 */
public class IncomeTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String maritalStatus = "";
        double annualIncome, taxRate, total;
        
        System.out.print("Are you married(yes/no): ");
        maritalStatus = scan.nextLine();
        
        System.out.print("\n\nWhat is your annual income(ex. 87500.00):: $");
        annualIncome = scan.nextDouble();
        
        if(maritalStatus.equals("yes") || maritalStatus.equals("y")){
            if(annualIncome <= 30000){
                taxRate = 0.12;
            }
            else{
                taxRate = 0.20;
            }
        }
        else if(maritalStatus.equals("no") || maritalStatus.equals("n")){
            if(annualIncome <= 30000){
                taxRate = 0.15;
            }
            else{
                taxRate = 0.25;
            }
        }
        
        System.out.println("Based on yout status of ");
    }
    
}