


// Enter a Number: 10
//    *  *  *  *  *  *  *  *  *  *
//    *  *                    *  *
//    *     *              *     *
//    *        *        *        *
//    *           *  *           *
//    *           *  *           *
//    *        *        *        *
//    *     *              *     *
//    *  *                    *  *
//    *  *  *  *  *  *  *  *  *  *




import java.util.Scanner;
public class Pattern_26{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a Number: ");
            int n = sc.nextInt();


            // int count = 1;
            for(int i=1; i<=n; i++){
                  
                  for(int j=1; j<=n; j++){
                       if(i==1 || j==1 || i==n || j==n || i==j || (i+j) == n+1){  
                              System.out.print("*" + "  ");
                              //count = count + 1;
                        }else{
                              System.out.print("   ");
                       }
                  }
                  System.out.println();

                  
            }     
      }

}

