/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package merge.sorted.array;

/**
 *
 * @author SC
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m-1;
        int index2 = n-1;
        int index = m+n-1;
        
        while (index1 >= 0 && index2 >= 0) {            
            if (nums1[index1]> nums2[index2]) {
                nums1[index] = nums1[index1];
                index1--;
            }else {
                nums1[index] = nums2[index2];
                index2--;
            }
            index--;
        }
        while (index2 >= 0) {
            nums1[index] = nums2[index2];
            index--;
            index2--;
        }
    }
    public static void main(String[] args) {
        MergeSortedArray solution = new MergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 1, n = 3;
        solution.merge(nums1, m, nums2, n);
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
    
}
