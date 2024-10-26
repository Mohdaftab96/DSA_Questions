

// Enter the n Value : 5
// 1 
// 2 3 
// 3 4 5 
// 4 5 6 7 
// 5 6 7 8 9 


import java.util.Scanner;
public class Pattern_3 {
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);


            System.out.print("Enter the n Value : ");
            int n = sc.nextInt(); // n1 = 4


            for(int i=1; i<=n; i++){
                  for(int j=1; j<=i; j++){
                        System.out.print(i+j-1 + " ");
                  }
                  System.out.println();
            }


      }
}













