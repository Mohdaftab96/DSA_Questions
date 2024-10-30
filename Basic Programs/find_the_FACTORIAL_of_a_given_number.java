
// Enter the Value of n : 5
// 5 factorial is : 120

// Enter the Value of n : 6
// 6 factorial is : 720

// Enter the Value of n : 7
// 7 factorial is : 5040


import java.util.Scanner;
public class find_the_FACTORIAL_of_a_given_number {
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Value of n : ");
            int n = sc.nextInt(); 

            int i= 1;
            int fact = 1;
            while(i<=n){
                  fact = fact * i;
                  i++;
            }
            System.out.print(n + " factorial is : " + fact);


            
            // int j = n;
            // while(n>0){
            //       fact = fact * n;
            //       n--;
            // }
            // System.out.print(j + " factorial is : " + fact);

            

                  
      }
}
