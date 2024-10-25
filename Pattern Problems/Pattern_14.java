
// Enter the Rows : 4
// Enter the Cols : 4
// 1 2 2 2 
// 0 1 2 2 
// 0 0 1 2 
// 0 0 0 1



import java.util.Scanner;
public class Pattern_14{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Rows : ");
            int n1 = sc.nextInt(); // n1 = 4

            System.out.print("Enter the Cols : ");
            int n2 = sc.nextInt(); // n2 = 4


           
            for(int i=1; i<=n1; i++){
                  for(int j=1; j<=n2; j++){
                        if(i==j){
                              System.out.print("1" + " ");
                        }else if(i>j){
                              System.out.print("0" + " ");
                        }else if(j>i){
                              System.out.print("2" + " ");
                        }
                  }
                  System.out.println();
            }
      

      }     
}


