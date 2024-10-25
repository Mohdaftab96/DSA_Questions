

// Enter the value : 5
// * * * * * * * * * 
//   * * * * * * *
//     * * * * *
//       * * *
//         *



import java.util.Scanner;
public class Pattern_30 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value : ");
        int n = sc.nextInt(); 
        
        //======Upper Pyramid======
        for(int i=1; i<=n; i++){
            int space = i-1;
            while(space > 0){
                System.out.print("  ");
                space = space - 1;
            }

            for(int j=n-i+1; j>0; j--){
                System.out.print("*"+ " ");
            }

            for(int j=n-i; j>0; j--){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        



    }
}





















