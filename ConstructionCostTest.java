package unitTestCase;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ConstructionCostTest {
HouseConstructionCost hcc=new HouseConstructionCost();
	@Test
	public void test() {
		double price=hcc.ConstructionCost("high standard materials", 300, "Yes");
		Assert.assertEquals(750000.0, price);
	}

}
