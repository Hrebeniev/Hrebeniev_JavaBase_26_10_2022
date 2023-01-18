package com.hillel.hrebeniev.homework_18;

import com.hillel.hrebeniev.homeworks.homework_18.Matrix;
import org.junit.jupiter.api.*;

public class ArrayCompareTest {
    static int[][] array = null;

    @BeforeAll
    public static void beforeAll() {
        array = new int[][]{{1, 2}, {6, 7}};
    }

    @BeforeEach
    public void BeforeEach() {
        System.out.println("Начало");

    }

    //if square 1
    //if not square -1
    @Test
    public void test1() {
        Assertions.assertEquals(-1, Matrix.getMatrix(new int[3][2]));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(1, Matrix.getMatrix(array));
    }

    @AfterEach
    public void AfterEach() {
        System.out.println("Окончение");
    }


}
