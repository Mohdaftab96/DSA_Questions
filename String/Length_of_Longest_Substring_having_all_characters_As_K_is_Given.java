

//Enter the String  : #1234#@@abcd
//@ is the largest substring of length : 2


//Enter the String  : abcd1111aabc
//1 is the largest substring of length : 4



public class Length_of_Longest_Substring_having_all_characters_As_K_is_Given{

    static int allCharactersAsK(String str, char ch){

        int n = str.length();
        int count = 0;
        for(int i=0; i<n; i++){
           if(ch == (str.charAt(i))){
               count = count + 1;
           }
        }
        return count;
    }

    public static void main(String[] args){

        String str = "abcd1111aabc";
        char ch = 'a';
//        allCharactersAsK(s, n, ch);

        System.out.println(" Count All character as k :  " + allCharactersAsK(str, ch));


    }
}