


// Enter the n value  : 4
// 2 
// 3 3
// 4 4 4
// 5 5 5 5
// 5 5 5 5
// 4 4 4
// 3 3
// 2

import java.util.Scanner;
public class Pattern_50{
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the n value  : ");
            int n = sc.nextInt(); //n = 4

         
           
            for(int i=1; i<=n; i++){
                  for(int j=1; j<=i; j++){
                        System.out.print(i+1 + " ");
                  }
                  System.out.println();
            }


            // //====Lower Triangle=====

            for(int i=1; i<=n; i++){
                  int count = n-i+2;
                  for(int j=1; j<=n-i+1; j++){
                        System.out.print(count + " ");
                  }
            System.out.println();

            }


    }    
}




      


