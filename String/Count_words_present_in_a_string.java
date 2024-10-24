
// Input : words[] = { "welcome", "to", "geeks", "portal"}
//             str = "geeksforgeeks is a computer science portal for geeks."
// Output :  2
// Two words "portal" and "geeks" is present in str.


// output
// String[] word = {"welcome", "to", "geeks", "aftab", "GeeksforGeeks"};
// String str = "GeeksforGeeks a computer science portal for geeks";
// Count Occurence is : 2


//==============Method - 01=====================


public class Count_words_present_in_a_string{
    public static void main(String[] args){

    String words[] = {"Save", "Water", "Save", "Yourself"};
    String str = "Save.";


    int count = 0;
    int n = words.length;
    for(int i=0; i<n; i++){
        if(str.contains(words[i])){
            count = count + 1;
        }
    }

    System.out.println("Count Occurrence : " + count);

    }
}






//==============Method - 02=====================


/* 
import java.util.HashSet;

public class Count_words_present_in_a_string{

    static int countWords(String str, String[] words) {

        HashSet<String> hs = new HashSet<>();
        int n1 = words.length; // this n1 only for words
        for(int i=0; i<n1; i++){
            hs.add(words[i]);
        }
        

        //Removing Dot(.) which is given in str
        StringBuilder sb = new StringBuilder(); 
        int n2 = str.length(); // this n2 only for str
        for(int i=0; i<n2; i++){
            char temp = str.charAt(i);
            if(temp != '.'){
                sb.append(temp);
            }
        }

        String str1 = sb.toString(); // converting StringBuilder object to String
        // System.out.print(str1 + " ");

        String[] arr = str1.split( " ");
        int n3 = arr.length;

        int count = 0;
        for(int i=0; i<n3; i++){
            if(hs.contains(arr[i])){
                count = count + 1;
            }
        }

        return count;
        
    }
 


    public static void main(String args[]){

        String[] words = {"welcome", "to", "geeks", "portal"};
        String str = "geeksforgeeks is a computer science portal for geeks.";

        // String words[] = {"Save", "Water", "Save", "Yourself"};
        // String str = "Save";

        // countWords(str, words);
        System.out.println("Count Occurence is : " + countWords(str, words));

    }
    
}

*/



