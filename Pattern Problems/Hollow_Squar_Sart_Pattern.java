

// Enter the n : 4
// ****
// *  *
// *  *
// ****


// Hollow_Squar_Sart_Pattern

import java.util.Scanner;
public class Hollow_Squar_Sart_Pattern{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);


            System.out.print("Enter the n : ");
            int n = sc.nextInt(); // n = 4
            
            
            for(int i=1; i<=n; i++){
                  for(int j=1; j<=n; j++){
                        if(i==1 || j==1 || i == n || j == n){
                              System.out.print("*");
                        }else{
                              System.out.print(" ");
                        }
                  }
                  System.out.println();
            }
      }

}
