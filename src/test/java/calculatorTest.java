import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class calculatorTest {
	 calculator calculator = new calculator();

	    @Test
	    public void testAdd() {
	        assertEquals(5, calculator.add(2, 3));
	    }

	    @Test
	    public void testSubtract() {
	        assertEquals(1, calculator.subtract(3, 2));
	    }

	    @Test
	    public void testMultiply() {
	        assertEquals(6, calculator.multiply(2, 3));
	    }

	    @Test
	    public void testDivide() {
	        assertEquals(2, calculator.divide(6, 3));
	    }

	    @Test
	    public void testDivideByZero() {
	        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
	        assertEquals("Division by zero", exception.getMessage());
	    }
}
