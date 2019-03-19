import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorUnitTestCase{
		public void testOperation() {
			Calculator c = new Calculator();
			assertEquals(5.0, c.calculation(3,2,"+"));
			assertEquals(6.0, c.calculation(3,2,"*"));
			assertEquals(1.5, c.calculation(3,2,"/"));
		}
}
