/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package remove.element;

/**
 *
 * @author SC
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            } 
        }
        
        return k;
    }
    
    public static void main(String[] args) {
        RemoveElement remove = new RemoveElement();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int k = remove.removeElement(nums, val);
        System.out.println("Số phần tử không bằng " + val + " là: " + k);
        System.out.print("Mảng sau khi xóa: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    
}
