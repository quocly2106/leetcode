/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sqrt.x;

/**
 *
 * @author SC
 */
public class SqrtX {

    public int mySqrt(int x) {
        if (x == 0) return 0; // Trường hợp đặc biệt: căn bậc hai của 0 là 0.

        int left = 1, right = x;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) { // Để tránh tràn số, so sánh mid <= x / mid thay vì mid * mid <= x
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        SqrtX mysqrt = new SqrtX();
        System.out.println(mysqrt.mySqrt(4));  // Kết quả: 2
        System.out.println(mysqrt.mySqrt(8));  // Kết quả: 2
        System.out.println(mysqrt.mySqrt(16)); // Kết quả: 4
        System.out.println(mysqrt.mySqrt(36));  // Kết quả: 1
        System.out.println(mysqrt.mySqrt(0));  // Kết quả: 0
    }
    
}
