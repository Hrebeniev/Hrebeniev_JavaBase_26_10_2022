package com.hillel.hrebeniev.homeworks.homework_18;

import java.util.Arrays;

public class Matrix {
    //if square 1
    //if not square -1
    public static int getMatrix(int[][] arrayOne) {
        int[][] array2 = new int[][]{{1, 2}, {6, 7}};
        int row = 0;
        int count = 0;
        row = arrayOne.length;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {

            }
            if (array2.length == array2[i].length) {
                count += 1;
            }
        }
        if (count == row) {
            return 1;
        }
        return -1;
    }

    public static int array() {
        int[] array1 = new int[]{6, 8, 9, 8};
        System.out.println(Arrays.toString(array1));
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        return sum / array1.length;
    }
}
