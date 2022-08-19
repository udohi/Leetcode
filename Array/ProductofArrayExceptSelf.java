/*Problem: Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
            The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.You must write an algorithm that runs in O(n) time and without using the division operation. 
Solution:   Define a prefix product and suffix product. The prefix product is the product of all the elements before the current element. 
            The suffix product is the product of all the elements after the current element. 
            The answer is the prefix product of the current element multiplied by the suffix product of the current element.      
            */
import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args){
        int[] array= {5,2,3,1,4};
        System.out.println(Arrays.toString(arrayExceptSelf(array)));
    }
    public  static int[] arrayExceptSelf(int[] nums) {
        int[] preProduct = new  int[nums.length];
        int[] postProduct = new  int[nums.length];
        int result[] = new int[nums.length];
        
        // Populate the prefix product array
        preProduct[0]=1; // the prefix product of the first element is 1.
        for (int i=1; i<=nums.length-1;i++){
            preProduct[i]= preProduct[i-1] *nums[i-1];
        }  
        // Populate the suffix product array
        postProduct[nums.length-1]=1; // the last element of the postProduct array is 1.
        for (int i=nums.length-2; i>=0;i--){
            postProduct[i]= postProduct[i+1] *nums[i+1];
        }
         
        // The answer is the prefix product of the current element multiplied by the suffix product of the current element.
        for (int i=0; i<=nums.length-1;i++){
            result[i]=preProduct[i]*postProduct[i];
        }
        return result;  
    }
}
