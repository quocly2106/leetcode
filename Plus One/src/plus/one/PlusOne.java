/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package plus.one;

/**
 *
 * @author SC
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n-1 ; i >=0 ; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }
        
    public static void main(String[] args) {
        PlusOne plusone = new PlusOne();

    int[] digits = {1, 2, 9};
    int[] result = plusone.plusOne(digits);
    System.out.print("Result : ");
    for (int digit : result) {
        System.out.print(digit + " ");
    }
    System.out.println();
    }
    
}
