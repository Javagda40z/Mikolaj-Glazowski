package ZadaniaNaEnumach.Kalkulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    @Test
    public void testMinusOperation() {
        assertEquals(6 - 9, Operation.MINUS.calculate(6, 9));
        assertEquals(0, Operation.MINUS.calculate(0, 0));
        assertEquals(816654519 - 494175.8648, Operation.MINUS.calculate(816654519, 494175.8648));

    }

    @Test
    public void testPlusOperation() {
        assertEquals(0, Operation.PLUS.calculate(0, 0));
        assertEquals(816654519 + 494175.8648, Operation.PLUS.calculate(816654519, 494175.8648));

        assertEquals(6 + 9, Operation.PLUS.calculate(6, 9));
    }

    @Test
    public void testWhenDefaultOperationThrowException() {

        assertThrows(AssertionError.class, () -> Operation.DODATKOWA_OPERACJA.calculate(5, 6));

    }

}