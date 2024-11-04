

// arr = {1, 1, 2, 2, 2, 2, 3};
// x = 1;
// Count number of occurrences : 2


// arr = {1, 1, 2, 2, 2, 2, 3};
// x = 2;
// Count number of occurrences : 4



public class Count_number_of_occurrences_in_a_sorted_array{

      static int countOccurrences(int[] arr, int x, int n){

           

            int count = 0;
            for(int i=0; i<n; i++){
                  if(arr[i] == x){
                        count = count + 1;
                  }
            }
            return count;
      }

      public static void main(String args[]){
            
            int[] arr = {1, 1, 2, 2, 2, 2, 3};
            int n = arr.length;
            int x = 1; // Given 

            // countOccurrences(arr, x, n);

            System.out.println(" Count number of occurrences : " + countOccurrences(arr, x, n));

            
   
            
      }
}
