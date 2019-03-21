package unitTestCase;


public class MathOperations {
	
	/*A class doing mathematical Operations-Addition,multiplication and division with CalcTest.java as
	 *  it's JUnit class*/
	public static int add(int first, int second) {
        return first + second;
    }

    public static int multiply(int multiplicand, int multiplier) {
        return multiplicand * multiplier;
    }

    public static double divide(int dividend, int divisor) {
        if (divisor == 0)
            throw new IllegalArgumentException("Cannot divide by zero (0).");

        return dividend / divisor;
    }
}
