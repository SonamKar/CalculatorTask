package unitTestCase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class CalcTest {

	/*
	 * Write Calculator program using unit test cases for addition,multiplication and division of numbers.
	 * MathOperations.java class objects are created and used here.
	 * */
	
	private MathOperations math;

    @Before
    public void setUp() {
        math = new MathOperations();
    }

    @Test
    public void addNum() {
        final int expected = 4;

        final int actual = math.add(2, 2);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void divideNum() {
        final double expected = 2.0;

        final double actual = math.divide(10, 5);

        Assert.assertEquals(actual, expected);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void divideByZero() {
        MathOperations.divide(10, 0);
    }

    @After
    public void tearDown() {
        math = null;
    }
}

