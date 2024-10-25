

// Enter the Rows : 4
// Enter the Cols : 5
// 1 2 3 4 5 
// 2 3 4 5 6 
// 3 4 5 6 7 
// 4 5 6 7 8 



import java.util.Scanner;
public class Pattern_4{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Rows : ");
            int n1 = sc.nextInt(); // n1 = 4

            System.out.print("Enter the Cols : ");
            int n2 = sc.nextInt(); // n2 = 8

            for(int i=1; i<=n1; i++){
                  for(int j=1; j<=n2; j++){
                        System.out.print(i+j-1 + " ");
                  }
                  System.out.println();
            }



            
      }
}
