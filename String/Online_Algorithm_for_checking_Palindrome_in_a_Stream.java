
// Time compexity is : O(n^3)


// a  :  Yes
// ab:   No
// abc:  No
// abcb: No
// abcba  : Yes
// The total number of Palindroms of given String is : 2
// The No Number of Palindroms of given String is : 3


// a  : Yes
// aa  : Yes
// aab: No
// aaba: No
// aabaa  : Yes
// aabaac: No
// aabaaca: No
// aabaacaa: No
// aabaacaab: No
// aabaacaaba: No
// aabaacaabaa  : Yes
// The total number of Palindroms of given String is : 4
// The No Number of Palindroms of given String is : 7



//==========Another way to solve this========== Time compexity is : O(n^2)===============


public class Online_Algorithm_for_checking_Palindrome_in_a_Stream {

    static boolean isPalindrome(String s){

        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            while(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    static void checkPalindrome(String str, int n){



        String subStr = "";
        
        for(int i=0; i<n; i++){
            subStr = str.substring(0, i+1);
            if(isPalindrome(subStr)){
                System.out.println(subStr + " is palindrome ");
            }else{
                System.out.println(subStr + " is not Palindrom");
            }
        }

    }

    //Driver Code
    public static void main(String[] args){

        String str = "abcba";
        int n = str.length();

        checkPalindrome(str, n);




    }
}














//==========Another way to solve this======== Time compexity is : O(n^3)=================

/* 

import java.util.Scanner;
public class Online_Algorithm_for_checking_Palindrome_in_a_Stream {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);


            System.out.print("Enter the String : ");
            String str = sc.next(); // str = "abcba"
            int n = str.length();

            String[] arr = new String[100];

            String sum = "";
            int count1 = 0;
            int count2 = 0;
            int flag = 0;
            for(int i=0; i<n; i++){
                    sum = str.substring(0, i+1);
                    int n1 = sum.length();


                    String rev = "";
                    for(int k=n1-1; k>=0; k--){
                        rev = rev + sum.charAt(k);
                    }


                    if(sum.equals(rev)){
                        count1++;
                        flag = 1;
                        System.out.println(sum + " " + " : Yes");
                    }else{
                        System.out.println(sum + ": No");
                        count2++;
                    }

                    
                
                }
            
                
            
            System.out.println("The total number of Palindroms of given String is : " + count1);
            System.out.println("The No Number of Palindroms of given String is : " + count2);


        }       
    }

*/

    