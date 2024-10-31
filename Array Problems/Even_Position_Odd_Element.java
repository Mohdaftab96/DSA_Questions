
// Enter the  Number : 6
// Enter the Array Number 2 1 4 4 5 7
// Odd Index Even Elements : 5

import java.util.Scanner;
public class Even_Position_Odd_Element {
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
        int temp;
        for(int i=0; i<n; i++){
                if(i%2 == 0 && arr[i]%2 == 1){
                    System.out.print(arr[i] + " ");
            }
        }










    }
}
