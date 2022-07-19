import java.util.*;

/** Problem: Given two strings s and t, return true if t is an anagram of s, and false otherwise.An Anagram is a word or phrase formed by rearranging the letters of a different 
 *            word or phrase, typically using all the original letters exactly once. 
 * Solution 1: VIPSP
 * */

public class ValidAnagram {
    public static void main(String[] args){
        System.out.println(isAnagram("ra", "ar"));
    }



    public static boolean isAnagram(String s, String t) {
        
        // validating input
        if (s.length() != t.length()){
            return false;
        }
        // Pre-preocessing
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // structural construct
        int i=0;
        while(sArray[i]==tArray[i]){
            if (i==sArray.length-1){ 
                return true;
            }
            i++;
        }
        return false;
        
        

        
    }
    
}
