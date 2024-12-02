import java.util.*;
public class Palindrom {
    public static void  Palindromcheck(String str) {
        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i) + " ");
        }
        System.out.println();
    }


    public static boolean isPlindrome(String str) {
        for(int i = 0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i)== str.charAt(n-1-i));
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        String str = "nayab";
        System.out.println(isPlindrome(str));
    }
   
}
