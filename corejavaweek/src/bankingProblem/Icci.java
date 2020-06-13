package bankingProblem;

public class Icci implements Bank{
	Customer customer;
	public Icci(){
		
	}
	public Icci(Customer customer){
		this.customer=customer;
	}
	public double calcROI() {
		// TODO Auto-generated method stub
	double Roi = customer.getTenure()/customer.getInvestment();
	return Roi;
	}

	public String toString() {
		return "Investment="+customer.getInvestment()+"tenure="+customer.getTenure()+
				"roi"+calcROI();
	}
	
	}


