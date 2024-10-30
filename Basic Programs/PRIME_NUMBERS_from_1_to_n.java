
// Enter the Value of s1 : 20
// Enter the Value of s2 : 40
// 23 29 31 37 

// Enter the Value of s1 : 1
// Enter the Value of s2 : 20
// 1 2 3 5 7 11 13 17 19 

// Enter the Value of s1 : 1
// Enter the Value of s2 : 40
// 1 2 3 5 7 11 13 17 19 23 29 31 37 


import java.util.Scanner;
public class PRIME_NUMBERS_from_1_to_n {
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Value of s1 : ");
            int s1 = sc.nextInt(); // s1 = 1

            System.out.print("Enter the Value of s2 : ");
            int s2 = sc.nextInt(); // s2 = 20


            int flag = 1;
            int i;
            for(i=s1; i<=s2; i++){
                  for(int j=2; j<i; j++){
                        if(i%j == 0){
                              flag = 0;
                              break;
                        }else{
                              flag = 1;
                        }
                  }

                  if(flag == 1){
                        System.out.print(i + " ");
                  }
            }

           

                  
      }
}
