

// int[] arr = {2, 3, 4, 5, 4, 6, 4, 7, 4, 5, 6, 6};
// 4 -> 4
// 5 -> 2
// 6 -> 3


// int[] arr = {4, 4, 5, 5, 6};
// 4 -> 2
// 5 -> 2

import java.util.Arrays;
public class Find_the_frequencies_of_all_duplicates_elements_in_the_array {

      static void findDublicateElements(int[] arr){

            int n = arr.length;

            int j;

            
            for(int i=0; i<n; i++){
                  int count = 1;
                  while(i<n-1 && arr[i] == arr[i+1]){
                        count = count + 1;
                        i++;
                  }
                  if(count >= 2){
                        System.out.println(arr[i] + " -> " + count);
                  }
            }      
      }
      
      public static void main(String[] args){

            
            int[] arr = {4, 4, 5, 5, 6};
            // int[] arr = {2, 3, 4, 5, 4, 6, 4, 7, 4, 5, 6, 6};
            int n = arr.length;
            Arrays.sort(arr); 
            findDublicateElements(arr);
            

            
      }
}


