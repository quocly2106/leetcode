/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package single.number;

/**
 *
 * @author SC
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result; 
    }
    public static void main(String[] args) {
        SingleNumber solution = new SingleNumber();
        int [] nums = {4,1,2,1,2};
        int k = solution.singleNumber(nums);
        System.out.println(k);
    }
    
}
