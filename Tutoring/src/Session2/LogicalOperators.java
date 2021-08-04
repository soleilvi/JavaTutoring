package Session2;
// Session2.LogicalOperators.java
/*
This program outputs the sum of several different arithmetic operations with the given value of variables.
By Soleil Vivero
*/

public class LogicalOperators {
    public static void main(String[] args) {
        int a = 3, b = 2, c = 6, d = 9, e = 5, sum1, sum2, sum3, sum4, sum5, sumTotal;
        sum1 = a + b;  // 3 + 2 = 5 (addition)
        sum2 = d - c;  // 9 - 6 = 3 (subtraction)
        sum3 = c / b;  // 6 / 2 = 3 (division)
        sum4 = d * e;  // 9 * 5 = 45 (multiplication)
        sum5 = e % a;  // 5 % 3 = 2 (modulo gives the remainder of a division)
        sumTotal = sum1 + sum2 + sum3 + sum4 + sum5;  // 5 + 3 + 3 + 45 + 2 = 58

        System.out.println("Sum1: " + sum1 + "\nSum2: " + sum2 + "\nSum3: " + sum3 + "\nSum4: " + sum4 +
                           "\nSum5: " + sum5 + "\nSum total: " + sumTotal);
    }
}
