
// unique substring

//Input: str = "abba"
//Output: 4
//Explanation:
//There are 4 unique substrings. They are: "a", "ab", "b", "ba".

//Input: str = "acbacbacaa"
//Output: 10
//Explanation:
//There are 10 unique substrings. They are: "a", "acb", "ac", "b", "c", "cba", "bac", "ca", "cb", "ba".




import java.util.HashSet;

public class Count_of_all_unique_substrings_with_non_repeating_characters_GitHub {

    static int findUniquesElement(String str,int n){

        HashSet<String> S = new HashSet<String>();

        for(int i=0; i<n; i++){

            boolean[] freq = new boolean[26];
            String s = "";


            for(int j=i; j<n; j++){
                int pos = str.charAt(j) - 'a';
                if(freq[pos] == true){
                    break;
                }
                freq[pos] = true;

                s = s + str.charAt(j);

                S.add(s);
            }
        }

        return S.size();
    }


    public static void main(String[] args) {
        String str = "acbacbacaa";
        int n = str.length();

//        findUniquesElement(str, n);

        System.out.println("Count of all unique substrings with non-repeating characters : " + findUniquesElement(str, n));

    }
}