package com.github.archongum.utils;

/**
 * @author Archon  2019/9/23
 * @since
 */
public class Tests {

    public static int add(int a, int... other) {
        int sum = a;
        if (other != null) {
            for (int i : other) {
                sum += i;
            }
        }
        return sum;
    }
}
