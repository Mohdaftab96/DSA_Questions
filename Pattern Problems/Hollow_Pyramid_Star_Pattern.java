


// Enter the Rows : 5
//         * 
//       *   *
//     *       *
//   *           *
// * * * * * * * * *



import java.util.Scanner;
public class Hollow_Pyramid_Star_Pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Rows : ");
        int n = sc.nextInt(); //n1 = 4
        
        
       
        for(int i=1; i<=n; i++){
            int space = n-i; // 3, 2, 1
            while(space > 0){
                System.out.print("  ");
                space = space - 1;
            }
            
            for(int j=1; j<=(2*i-1); j++){
                if(j==1 || j == (2*i-1) || i == n){
                    System.out.print("*" + " ");
                }else{
                    System.out.print(" " + " ");
                } 
                
            }


            
            
            System.out.println();
        }

       



    }
}




















