
// Input: arr[] = {"abc", "car", "ada", "racecar", "cool"}
// Output: "racecar"
// Explanation: The Last string that is palindromic is "racecar" 
// Note that "ada" is also palindromic, but it is not the Last.

// Input: arr[] = {"def", "aba"}
// Output: "aba"

//===============Method - 01===============



public class Find_Last_Palindrome_String_in_the_given_Array{

    static boolean isPalindrom(String s){
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return  false;
            }
            left++;
            right--;
        }
        return true;
    }

    static String findAllPalindrome(String[] str, int n){


            for(int i=n-1; i>=0; i--){
                if(isPalindrom(str[i])){
                    return str[i];
                }
            }

            return "no palindrome found";
        }


    public static void main(String[] args){

        String[] str = {"abc", "car", "ada", "racecar", "cool"};
        int n = str.length;

        System.out.println(findAllPalindrome(str, n));







    }
}



//===============Method - 02===============


/*
 
import java.util.Scanner;
public class Find_Last_Palindrome_String_in_the_given_Array{
    static boolean isPalindrom(String s){

        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    static int lastPalindromicString(String[] str, int n, int a){


        for(int i=0; i<n; i++){
            if(isPalindrom(str[i])){
                a = i;
            }
        }
        return a;
    }

    public static void main(String[] args){
        String[] str = {"def", "aba", "cool", "madam"};
        int n = str.length;
        int a = 0;


        int x = lastPalindromicString(str, n, a);
        System.out.print("Total Number of given character is : " + str[x]);

    }
}


 */