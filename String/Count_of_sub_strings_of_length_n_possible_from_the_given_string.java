

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






//---------------------------Approach : 02--------------------


// Time Complexity : O(n^3)
// Space Complexity : O(n)


// Enter the String : computer
// Enter the Length of M : 4
// Substring with length 4 is : comp
// Substring with length 4 is : ompu
// Substring with length 4 is : mput
// Substring with length 4 is : pute
// Substring with length 4 is : uter
// The possible substring is : 5

// Enter the String : jgec
// Enter the Length of M : 2
// Substring with length 2 is : jg
// Substring with length 2 is : ge
// Substring with length 2 is : ec
// The possible substring is : 3



