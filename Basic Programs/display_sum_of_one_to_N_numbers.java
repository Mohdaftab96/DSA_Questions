




// Enter value of n : 10
// 55 

// Enter value of n : 9
// 45



import java.util.Scanner;
public class display_sum_of_one_to_N_numbers{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter value of n : ");
            int n = sc.nextInt();


            int sum = 0;
            for(int i=1; i<=n; i++){
                  sum = sum + i;
            }

            System.out.print(sum + " ");


                  
      }
}
