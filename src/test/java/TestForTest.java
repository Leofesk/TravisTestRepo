import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestForTest {
    @Test
    public void Test1() {
        assertEquals(4, (2+2));
    }
    @Test
    public void Test2() {
        assertEquals(8, (4+4));
    }
    @Test
    public void Test3() {
        assertEquals(16, (8+8));
    }
    @Test
    public void Test4() {
        assertEquals(32, (16+16));
    }
    @Test
    public void Test5() {
        assertEquals(64, (32+32));
    }
    @Test
    public void Test6() {
        assertEquals(128, (64+64));
    }
}
