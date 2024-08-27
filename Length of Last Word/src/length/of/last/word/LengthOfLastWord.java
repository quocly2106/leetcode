/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package length.of.last.word;

/**
 *
 * @author SC
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        s = s.trim(); 
        int n = 0;
        for (int i = s.length() -1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            n++;
        }
        return n;
    }
    public static void main(String[] args) {
        LengthOfLastWord solution = new LengthOfLastWord();

        String input1 = "Hello World";
        System.out.println(solution.lengthOfLastWord(input1)); // Kết quả: 5

        String input2 = "   fly me   to   the moon  ";
        System.out.println(solution.lengthOfLastWord(input2)); // Kết quả: 4
        
        String input3 = "luffy is still joyboy";
        System.out.println(solution.lengthOfLastWord(input3)); // Kết quả: 6
    }
}
