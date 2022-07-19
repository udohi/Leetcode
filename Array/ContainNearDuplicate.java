/** Problem: Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] 
 *            and abs(i - j) <= k
 *  Solution1: Using Loops and Ifs statements, get to the statement when "true" and can be returned.(Using Brute-force) 
 *  SOlution2: Using HashMap        
 * 
 **/
import java.util.*;
public class ContainNearDuplicate {
    public static void main(String[] args){
        int[] array1= {1,2,3,1,2,3};
        System.out.println(bruteforce(array1,2));
        System.out.println(hashmap(array1,2));
    }
        
    public  static boolean bruteforce(int[] nums, int k) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if (nums[i]==nums[j]){
                    if ((j-i)<=k){
                        return true;
                    }
                }
            }
        }
        return false;   
    }
        
    public static boolean hashmap(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
            
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - i) <= k)
                return true;
            // Insert an entry if the current element is an existing key and its index in the map, when subtracted from the current index of the array is <=k
            // The elements are key and  the indices are the value in the Map
            //  If the map formerly contained an entry for the specified key, the old value is replaced by the new value and the old value associated with the key is returned.
            map.put(nums[i], i); // 
        }
                    
        return false;
    }
}