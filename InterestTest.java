 package unitTestCase;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import unitTestCase.Simple_Compound_Interest.CompoundType;

public class InterestTest {
	
	/* JUnit class to test simple and compound interest*/
	
Simple_Compound_Interest sci=new Simple_Compound_Interest();
	@Test
	public void CompoundInterestTest() {

		double interest=sci.CompoundInterestCalculation(2500.00,7.55,CompoundType.monthly,4);
		Assert.assertEquals(878.21,interest,0.01);
	}
   @Test
   public void SimpleInterestTest() {
	   double interest=sci.SimpleIntersetCalculation(2500.00, 7.55, 4);
	   Assert.assertEquals(3255.0, interest,0.01);
   }
}
