

// String s1 = "for";
// String s2 = "geeksforgeeks";
// Not Present 



// String s1 = "practice";
// String s2 = "geeksforgeeks";
// Present at index : 5

public class check_if_a_String_is_Substring_of_Another_String{

    static int isSubstring(String s1, String s2){


        return s2.indexOf(s1);
    }

    public static void main(String[] args){

        String s1 = "practice";
        String s2 = "geeksforgeeks";

        int x = isSubstring(s1, s2);

        if(x == -1){
            System.out.print("Not Present ");
        }else{
            System.out.println("Present at index : " +  x);
        }




    }
}




