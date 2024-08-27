/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package roman.to.integer;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author SC
 */
public class RomanToInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RomanToInteger solution = new RomanToInteger();
        System.out.println(solution.romantointeger("III"));    // Output: 3
        System.out.println(solution.romantointeger("IV"));     // Output: 4
        System.out.println(solution.romantointeger("IX"));     // Output: 9
        System.out.println(solution.romantointeger("LVIII"));  // Output: 58
        System.out.println(solution.romantointeger("MCMXCIV"));// Output: 1994
        System.out.println(solution.romantointeger("MMMM"));
    }
    public int romantointeger(String s){
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            int currentVal = romanMap.get(s.charAt(i));

            if (i < length - 1 && currentVal < romanMap.get(s.charAt(i + 1))) {
                total -= currentVal;
            } else {
                total += currentVal;
            }
        }
        return total;
    }
   
}
