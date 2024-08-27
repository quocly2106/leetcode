/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package find.the.index.of.the.first.occurrence.in.a.string;

/**
 *
 * @author SC
 */
public class FindTheIndexOfTheFirstOccurrenceInAString {

    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if(haystack.substring(i,i+needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        FindTheIndexOfTheFirstOccurrenceInAString solution = new FindTheIndexOfTheFirstOccurrenceInAString();
        String haystack = "leetcode";
        String needle = "leetco";
        System.out.println(solution.strStr(haystack, needle));
    }
    
}
