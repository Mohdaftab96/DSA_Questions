

// OUTPUT
// String str : "geeksforgeeks"
// e --> 4
// g --> 2
// k --> 2
// s --> 2

// String str : "test string"
// s -> 2
// t -> 3


import java.util.Arrays;
public class Print_all_the_duplicate_characters_in_a_string{
    static void printDuplicates(String str){

        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String sortedArray = new String(arr);
        // System.out.println(sortedArray + " ");
        int n = sortedArray.length();

        for(int i=0; i<n; i++){
            int count = 1;
            while(i<n-1 && arr[i] == arr[i+1]){
                count = count + 1;
                i = i + 1;
            }
            if(count > 1){
                System.out.println(arr[i] + " -> " + count);
            }
        }



    }

    public static void main(String[] args){
       String str = "test string";

       printDuplicates(str);


        
     
    }
}
  
  
