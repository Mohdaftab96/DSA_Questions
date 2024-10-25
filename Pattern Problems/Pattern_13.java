

// Enter the Rows : 5
// Enter the Cols : 6
// A A A A A A 
// a a a a a a
// B B B B B B 
// b b b b b b
// C C C C C C



import java.util.Scanner;
public class Pattern_13{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Rows : ");
            int n1 = sc.nextInt(); // n1 = 4

            System.out.print("Enter the Cols : ");
            int n2 = sc.nextInt(); // n2 = 4


            int count1 = 1;
            int count2 = 1;
            for(int i=1; i<=n1; i++){
                  for(int j=1; j<=n2; j++){
                        if(i%2 == 1){
                              char ch = (char)('A' + count1 - 1);
                              System.out.print(ch + " ");
                              
                        }else{
                              char ch = (char)('a' + count2 - 1);
                              System.out.print(ch + " ");
                        }
                  }
                  if(i%2 == 1){
                        count1++;
                  }else{
                        count2++;
                  }
                  System.out.println();
            }
      

      }     
}


