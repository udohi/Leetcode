/** Problem: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.You may assume that each input would have 
 *           exactly one solution, and you may not use the same element twice.
 *  Solution: We can use the bruteforce appraoch(Two nested loops) or a HashMap.
 * **/
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumbers {
    public static void main(String[] args){
        int[] array1= {3,2,4};
        int target=6;
        System.out.println(Arrays.toString(twoSum(array1, target)));
    }
    
    public  static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap= new HashMap<Integer, Integer>();
        int currentIndex=0;
        while(!hashMap.containsKey(target-nums[currentIndex])){ // insert an entry into map only if the difference between the target and current element cannot be found as a key in the map
            hashMap.put(nums[currentIndex], currentIndex);
            currentIndex++;
        }
        return new int[] {hashMap.get(target-nums[currentIndex]), currentIndex};
        
    }
    
}
