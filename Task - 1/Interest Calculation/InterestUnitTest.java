import static org.junit.Assert.*;
import org.junit.Test;

public class InterestUnitTestCase
{
		public void testOperation()
		{
			Interest i = new Interest();
			assertEquals(1515.1500244140625, i.SimpleInterest(20202, 2.5f, 3));
			assertEquals(21755.342888139312, i.CompoundInterest(20202, 2.5f, 3));
		}
}