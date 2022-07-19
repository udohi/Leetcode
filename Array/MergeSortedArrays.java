// Problem: Given two sorted arrays A[] and B[] of size N and M. The task is to merge both the arrays into a single array in non-decreasing order.
// Solution : DataStructure-Using ArrayList.
import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args){
        int[] array1= {1,0,0};
        int[] array2= {1};
        System.out.println(Arrays.toString(mergeArray(array1, array1.length, array2, array2.length)));
    }
    public static int[] mergeArray(int[] nums1, int m, int[] nums2, int n){
            // pointers
            int one = m - 1, two = n - 1, ind = nums1.length - 1;
            
            while(ind >= 0) {
                
                if(one < 0) 
                    nums1[ind] = nums2[two--];
                
                else if(two < 0)
                    nums1[ind] = nums1[one--];
                
                else {
                    if(nums1[one] > nums2[two]) {
                        nums1[ind] = nums1[one--];
                    } else {
                        nums1[ind] = nums2[two--];
                    }   
                }
                
                ind--;
            }
        return nums1;
    }
}

