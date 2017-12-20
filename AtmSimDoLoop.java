package atmsimdoloop;
import java.util.Scanner;
/**
 *
 * @author dzt28
 */
public class AtmSimDoLoop {

    public static void main(String[] args) {
        
        double defBalance = 230.54;
        int userSelect = 0;
        Scanner scan = new Scanner(System.in);
        
        while(userSelect != 4){
            System.out.printf("Hello, please make a selection from the menu below\n"
                + "\nCuffrrent balance: $%1.2f"
                + "\n1. Balance"
                + "\n2. Deposit"
                + "\n3. Withdrawal"
                + "\n4. Quit\n\n", defBalance);
            userSelect = scan.nextInt();
        
            switch(userSelect){
                case 1:
                    System.out.printf("Your current balance is, $%1.2f\nGood bye", defBalance);
                    break;
                case 2:
                    System.out.println("How much would you like to deposit(e.g., 100.00): ");
                    double depositReq = scan.nextDouble();
                    defBalance = defBalance + depositReq;
                    System.out.printf("\n\nYou now have $%1.2f in your account\nGood bye", defBalance);
                    break;
                case 3:
                    System.out.println("How much would you like to withdraw(e.g., 50.00): ");
                    double withdrawReq = scan.nextDouble();
                    defBalance = defBalance - withdrawReq;
                    System.out.printf("You now have $%1.2f in your account\nGood bye", defBalance);
                    break;
                case 4:
                    System.out.println("OK, Good bye");
                    break;
        
        }
    }
    }
}
