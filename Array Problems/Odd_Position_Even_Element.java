
// Enter the  Number : 6
// Enter the Array Number : 2 1 4 4 5 7
// Odd Index Even Elements : 4

import java.util.Scanner;
public class Odd_Position_Even_Element{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the  Number : ");
        int n = sc.nextInt(); // n1 = 4

        int[] arr = new int[n];

        System.out.println("Enter the Array Number : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // 1 2 3 4
        }

        System.out.print("Odd Index Even Elements : ");
       
        for(int i=0; i<n; i++){
                if(i%2 == 1 && arr[i]%2 == 0){
                    System.out.print(arr[i] + " ");
            }
        }










    }
}
