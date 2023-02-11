package com.senbiifx.javaeuler.problem;

import java.util.stream.IntStream;

/**
 *  Multiples of 3 or 5
 *
 */
public class Problem0001 {


    public static void main(String[] args) {
        var upperBound = 999;

        var sumOfMultiples3 = sumOfMultiples(upperBound, 3);
        var sumOfMultiples5 = sumOfMultiples(upperBound, 5);
        var sumOfMultiples15 = sumOfMultiples(upperBound, 15);

        var result = sumOfMultiples3 + sumOfMultiples5 - sumOfMultiples15;
        System.out.println(result);
    }

    /**
     *  Returns the sum of all multiples below upperBound.
     */
    private static int sumOfMultiples(int upperBound, int multiples){
        var n = upperBound / multiples;
        return  multiples * ( (n * (n + 1) / 2 ) );
    }
}
