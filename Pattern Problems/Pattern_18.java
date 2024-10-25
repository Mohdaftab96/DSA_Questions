

// Enter the value: 6
// $ 
// * $ 
// $ * $ 
// * $ * $ 
// $ * $ * $ 



 
import java.util.*;
public class Pattern_18{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value: ");
        int n = sc.nextInt();  // n = 3
        
        
        for(int i=0; i<n; i++){
            for(int j=1; j<=i; j++){
                    if((i+j)%2 == 0){
                        System.out.print("$" + " ");
                    }else{
                        System.out.print("*" + " ");
                    }
                }
        
            System.out.println();
        }

    }
}












































