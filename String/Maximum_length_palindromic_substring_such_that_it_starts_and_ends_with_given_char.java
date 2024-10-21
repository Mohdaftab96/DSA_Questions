


//String str = "geeksforgeeks";
//char ch = 'k';
//Maximum length palindromic substring start and end with given Char : 1

//String str = "lapqooqpqpl";
//char ch = 'p';
//Maximum length palindromic substring start and end with given Char : 6

//String str = "banana";
//char ch = 'a';
//Maximum length palindromic substring start and end with given Char : 5



public class Maximum_length_palindromic_substring_such_that_it_starts_and_ends_with_given_char{

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




    static int getStartAndEndWithGivenCharacter(String str, int n, char ch){


        String sum = "";
        int maxCount = 0;
        for(int i=0; i<n; i++){
            if(str.charAt(i) == ch){

                for(int j=n-1; j>=i; j--){
                    if(str.charAt(j) == ch){

                        sum = str.substring(i, j+1);
//                        System.out.println(sum + " "); //

                            if(isPalindrome(sum)){
                                int x = sum.length();

                                if(x > maxCount){
                                    maxCount = x;
                                }
                            }
                        }
                    }
                }
            }

        return maxCount;
    }

    public static void main(String[] args){

        String str = "banana";
        char ch = 'a';
        int n = str.length();

//        getStartAndEndWithGivenCharacter(str, n, ch);

         System.out.println("Maximum length palindromic substring start and end with given Char : " + getStartAndEndWithGivenCharacter(str, n, ch));





    }
}

