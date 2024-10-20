

//-----------------Approach - 01-------------------------


//Input: str = "GeeksforGeeks", A = "Geeksfo", B = "rGeeks"
//Output: Yes str = A + B = "Geeksfo" + "rGeeks" = "GeeksforGeeks"

//Input: str = "Delhicapitals", B = "Delmi", C = "capitals"
//Output: No



public class Check_whether_given_string_can_be_generated_after_concatenating_given_strings{

    static boolean checkString(String str, String str1, String str2){

        String str3 = str1 + str2;
        if(str.equals(str3)){
            return true;
        }
        return false;
    }

    public static void main(String[] args){

        String str = "Delhicapitals";
        String str1 = "Delmi";
        String str2 = "capitals";

//        checkString(str, str1, str2);

        if(checkString(str, str1, str2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }



    }
}



