
// Enter the n : 5
// * 
// * *
// * * *
// * * * *
// * * * * *




import java.util.*;
public class Triangle_Star_Pattern{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the n : ");
            int n = sc.nextInt();


            for(int i=1; i<=n; i++){
                  for(int j=1; j<=i; j++){
                        System.out.print("*" + " ");
                  }
                  System.out.println();
            }


      }
}
















