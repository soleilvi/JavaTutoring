package Session3;
// Session3.MathOperator.java
/*
Experimenting with the Math module (random, sqrt, pow).
By Soleil Vivero
*/

import java.lang.Math;
public class MathOperator {
    public static void main (String[] args){
        double random = Math.random(), sqrt = Math.sqrt(9), pow = Math.pow(2, 2),
                randomTwo = Math.random() * 1000, sqrtTwo = Math.sqrt(16), powTwo = Math.pow(2, 4);
        System.out.println(String.format("""
                Random:
                %.3f
                %.3f
                """, random, randomTwo));
        System.out.println(String.format("""
                Square root:
                %.3f
                %.3f
                """, sqrt, sqrtTwo));
        System.out.println(String.format("""
                Exponents:
                %.3f
                %.3f
                """, pow, powTwo));
    }
}
