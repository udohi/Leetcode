/* Problem: Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
*           You must implement a solution with a linear runtime complexity and use only constant extra space.
   Assumption: (i) We have only 1 elements that appears once and the rest rest appears twice.

Solution: 

*/
import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args){
        int[] array1= {5};
        System.out.println(singleNumber(array1));
        }
    public  static int singleNumber(int[] nums) {
     
    // initialisation - initialize you counter variables
    int firstPointer=0;
    int secondPointer=1;
    
    // preprocessing -sort the array
    Arrays.sort(nums);
        
    // structural construct- terminate the loop  when two adjacent elements are not equal
    while(firstPointer < nums.length-1 && nums[firstPointer]==nums[secondPointer]){ // the first operand is to ensure there isnt an ArrayOutofBound error when the last element is number we are looking for.
        firstPointer=firstPointer+2;
        secondPointer=secondPointer+1;
    }
    
    // return result
    return nums[firstPointer];
    }
    
}
