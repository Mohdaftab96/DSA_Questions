

// Enter the n Value : 5
//         * 
//       *   *
//     *       *
//   *           *
// *               *
//   *           *
//     *       *
//       *   *
//         *


// Enter the Rows : 3
//     * 
//   *   *
// *       *
//   *   *
//     *


import java.util.Scanner;
public class Hollow_Diamond_Pyramid_Impppp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n Value : ");
        int n = sc.nextInt(); //n1 = 4
        
        
        //============Upper Pyramid=========
        for(int i=1; i<=n; i++){
            int space = n-i; // 3, 2, 1
            while(space > 0){
                System.out.print("  ");
                space = space - 1;
            }
            
            for(int j=1; j<=(2 * i - 1); j++){
                if(j == 1 || j == (2 * i - 1)){
                    System.out.print("*" + " ");
                }else{
                    System.out.print(" " + " ");
                }
            }

            System.out.println();
        }

        //=============Lower Pyramid========

        for(int i=1; i<=n; i++){
        int space = i;
        while(space > 0){
            System.out.print("  ");
            space = space - 1;
        }

        for(int j=1; j<=(2 * (n-i) - 1); j++){
            if(j == 1 || j == (2 * (n-i) - 1)){
                    System.out.print("*" + " ");
            }else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
       



    }
}




           


