/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.truongcn.mathutil.core.test;

import com.truongcn.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Chau Nhat Truong
 */
@RunWith(value = Parameterized.class)
public class MathUtilityAdvancedTest {

    //Chaun bi data la mang 2 chieu kieu object
    //Junit tu loop duyet mang loi tach ra
    //Giup ta nhoi/fii/do vao ham assertEqual
    @Parameterized.Parameters
    public static Object[][] initData() {
        int a[] = {5, 10, 15, 20};
        return new Object[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 720}};
    }
    //map tung cot cua tung dong vao 2 bien tuong ung
    @Parameterized.Parameter(value = 1)//em thich cot 1
    public long expected;
    @Parameterized.Parameter(value = 0)//em thich cot 0
    public int n;

    //so sanh expected va actual hoy
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, MathUtility.getFactorial(n));
    }
}
