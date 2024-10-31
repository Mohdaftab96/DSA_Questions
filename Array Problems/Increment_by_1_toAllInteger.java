

//-------Java Program to Increment by 1 to all the Digits of a Given Integer---------

// Enter value of n : 12345
// Adding one to each element : 23456



import java.util.Scanner;
public class Increment_by_1_toAllInteger{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Enter the Number n : ");
        int n = sc.nextInt();
        
        
        
//----------------Reverse Numbers-----------------------------
        
        int sum = 0;
        int rem,s;
        while(n > 0){
            rem = n % 10;
            s = rem + 1;
            sum = sum * 10 + s; // n = sum
            n = n / 10;
        }

        //System.out.println(m + " "); // sum = 65432


//----------------Reverse Numbers-----------------------------

    
        n = sum; // copying above sum value here
        sum = 0;
        while(n > 0){
            rem = n % 10;
            sum = sum * 10  + rem;
            n = n / 10;
        }
        System.out.println(sum + " "); // sum = 23456
        
    }
} 

