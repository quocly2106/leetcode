/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package remove.duplicates.from.sorted.array;

/**
 *
 * @author SC
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[left]){
                left ++;
                nums[left] = nums[i];
            }
        }
        return left+1;
    }
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray remove = new RemoveDuplicatesFromSortedArray();
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = remove.removeDuplicates(nums);
        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
