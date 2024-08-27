/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package climbing.stairs;

/**
 *
 * @author SC
 */
public class ClimbingStairs {

    public int climbStairs(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int[] f = new int [n+1];
            f[1] = 1 ;
            f[2] = 2 ;
        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];  
        }
        return f[n];
    }
    public static void main(String[] args) {
        ClimbingStairs solution = new ClimbingStairs();
        System.out.println(solution.climbStairs(2));
    }
    
}
