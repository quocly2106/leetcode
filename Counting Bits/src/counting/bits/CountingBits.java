/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package counting.bits;

/**
 *
 * @author SC
 */
public class CountingBits {

    public int[] countBits(int n) {
        int [] arr = new int[n+1];
        for (int i = 0; i <= n; i++) {
            arr[i] = Integer.bitCount(i);
        }
        return  arr;
    }
    public static void main(String[] args) {
        CountingBits solution = new CountingBits();
        int n = 5;
        int[] result = solution.countBits(n);
        for (int count : result) {
            System.out.print(count + " ");
        }
    }
    
}
