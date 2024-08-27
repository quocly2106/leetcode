/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package search.insert.position;

/**
 *
 * @author SC
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        SearchInsertPosition insert = new SearchInsertPosition();
        int[] nums = {1,3,5,6};
        int target = 6;
        System.out.println(insert.searchInsert(nums, target));
    }
    
}
