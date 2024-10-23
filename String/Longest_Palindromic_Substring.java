

//Enter the String = "forgeeksskeegfor"
//Longest Palindromic String is : geeksskeeg


//Enter the String = "abc"
//Longest Palindromic String is : a


//Enter the String = "geeks"
//Longest Palindromic String is :ee


//=============Method-01===============


public class Longest_Palindromic_Substring {

    static boolean isPal(String s){

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


    static String longestPalindromeSubstring(String str, int n){

        String subStr1 = "";
        String subStr2 = "";
        String maxString = "";

        for(int i=0; i<n; i++) {
            for (int j=i+1; j<=n; j++) {
                subStr1 = str.substring(i, j);
                    if (isPal(subStr1)) {
                        subStr2 = subStr1;
                        if (subStr2.length() > maxString.length()) {
                            maxString = subStr2;
                        }
                    }
                }
            }
        return maxString;
    }

    //Driver Code
    public static void main(String[] args){

        String str = "forgeeksskeegfor";
        int n = str.length();

//        longestPalindromeSubstring(str, n); // output: geeksskeeg

        System.out.println("Longest Palindrome Substring is : " + longestPalindromeSubstring(str, n));


    }
}





//=============Another Method-02===============

/* 
public class Longest_Palindromic_Substring {

    static boolean isPalindrom(String s, int left, int right){

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    static String longestPalindromicSubstring(String str, int n){
        int max = 0;
        int maxlen = 1;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(isPalindrom(str, i, j) && (j-i+1) > maxlen){
                    max = i;
                    maxlen = j-i+1;
                }
            }
        }
        return str.substring(max, max+maxlen);
    }

    public static void main(String[] args){

        String str = "forgeeksskeegfor";
        int n = str.length();

        longestPalindromicSubstring(str, n);
        System.out.println("Longest Palindromic String is : " + longestPalindromicSubstring(str, n));


    }
}

*/


