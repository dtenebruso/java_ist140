package scorer;
import java.util.Scanner;
/**
 *
 * @author dzt28
 */
public class Scorer {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] score = new double[3][3]; //initialize the 2D Array
        int x=0;
        
       while(x!=3){
           int i = 0;
           while(i != 3){
               System.out.println("Enter a number: ");
               score[x][i] = scan.nextDouble();
               i++;
           }
        x++;
       }
      /* Print test to make sure everything is where it should be
       for(int i = 0; i < 3; i++)
       {
            for(int j = 0; j < 3; j++)
            {
                System.out.format("%5.2f ", score[i][j]);
            }
            System.out.println();
        }
        Confirmed everything i proper */
      score_avg(score);
    }
    public static void score_avg(double[][] a){
        for(int i = 0; i < 3; i++)
       {
            double avg = 0; // init variable to hold the average of each row
            for(int j = 0; j < 3; j++) //re-using our test print code to loop through each row
            {
                avg = avg + a[i][j];
            }
            System.out.format("The average of row %d is %5.2f\n\n",(i+1), avg);
        }
        
    }
}

