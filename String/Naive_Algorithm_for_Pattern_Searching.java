

//String str = "AABAACAADAABAABA";
//String pattern = "AABAD";
//Pattern NOT found


//String str = "AABAACAADAABAABA";
//String pattern = "AABA";
//Pattern found at index : 0
//Pattern found at index : 9
//Pattern found at index : 12


//===================Method - 01==========================

public class Naive_Algorithm_for_Pattern_Searching{

    static void patternSearching(String str, String pattern){

        int n1 = str.length();
        int n2 = pattern.length();

        boolean found = false;
        String subStr = "";
        for(int i=0; i<=n1-n2; i++) {
            subStr = str.substring(i, i + n2);
            if(pattern.equals(subStr)){
                System.out.println("Pattern found at index : " + i);
                found = true;
            }
        }
        if(!found == true){
            System.out.println("Pattern Not Found");
        }
    }


    public static void main(String[] args){

        String str = "THIS IS A TEST TEXT";
        String pattern = "TESsT";
        patternSearching(str, pattern);
    }
}





//===================Method - 02==========================
/* 
public class Naive_Algorithm_for_Pattern_Searching{

    static void patternSearching(String str, String pattern){

        boolean found = false;
        int n = str.length();
        int m = pattern.length();
            for(int i=0; i<=n-m; i++){
                if(str.substring(i,i+m).equals(pattern)){
                    System.out.println("Pattern found at index : " + i);
                    found = true;
                }
            }
            if(!found == true){
                System.out.println("Pattern NOT found ");
            }
        

    } 


    public static void main(String[] args){

        String str = "AABAACAADAABAABA";
        String pattern = "AABA";
        patternSearching(str, pattern);
    }
}


*/




