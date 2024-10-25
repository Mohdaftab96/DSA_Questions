
// String = "ABCA"
// count of distinct characters : 18

// String = "AAAB"
// count of distinct characters : 10


//==========Method - 01================
 
import java.util.HashSet;
public class Find_distinct_characters_in_distinct_substrings_of_a_string_GitHub{

    static int countTotalDistinct(String str, int n) {


        int count = 0;
        HashSet<String>  items = new HashSet<>();
        for(int i=0; i<n; i++){

            String temp = "";

            HashSet<Character> ans = new HashSet<>();
            for (int j = i; j < n; j++){

                temp = temp + str.charAt(j);
                ans.add(str.charAt(j));

                if(!items.contains(temp)){

                    items.add(temp);

                    count = count + ans.size();
                }
            }
        }

    return count;
    }


    public static void main(String[] args){
        String str = "AAAB";
        int n = str.length();

//                countTotalDistinct(str, n);



        System.out.println(" count of distinct characters : " + countTotalDistinct(str, n));
    }
}



//===============Method - 03=================
/*
 import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main{


        static int  distinctCharacter(String str, int n){

            HashSet<String> hash1 = new HashSet<String>();
            String subStr = "";
            boolean strr;
            int count = 0;

            for(int i=0; i<n; i++){

                HashSet<Character> hash2 = new HashSet<Character>();
                for(int j=i+1; j<=n; j++){
                    subStr = str.substring(i, j); // a, ab, abc, abca

                    if(!hash1.contains(subStr)){
                        hash1.add(subStr);


                        for (int k = 0; k < subStr.length(); k++){
                            if (!hash2.contains(subStr.charAt(k))){
                                hash2.add(subStr.charAt(k));
                            }
                        }
                        int x = hash2.size();
                        count = count + x;
                    }
                }
            }
            return count;
        }
        
        public static void main(String[] args) {

            String str = "abcdea";
            int n = str.length();

//            distinctCharacter(str, n);
            System.out.println(distinctCharacter(str, n));


        }
}


 */