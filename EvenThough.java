package eventhough;

/**
 *
 * @author dzt28
 */
public class EvenThough {

    public static void main(String[] args) {
        int lastNum, index;
        lastNum = 20;
        index = 1;
        
        
        while(index != lastNum+1){
            if(index%2 == 0){
                if(index != lastNum){
                    System.out.format("%d, ", index);
                    index++;
                }
                else{System.out.print(index);
                index++;
            }
            }
            else{index++;}
        }
    }
}
