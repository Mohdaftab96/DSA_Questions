

// Enter value of n : 10
// 10 9 8 7 6 5 4 3 2 1 



import java.util.Scanner;
public class Print_REVERSE_of_N_to_ONE_numbers {
      
       public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter value of n : ");
            int n = sc.nextInt();

            for(int i=n; i>0; i--){
                  System.out.print(i + " ");
            }


      }
}
