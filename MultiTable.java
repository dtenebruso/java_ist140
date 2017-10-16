package multitable;
/**
 *
 * @author dzt28
 */
public class MultiTable {

    public static void main(String[] args) {
        int tableMin, tableMax;
        tableMin = 1;
        tableMax = 9;
        
        
        System.out.print("  *  |");
        for(;tableMin <= tableMax; tableMin++){
            System.out.format("%4d", tableMin);
        }
        System.out.println();
        System.out.println("---------------------------------------------");
        tableMin = 1;
        for(;tableMin <= tableMax; tableMin++){
            System.out.format("%4d |", tableMin);
            
            for(int x = 1; x <= tableMax; x++){
                System.out.format("%4d",tableMin * x);
            }
            System.out.println();
        }
        
    }
    
}