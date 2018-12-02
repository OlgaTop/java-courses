package com.shpp.demo;

public class Calculate {
    public static void main(String[] arg) {
        System.out.println("Calculate...");
        int[] array = {1, 2};
        int first = array[0];
        int second = array[1];
        int summ = first + second;
        System.out.println("Sum: " + summ);

        short[] array1 = {3, 4};
        short first1 = array1[0];
        short second1 = array1[1];
        short residual = (short) (second1 - first1);
        System.out.println("Residual: " + residual);

        long[] array2 = {4, 2};
        long base = array2[0];
        long power = array2[1];
        System.out.println("Exponentiation: " + (long) Math.pow(base, power));

        float[] array3 = {2.0f, 6.0f};
        float first3 = array3[0];
        float second3 = array3[1];
        float fraction = second3 / first3;
        System.out.println("Fraction: " + fraction);

        double[] array4 = {3.0, 2.0};
        double first4 = Integer.valueOf((int) array4[0]);
        double second4 = Integer.valueOf((int) array4[1]);
        double product = first4 * second4;
        System.out.println("Product: " + product);

    }
}
