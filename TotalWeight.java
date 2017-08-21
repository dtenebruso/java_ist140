package TotalWeight;

public class TotalWeight {
    public static void main(String[] args){
        /**
         * 
         * SyntaxError: there was a missing semicolon (;) at the end of the first print statement
         * SemanticError: you should be using multiplication of the two variables to get totalWeight, not addition
         * 
         */
        int weightOfLoaf = 16; //ounces per loaf
        int numberOfLoaves = 4;
        
        System.out.print("With a weight of " + weightOfLoaf + " ounces in each loaf, ");
        System.out.println("and a total of " + numberOfLoaves + " loaves, ");
        int totalWeight = weightOfLoaf * numberOfLoaves;
        System.out.println("the total of all " + numberOfLoaves + " loaves is " + totalWeight + " ounces.");
        
        
    }
    
    
    
    
}