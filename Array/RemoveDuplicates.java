/*Problem: Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
           The relative order of the elements should be kept the same.More formally, if there are k elements after removing the duplicates, 
           Then the first k elements of nums should be returned. It does not matter what you leave beyond the first k elements.
           Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
Solution1: Using Algorithm - Divide the array into two parts: The non-duplicate part(A) and part that will contain duplicates of only the last element(B).
*/                            
public class RemoveDuplicates {
    public static void main(String[] args){
        int[] array1= {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeSortedDuplicates(array1));
       
    }
    public  static int removeSortedDuplicates(int[] nums) {
        int i= 0; // index of the last element in the non-duplicates array.
        int j= 1;  // index of the element that needs to be compared to content of i
        int k= nums.length-1; // index of the last element in the original array
        while(nums[i]!= nums[k]){ // This loop terminates  when the last element of the non-duplicate array equals the last element of the original array.(Soultion found)
            
            /* This while loop  block of code is executed  when the content of i and j are the same*/ 
            while (nums[i]==nums[j]){ 
                    nums[j]=nums[k];  // replace the content of j with the last element
                    j=j+1;
            }
            
            /* This "if-else" block of code is executed when the content of i  and j are different */
            if (j==i+1){
                i=i+1;
                j=j+1;
            }
            else{
                nums[i+1]=nums[j];
                i=i+1;
                nums[j]=nums[k];
                j=j+1;
            }
        }
        
        System.out.println(i+1);
        return j;
    }
}

