package week3;
import org.junit.Test;
import static org.junit.Assert.*;
public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void TestMax(){
        assertEquals(6,Week3.max(6,4));
        assertEquals(10, Week3.max(4,10));
        assertEquals(100,Week3.max(5,100));
        assertEquals(-20,Week3.max(-20,-21));
        assertEquals(3,Week3.max(-9,3));
    }
    @Test
    // TODO: Viết 5 testcase cho phương thức minOfArray()
    public void TestminOfArray(){
        int[] a={1, 2, 4, -1, 10};
        assertEquals(-1,Week3.minOfArray(a));
        int[] b={2,4,5,6,78,-12,-9,0};
        assertEquals(-12,Week3.minOfArray(b));
        int[] c={100, 200, 3, 400, 50};
        assertEquals(3,Week3.minOfArray(c));
        int[] d={10, 20, 30, 6, 40, 50};
        assertEquals(6,Week3.minOfArray(d));
        int[] e={-9,-10,30,555,9};
        assertEquals(-10,Week3.minOfArray(e));
    }
    @Test
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    public void TestcalculateBMI(){
        assertEquals("Thiếu cân",Week3.calculateBMI(35, 1.50));
        assertEquals("Bình thường",Week3.calculateBMI(51, 1.60));
        assertEquals("Bình thường",Week3.calculateBMI(47, 1.58));
        assertEquals("Thừa cân",Week3.calculateBMI(76.14, 1.80));
        assertEquals("Béo phì",Week3.calculateBMI(66.56, 1.60));

    }
}
