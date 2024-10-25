

// Enter the Rows : 5
// Enter the Cols : 6
// A b C d E f 
// A b C d E f
// A b C d E f
// A b C d E f
// A b C d E f



import java.util.Scanner;
public class Pattern_11{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Rows : ");
            int n1 = sc.nextInt(); // n1 = 5

            System.out.print("Enter the Cols : ");
            int n2 = sc.nextInt(); // n2 = 6


            
            for(int i=1; i<=n1; i++){
                  for(int j=1; j<=n2; j++){
                        if(j%2 == 1){
                              char ch = (char)('A' + j - 1);
                              System.out.print(ch + " ");
                        }else{
                              char ch = (char)('a' + j - 1);
                              System.out.print(ch + " ");
                        }
                  }
                  System.out.println();
            }
      

      }     
}


