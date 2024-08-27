/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package happy.number;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author SC
 */
public class HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> seenNumbers = new HashSet<>();
        while(n != 1 && !seenNumbers.contains(n)){
            seenNumbers.add(n);
            n = getSumOfSquares(n);
        }
        return n == 1;
    }
    private int getSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        HappyNumber solution = new HappyNumber();
        int n = 19;
        System.out.println(solution.isHappy(n));
    }
    
}
