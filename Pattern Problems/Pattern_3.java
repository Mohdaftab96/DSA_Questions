

// Enter the value of Rows and Columns : 5 6
// 1 1 1 1 1 1 
// 2 2 2 2 2 2 
// 3 3 3 3 3 3 
// 4 4 4 4 4 4 
// 5 5 5 5 5 5 




import java.util.Scanner;
public class Pattern_3 {
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);


            System.out.print("Enter the Rows : ");
            int n1 = sc.nextInt(); // n1 = 4

            System.out.print("Enter the Cols : ");
            int n2 = sc.nextInt(); // n2 = 8

            for(int i=1; i<=n1; i++){
                  for(int j=1; j<=n2; j++){
                        System.out.print(i + " ");
                  }
                  System.out.println();
            }


      }
}













