

// Enter the Rows : 4
// Enter the Cols : 4
// 1 2 3 4 
// 4 3 2 1 
// 1 2 3 4 
// 4 3 2 1



import java.util.Scanner;
public class Pattern_5{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Rows : ");
            int n1 = sc.nextInt(); // n1 = 4

            System.out.print("Enter the Cols : ");
            int n2 = sc.nextInt(); // n2 = 4

            for(int i=1; i<=n1; i++){
                  for(int c=n2, j=1; j<=n2; j++){
                        if(i%2 == 0){
                              System.out.print(c + " ");
                              c = c - 1;
                        }else{
                              System.out.print(j + " ");
                        }
                  }
                  System.out.println();
            }



            
      }
}

