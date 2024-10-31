
// Enter length of Array : 6
// Enter Array Elements : 7 10 4 3 20 15
// Enter the kth value : 3
// 3rd Smallest Element in Given Array : 7

// Enter length of Array : 6
// Enter Array Elements : 7 10 4 3 20 15
// Enter the kth value : 4
// 3rd Smallest Element in Given Array : 10


//======Method-01=======Tc: O(n)=======

import java.util.Arrays;
import java.util.Scanner;
public class Kth_Smallest_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the Array Numbers : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // Sorting Arrays

        System.out.print("Enter the K element");
        int k = sc.nextInt(); // k = 1


        for(int i=0; i<n; i++){

            if(i == k){
                System.out.print(k+ "th" + " smallest element is : " + arr[i-1]);
            }
        }



    }
}



//============Method-02====Tc: O(n^2)====================
/*
 



import java.util.Scanner;
public class Easy_Kth_Smallest_Numbers {

      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter length of Array : ");
            int n = sc.nextInt(); // n = 6

            int[] arr = new int[n];

            System.out.print("Enter Array Elements : ");
            for(int i=0; i<n; i++){
                  arr[i] = sc.nextInt(); // 7 10 4 3 20 15
            }

            System.out.print("Enter the kth value : ");
            int k = sc.nextInt(); //k = 3

            int temp;
            for(int i=0; i<n ; i++){
                  for(int j=i+1; j<=n-1; j++){
                        if(arr[i] > arr[j]){
                              temp = arr[i];
                              arr[i] = arr[j];
                              arr[j] = temp;
                        }
                  }
            }

            for(int i=0; i<n; i++){
                  if(i == k){
                        System.out.println(k+ "th" + " smallest element is : " + arr[i-1]);
                    }
            }
             

            
      }
}
 */