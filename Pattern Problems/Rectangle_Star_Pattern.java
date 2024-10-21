

// Enter the Rows : 4
// Enter the Cols : 6
// ******
// ******
// ******
// ******


import java.util.Scanner;
public class Rectangle_Star_Pattern{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Rows : ");
            int n1 = sc.nextInt(); // rows = 4
            

            System.out.print("Enter the Cols : ");
            int n2 = sc.nextInt(); // cols = 6
            
            for(int i=1; i<=n1; i++){
                  for(int j=1; j<=n2; j++){
                        System.out.print("*");
                  }
                  System.out.println();
            }
      }

}
