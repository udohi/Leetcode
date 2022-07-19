/** Problem: Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * 
 * */
import java.util.Arrays;
public class ContainDuplicate {
    public static void main(String[] args){
        int[] array1= {5,5,6};
        System.out.println(containsDuplicate(array1));
        }
    
    public  static boolean containsDuplicate(int[] nums) {
        // preprocessing -sort the array
        Arrays.sort(nums);
        // initialisation - initialize you counter variables
        int curr_index=0;
        int next_index=1;
        // structural construct- terminate the loop  when the current index is the last index
        while(curr_index < nums.length-1){
            if(nums[curr_index]!=nums[next_index]){  // increment the counter variables only if both the current  and last elements are not equal
                curr_index++;
                next_index++;
            }
            else{
                return true;   
            }
        }
        return false;     // return false if all the element are unique
        
    }
}