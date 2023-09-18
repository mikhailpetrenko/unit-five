import static org.junit.Assert.*;
import org.junit.Test;

public class BalancedParsTest {
    @Test
    public void GoodTest1() {
        String str = "()()";
        assertTrue(BalancedPars.allCheck(str));
    }

    @Test
    public void GoodTest2() {
        String str = "(())()";
        assertTrue(BalancedPars.allCheck(str));
    }

    @Test
    public void BadTest1() {
        String str = ")()((";
        assertFalse(BalancedPars.allCheck(str));
    }

    @Test
    public void emptyTest() {
        String str = "";
        assertTrue(BalancedPars.allCheck(str));
    }

    @Test
    public void nestedTest() {
        String str = "((()))";
        assertTrue(BalancedPars.allCheck(str));
    }

    @Test
    public void testUnmatchedClosingParentheses() {
        String str = "(()))(";
        assertFalse(BalancedPars.allCheck(str));
    }
}