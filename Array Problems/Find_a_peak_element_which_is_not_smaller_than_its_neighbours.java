
// arr = {5, 10, 20, 15}
// index of a peak point is : 2

// arr = {10, 20, 15, 2, 23, 90, 90}
// index of a peak point is : 6

public class Find_a_peak_element_which_is_not_smaller_than_its_neighbours{

    static int findPeakElemente(int arr[], int n){


        if(n==1){
            return 0;
        }

        if(arr[0] >= arr[1]){
            return 0;
        }

        if(arr[n-1] >= arr[n-2]){
            return n-1;
        }


        for(int i=1; i<n-1; i++){
            if(arr[i]>= arr[i-1] && arr[i] >= arr[i+1]){
                return i;
            }
            
        }

        return 0;

    }


    public static void main(String[] args) {
       
        // int[] arr = {5, 10, 20, 15};
        int[] arr = {10, 20, 15, 2, 23, 90, 90};
        
        int n = arr.length;

        // findPeakElemente(arr, n);

        System.out.println("index of a peak point is : " +findPeakElemente(arr, n));





    }
}
