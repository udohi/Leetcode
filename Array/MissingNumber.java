/* Problem: Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 *          For example, Input: nums = [3,0,1] Output: 2. All the numbers of nums are unique.
 * Solution:
 */
import java.util.Arrays;
public class MissingNumber {
    public static void main(String[] args){
        int[] array1= {0,1,3};
        System.out.println(missingNumber(array1));
       
    }
    public static int missingNumber(int[] nums) {
        // preprocessing -sort the array
        Arrays.sort(nums);
        
        // initialisation - initialize you counter variables
        int miss=nums[0];
        int i=0;
        
        // structural construct- terminate the loop  when the value in miss varibale cannot be found in the array
        while(i<nums.length && miss==nums[i]){ // the first operand is to ensure there isnt an ArrayOutofBound error when the missing number is the last or only element.
            i++;
            miss++;    
        }

        // return result
        return miss;
    }
}
