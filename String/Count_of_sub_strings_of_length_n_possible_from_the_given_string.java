

// String str = "geeksforgeeks", n = 5 
// Output: 9 
// All possible sub-strings of length 5 are "geeks", "eeksf", "eksfo", 
// "ksfor", "sforg", "forge", "orgee", "rgeek" and "geeks".

// Input: str = "jgec", N = 2 
// Output: 3 



//------------------------Approach : 01----------------------------


public class Count_of_sub_strings_of_length_n_possible_from_the_given_string{

    static int countSubstrings(String str, int n){



        String sum = "";
        int count = 0;
        for(int i=0; i<=str.length() - n; i++){
            sum = str.substring(i, i+n);
            count = count + 1;
        }
        return count;
    }

    public static void main(String[] args){

        String str = "geeksforgeeks";
        int n = 5;
//        countSubstrings(str, n);

        System.out.println(countSubstrings(str, n));


    }
}





