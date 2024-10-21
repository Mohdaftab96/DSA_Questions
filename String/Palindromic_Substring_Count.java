
// Enter the 1st String : abbaeae
// All Substring is : abba bb aea eae
// Palindrome Substrings Count: 4


// Enter the 1st String : aaa
// All Substring is : aa aaa aa
// Palindrome Substrings Count: 3


// Enter the 1st String : abaab
// All Substring is : aba baab aa
// Palindrome Substrings Count: 3

//===============Method - 01=======================


public class Palindromic_Substring_Count{

    static boolean isPalindrome(String s){
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


    static int countPS(String str, int k){

        int count = 0;
        String subStr = "";
        int n = str.length();
            for(int i=0; i<n; i++){
                for(int j=i+1; j<=n; j++){
                    subStr = str.substring(i, j);

                    if(isPalindrome(subStr) && subStr.length() >= k){
                        count = count + 1;
//                        System.out.print(subStr + " "); // aba, baab, aa
                    }
                }
            }
        return count;
    }

    public static void main(String[] args){
        String str = "abaab";
        int k = 2;

//        countPS(str, k);

        System.out.println("" + countPS(str, k));



    }
}
 

