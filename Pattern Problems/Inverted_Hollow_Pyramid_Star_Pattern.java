

// Enter the Rows : 5
// * * * * * * * * * 
//   *           * 
//     *       * 
//       *   *
//         *



import java.util.Scanner;
public class Inverted_Hollow_Pyramid_Star_Pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Rows : ");
        int n = sc.nextInt(); //n1 = 4
        
        
       
        int count = 1;
        for(int i=1; i<=n; i++){
            int space = i-1; // 3, 2, 1
            while(space > 0){
                System.out.print("  ");
                space = space - 1;
            }
            
            for(int j=1; j<=(2*n-count); j++){
                  if(j==1 || j == (2*n-count) || i == 1){
                      System.out.print("*" + " ");
                  }else{
                      System.out.print(" " + " ");
                  } 
                
            }


            count = count + 2;
            
            System.out.println();
        }

       



    }
}




















