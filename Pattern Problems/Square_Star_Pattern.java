

// Enter the value of Rows and Columns : 3 3
// * * * 
// * * * 
// * * *



import java.util.*;
public class Square_Star_Pattern{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of Rows and Columns : ");
            int a = sc.nextInt();
            int b = sc.nextInt();


            for(int i=1; i<=a; i++){
                  for(int j=1; j<=b; j++){
                        System.out.print("*" + " ");
                  }
                  System.out.println();
            }


      }
}


















