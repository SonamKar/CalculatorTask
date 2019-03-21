package unitTestCase;

public class HouseConstructionCost {

	/*Class to estimate cost of house construction*/
	
	public double ConstructionCost(String materialStandard,double area,String automatedOrNot) {
		if(materialStandard=="standard materials") {
			return 1200*area;
		}
		else if(materialStandard=="above standard materails") {
			return 1500*area;
		}
		else if(materialStandard=="high standard materials" && automatedOrNot=="No") {
			return 1800*area;
		}
		else if(materialStandard=="high standard materials" && automatedOrNot=="Yes") {
			return 2500*area;
		}
		else {
			return 0.0;
			}
	}
}
