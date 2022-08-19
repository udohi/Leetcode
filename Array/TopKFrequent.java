/* Problem: Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 * Solution: Use a HashMap to store the array elements as keys and its frequency as values.
 *           Use a PriorityQueue with a comparator
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequent {

    public static void main(String[] args){
        int[] array= {3,2,4,1,1,1,2,2,2};
        int target=2;
        System.out.println(Arrays.toString(topKFrequent(array, target)));
    }
    public  static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashmap= new HashMap<>();
        for (int i=0;i<nums.length; i++){
            // if the key is not in the hashmap, then add it to the hashmap with value 1. if the key is in the hashmap, then add 1 to the value.
            hashmap.put(nums[i], hashmap.getOrDefault(nums[i], 0)+1);
        }
    
        // PQ at any given point holds the top k frequent elements. elements are added to the PQ based on their frequency.
        // Since the items of argument for the comparator is the same order as the return statement, the key with the lowest value(frequency) has the highest priority..
        // See the QueueConcept.java  file to see how a PriorityQueue Comparator works.
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)-> hashmap.get(a)-hashmap.get(b));
        // Using Foreach loop  associated with collection to loop through the hashmap via For and add the keys to the PQ.
        for (int key: hashmap.keySet()){
            pq.add(key);
            if (pq.size()>k){
                pq.poll();
            }
        }
        // create an array to hold the top k frequent elements.
        int [] result= new int[k];
        for(int i=0; i<k; i++){
            result[i]=pq.poll();
        }
       return result;
    }
    
}
