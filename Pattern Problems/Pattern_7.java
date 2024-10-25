

// Enter the Rows : 4
// Enter the Cols : 5
// 1 3 5 7 9 
// 2 4 6 8 10 
// 11 13 15 17 19 
// 12 14 16 18 20



import java.util.Scanner;
public class Pattern_7{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Rows : ");
            int n1 = sc.nextInt(); // n1 = 4

            System.out.print("Enter the Cols : ");
            int n2 = sc.nextInt(); // n2 = 4


            int count1 = 1;
            int count2 = 2;
            for(int i=1; i<=n1; i++){
                  for(int j=1; j<=n2; j++){
                      if(i % 2 == 1){
                        System.out.print(count1 + " ");
                        count1 = count1 + 2;
                      }else{
                        System.out.print(count2 + " ");
                        count2 = count2 + 2;
                      }  
                  }
                  System.out.println();
            }
      
            
      }     
}


