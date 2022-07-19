// check if a string is a Palindrome using Iteration
public class Palindrome {
    // check if a string is a Palindrome using Iteration
    public static boolean IsPalindrome(String string){
        int leftChar=0;
        int rightChar=string.length()-1;
        boolean status=true;
        // get the index of the middle character
        int counter= 1+(string.length()-1)/2;
        while(status && counter>=1){
            if(string.charAt(leftChar)==string.charAt(rightChar)){
                counter--;
            }
            else{
                status=false;
            }
        }
        return status;
    }
    public static boolean checkPalindrome(String string, int firstIndex, int lastIndex){
        boolean status=firstIndex==lastIndex;
        if(string.charAt(firstIndex)>=string.charAt(lastIndex)){
            return status;
        }
        else{
            firstIndex++;
            lastIndex--;
            return status && checkPalindrome(string, firstIndex, lastIndex);
        }
    }
    public static void main(String[] args){
        String word="aa";
        System.out.println(IsPalindrome(word));
        System.out.println(checkPalindrome(word,0,word.length()-1));
    }
    
}
