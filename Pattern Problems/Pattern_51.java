




// Enter the Rows  : 4
// Enter the Cols  : 7
// 1 * 2 * 3 * 4 * 5 
// 6 * 7 * 8 * 9 * 10
// 11 * 12 * 13 * 14 * 15
// 16 * 17 * 18 * 19 * 20

import java.util.Scanner;
public class Pattern_51 {
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Rows  : ");
            int n1 = sc.nextInt(); //n1 = 3

            System.out.print("Enter the Cols  : ");
            int n2 = sc.nextInt(); //n2 = 7

         
            int count = 1;
            for(int i=1; i<=n1; i++){
                  for(int j=1; j<=n2; j++){
                        if(j%2 == 0){
                              System.out.print("*" + " ");
                        }else{
                              System.out.print(count + " ");
                              count = count + 1;
                        }
                  }
                  System.out.println();
            }


    }    
}




      


