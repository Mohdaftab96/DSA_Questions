

//----------------------------Problem - 01------------------------

// Enter the value: 5
//         * 
//       * * 
//     * * * 
//   * * * * 
// * * * * * 


 
import java.util.Scanner;
public class Pattern_20 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value: ");
        int n = sc.nextInt();  // n = 3
        
        
        
        for(int i=1; i<=n; i++){
            int space = n-i;
            while(space > 0){
                System.out.print(" " + " ");
                space = space - 1;
            }
            for(int j=1; j<=i; j++){
                System.out.print("*" + " ");    
            }
            System.out.println();
        }

    }
}






























































