/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package number.of.pkg1.bits;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SC
 */
public class NumberOf1Bits {

    public int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            count += n & 1;
            n >>>=1;
        }
        return count;
    }
    public static void main(String[] args) {
        NumberOf1Bits solution = new NumberOf1Bits();
        int n = 128;
        System.out.println(solution.hammingWeight(n));
    }
    
}
