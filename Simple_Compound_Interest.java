package unitTestCase;



public class Simple_Compound_Interest {
	
/*Class to compute simple interest and compound interest*/
	
	public static class CompoundType{
		static int annually=1;
		static int semiannually=2;
		static int quaterly=4;
		static int monthly=12;
	}
	double CompoundInterestCalculation(double principal,double annualRate,int compoundType,int periods) {
		
		double annualRateDecimal=annualRate/100.0;
		double i=annualRateDecimal/compoundType;
		int n=compoundType*periods;
		double futureValue=principal* Math.pow (1+i,n);
		double interestEarned= futureValue-principal;
		return interestEarned;
	}
	double SimpleIntersetCalculation(double principal,double annualRate,int periods) {
		double annualRateDecimal=annualRate/100.0;
		double interestEarned=principal*(1+annualRateDecimal*periods);
		return interestEarned;
	}
}
