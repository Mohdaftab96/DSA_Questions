

// Enter the Rows : 4
// Enter the Cols : 5
// A B C D E 
// A B C D E
// A B C D E
// A B C D E



import java.util.Scanner;
public class Pattern_8{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Rows : ");
            int n1 = sc.nextInt(); // n1 = 4

            System.out.print("Enter the Cols : ");
            int n2 = sc.nextInt(); // n2 = 4


            
            for(int i=1; i<=n1; i++){
                  for(int j=1; j<=n2; j++){
                        char ch = (char)('A' + j - 1);
                        System.out.print(ch + " ");
                  }
                  System.out.println();
            }
      

      }     
}


