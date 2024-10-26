


// Enter the value : 5
//         1
//       1 2 1
//     1 2 3 2 1 
//   1 2 3 4 3 2 1
// 1 2 3 4 5 4 3 2 1



import java.util.Scanner;
public class Pattern_24 {
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the value : ");
            int n = sc.nextInt();

            for(int i=1; i<=n; i++){
                  int space = n-i;
                  while(space > 0){
                        System.out.print(" " + " ");
                        space = space - 1;
                  }

                  for(int j=1; j<=i; j++){
                        System.out.print(j + " ");
                  }


                  for(int j=2; j<=i; j++){
                        System.out.print(i-j + 1 + " ");

                  }
                  System.out.println();
            }

           
      }
      
}














































