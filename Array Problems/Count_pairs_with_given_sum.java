
// arr = {1, 5, 7, -1, 5}; 
// k = 6; // given target value in question
// count pair with given sum : 3


// arr = {1, 1, 1, 1}; 
// k = 2; // target
// count pair with given sum : 6


// arr = {10, 12, 10, 15, -1}; 
// k = 125; // target
// count pair with given sum : 0




public class Count_pairs_with_given_sum {

      static int countPairSum(int[] arr, int n, int k){


            int count = 0;
            for(int i=0; i<n; i++){
                  for(int j=i+1; j<=n-1; j++){
                        if(arr[i] + arr[j] == k){
                              count = count + 1;
                        }
                  }
            }
            return count;
      }


      public static void main(String[] args){
            

            int[] arr = {1, 5, 7, -1, 5}; 
            int k = 6; // given k value in question

            // int[] arr = {1, 1, 1, 1};
            // int k = 2; 

            // int[] arr = {10, 12, 10, 15, -1};
            // int k = 125; 
            int n = arr.length;



            // countPairSum(arr, n, k);


            System.out.print("count pair with given sum : " + countPairSum(arr, n, k));




      }
}
