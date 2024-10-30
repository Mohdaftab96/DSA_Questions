
// Enter the Value of s1 : 1
// Enter the Value of s2 : 100
// 1 is Perfect Number
// 6 is Perfect Number
// 28 is Perfect Number


// Enter the Value of s1 : 1
// Enter the Value of s2 : 500
// 1 is Perfect Number
// 6 is Perfect Number
// 28 is Perfect Number
// 496 is Perfect Number



import java.util.Scanner;
public class display_RANGE_of_PERFECT_NUMBERS {

       public static void main(String[] args){
            Scanner sc = new Scanner(System.in);


            System.out.print("Enter the Value of s1 : ");
            int s1 = sc.nextInt(); // s1 = 1

            System.out.print("Enter the Value of s2 : ");
            int s2 = sc.nextInt(); // s2 = 100

            
            int i;
            for(i=s1; i<s2; i++){
                  int sum = 1;
                  for(int j=2; j<i; j++){
                        if(i%j == 0){
                              sum = sum + j;
                        }
                  }  

                  if(sum == i){
                        System.out.println(i + " is Perfect Number");
                  }
            
            }


      }
}