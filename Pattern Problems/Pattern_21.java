

// Enter the Upper pyramid number: 6
//            *
//          * * *
//        * * * * *
//      * * * * * * *
//    * * * * * * * * *
//  * * * * * * * * * * *
//            *
//          * * *
//        * * * * *
//      * * * * * * *
//    * * * * * * * * *
//  * * * * * * * * * * *



import java.util.Scanner;
public class Pattern_21{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Upper pyramid number: ");
        int n = sc.nextInt();  // n = 6
        
        
        
        //==============Upper pyramid====================
        for(int i=1; i<=n; i++){
            int space = n-i;
            while(space > 0){
                System.out.print("  ");
                space = space - 1;
            }
            for(int j=1; j<=i; j++){
                System.out.print(" *");    
            }

            for(int j=2; j<=i; j++){
                System.out.print(" *");    
            }
            System.out.println();
        }


        //====================Lower Pyramid ====================
        for(int i=1; i<=n; i++){
            int space = n-i;
            while(space > 0){
                System.out.print("  ");
                space = space - 1;
            }
            for(int j=1; j<=i; j++){
                System.out.print(" *");    
            }

            for(int j=2; j<=i; j++){
                System.out.print(" *");    
            }
            System.out.println();
        }

    }
}






























