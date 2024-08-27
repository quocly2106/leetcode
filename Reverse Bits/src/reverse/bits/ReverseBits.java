/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverse.bits;

/**
 *
 * @author SC
 */
public class ReverseBits {

    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int bit = n&1;
            result = result << 1 | bit;      
            n >>>= 1;
        }
        return result;
    }
    public static void main(String[] args) {
        ReverseBits solution = new ReverseBits();
        int n = 43261596 ;
        int reversed = solution.reverseBits(n);
        System.out.println(reversed);
    }
    
}
