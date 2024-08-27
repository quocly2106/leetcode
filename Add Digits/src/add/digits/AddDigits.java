/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package add.digits;

/**
 *
 * @author SC
 */
public class AddDigits {

    public int addDigits(int num) {
        if (num < 10) {
            return num;  
        }
        while(num >= 10){
            int temp = 0;
            temp = (num % 10)+ (num / 10);
            num = temp;
        }
        return num;
    }
    public static void main(String[] args) {
       AddDigits solution = new AddDigits();
       int num = 38;
       System.out.println(solution.addDigits(num));
    }
    
}
