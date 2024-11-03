


// arr = {200, 10, 10, 100}
// Minimum value : 2
// Maximum value : 100


// arr = {2, 10, 500, 100}
// Minimum value : 2
// Maximum value : 500



import java.util.Scanner;
public class Find_the_Maximum_and_Minimum_element_array {

            public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            int[] arr = {2, 10, 500, 100};
            int n = arr.length;

            int min = arr[0];
            int max = arr[0];

            for(int i=1; i<n; i++){

                  if(arr[i]>max){
                        max = arr[i];
                  }

                  if(arr[i] < min){
                        min = arr[i];
                  }

            }

            System.out.println("Minimum value : " + min);
            System.out.println("Maximum value : " + max);

           


      }
}
