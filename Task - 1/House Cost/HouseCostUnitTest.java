import static org.junit.Assert.*;
import org.junit.Test;

public class HouseCostUnitTest 
{
	public void testOperation() {
		HouseCost hc = new HouseCost();
		assertEquals(360000.0, c.estimate('A', 300, false));
		assertEquals(540184.5, c.estimate('B', 360.123, false));
		assertEquals(720000.0, c.estimate('C', 400, false));
	}
}