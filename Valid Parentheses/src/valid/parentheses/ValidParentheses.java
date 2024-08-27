/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package valid.parentheses;

import java.util.Stack;

/**
 *
 * @author SC
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack  = new Stack<>();
        for (char i : s.toCharArray()) {
            if (i =='(' || i == '[' || i == '{'){
                stack.push(i);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if ((i == ')' && top != '(') || 
                    (i == ']' && top != '[') || 
                    (i == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();
        
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";
        String test4 = "([)]";
        String test5 = "{[]}";

        System.out.println(solution.isValid(test1)); // true
        System.out.println(solution.isValid(test2)); // true
        System.out.println(solution.isValid(test3)); // false
        System.out.println(solution.isValid(test4)); // false
        System.out.println(solution.isValid(test5)); // true
    }
    
}
