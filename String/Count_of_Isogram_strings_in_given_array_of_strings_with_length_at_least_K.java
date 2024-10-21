

// Enter the Array String Values : ag bka lkmn asdfg (k = 4)
// Count Isogram : 4

// String[] str = {"abcd", "der", "erty"} (k = 4)
// Count Isogram : 4


// String[] str = {"ag", "bkba", "lkmnn", "asdfg"} (k = 2)
// Count Isogram : 2



public class Count_of_Isogram_strings_in_given_array_of_strings_with_length_at_least_K {

    static boolean isPalindrome(String s){

        
        int n = s.length();  
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n-1; j++){
                if(s.charAt(i) == s.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }


    static int countIsogram(String[] str, int k){

        int count = 0;
        for(String st: str){
            if(isPalindrome(st) && st.length() >= k){
                count = count + 1;   
            }
        }
        return count;
                
       
    }

    //Driver Code
    public static void main(String[] args){

        String[] str = {"ag", "bkba", "lkmnn", "asdfg"};
        int k = 2; 
      
        // countIsogram(str, k);

        System.out.println("Count Isogram : " + countIsogram(str, k));



    }
}
    