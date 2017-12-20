package ecommerceapp;
import java.util.Scanner;
/**
 *
 * @author dzt28
 */
public class ECommerceApp {

    static String productsCatalog;
    static double price, setTax, finTotal;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        bannerPrinter();
        String products = productsBuilder();
        System.out.print("What product are you looking for: ");
        String userSearch = scan.nextLine();
        if(getOrder(userSearch)){
            getPrice();
            getTax(price);
            getTotal(price,setTax);
            printTotal(finTotal);
        }
        else{
            System.out.println("The product was not found.");
        }
    }
    
    public static void bannerPrinter(){
        System.out.println("******************************************");
        System.out.println("====== Welcome to my eCommerce app! ======");
        System.out.println("******************************************\n");
    }
    
    public static String productsBuilder(){
        
        productsCatalog = "MegaSeeds Szechuan  Kalaxian  ";
        return productsCatalog;
    }
    
    public static boolean getOrder(String userSearch){
        //is in productCatalog string from productsBuilder??
        if(productsCatalog.toLowerCase().contains(userSearch.toLowerCase())){
            return true;
        }
        else{ 
            return false;
        }
    }
    
    public static Double getPrice(){
        //generate rand double
        price = ((Math.random() * 900) + 100) / 100.0;
        return price; //randomDouble
    }
    
    public static double getTax(Double gPrice){
        setTax = gPrice * 0.10;
        return setTax; //random double generated in price / .10
    }
    
    public static double getTotal(double a, double b){
        finTotal = a+b;
        return finTotal;
    }
    
    public static void printTotal(Double total){
        System.out.format("Your sale total is: $%.2f", total);
    }
}
