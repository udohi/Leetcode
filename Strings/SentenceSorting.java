
public class SentenceSorting{

    public static String decodeString(String sentence){
        // split the string into tokens and stored in array
        String[] tokens= sentence.split(" ");
        // define a string array that arrange each token in increasing order of its associated integer
        String[] sortedTokens= new String[tokens.length];
        // define a string to store the result;
        String result="";
         for (int i=0; i<tokens.length; i++){
            // get the integer from the current string token and stored it in var, used as he index to the sorted string array
            int var=Integer.parseInt(tokens[i].substring(tokens[i].length() - 1));
            // this is necessary since the retrieved integer begins with 1
            var= var-1;
            // stored the current string token in the correct order 
            sortedTokens[var]=tokens[i];
            // remove the last element(i.e the integer) in current string token
            sortedTokens[var]= sortedTokens[var].replace(sortedTokens[var].substring(sortedTokens[var].length() - 1),"");
        }
        // combine all the element in the sorted string array 
        for (int i=0; i<sortedTokens.length;i++){
            result=result+sortedTokens[i]+ " ";
        }
        return result;
    }
    public static void  main(String [] args){
        System.out.println(decodeString("naughty4 a3 is2 Chineye1 girl5"));
        

    }
}