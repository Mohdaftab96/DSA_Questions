


// Enter the n : 4
//     ****
//    ****
//   ****
//  ****


import java.util.Scanner;
public class Mirrored_Rhombus_Star_Pattern{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the n : ");
            int n = sc.nextInt(); // rows = 4

            // System.out.print("Enter the Rows : ");
            // int n1 = sc.nextInt(); // rows = 4
            
            // System.out.print("Enter the Cols : ");
            // int n2 = sc.nextInt(); // cols = 6

            
            for(int i=1; i<=n; i++){
                  int space = n-i;
                  while(space > 0){
                        System.out.print(" ");
                        space = space - 1;
                  }
                  for(int j=1; j<=n; j++){
                        System.out.print("*");
                  }
                  System.out.println();
            }
      }

}
