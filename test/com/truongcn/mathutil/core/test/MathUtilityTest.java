package com.truongcn.mathutil.core.test;

import com.truongcn.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;

public class MathUtilityTest {

    //Ta se test tiep ham getF() voi n ca chon
    //n ca chon nghia la n < 0 || n > 20
    //Neu dua n ca chon < 0 | > 20, thi ham getF()
    //Hok them tinh, dua ra ngoai le: Illegal Arguement Exception
    //Junit 4 ko co assertEqual() -> dung chieu
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        MathUtility.getFactorial(-5);
    }
    
    
    
    

    //Ta sẽ viết các test case, các tình huống test
    //Kiểm tra hàm getF() chạy đúng hay ko để đưa đầu vào n từ tế
    @Test
    public void testFactorialGivenRightArguementReturnWell() {
        //Test case #1: test getF() with n = 0
        //Expected result: 1; kiểm tra 0! có đúng là 1 hem?
        //                    kiểm tra if 0! == 1 or not
        //
        int n = 0;
        long expected = 1; //hy vọng 0! = 1
        long actual = MathUtility.getFactorial(n); //gọi hàm và tính

        Assert.assertEquals(expected, actual);
        //XANH NẾU 2 THẰNG GIỐNG NHAU == NHAU
        //ĐỎ NẾU 2 THẰNG KHÁC NHAU!!!!

        //Test case #2: test getF() with n = 1
        //Expected: 1; check if 1! returns 1
        //             kiểm tra xe, có đúng 1! == 1 hem?
        //
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        Assert.assertEquals(expected, actual);

        //Test case #3: test getF() with n = 2;
        //Expected: 2; check if 2! returns 2
        Assert.assertEquals(2, MathUtility.getFactorial(2));

        //Test case #4: test getF() with n = 3;
        //Expected: 6; check if 3! returns 6
        Assert.assertEquals(6, MathUtility.getFactorial(3));

        //Test case #5: test getF() with n = 5;
        //Expected: 120; check if 5! returns 120
        Assert.assertEquals(120, MathUtility.getFactorial(5));
    }

    @Test
    public void testRedGreen() {
        Assert.assertEquals(6789, 6789);
    }
}
