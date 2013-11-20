import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {
	
	@Test
	public  void test() {
		Dollar five = new Dollar(5);
		five.times(2);
		assertEquals(10, five.amount);
	}
	
	

}
