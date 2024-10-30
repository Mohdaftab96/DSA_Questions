
// Enter value of n : 10
// 1 2 3 4 5 6 7 8 9 10 


// Enter value of n : 25
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 

import java.util.Scanner;
public class Write_a_program_to_Print_one_to_N_numbers{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter value of n : ");
            int n = sc.nextInt();

            for(int i=1; i<=n; i++){
                  System.out.print(i + " ");
            }
   
      }
}