package bankingProblem;

public class Sbi implements Bank {
	Customer customer;
	
	public Sbi(){
		
	}
	public Sbi(Customer customer){
		this.customer=customer;
	}
	
@Override
	public double calcROI() {
		// TODO Auto-generated method stub
	double Roi = customer.getTenure()/customer.getInvestment();
	return Roi;
	}
@Override
public String toString() {
	return "Investment="+customer.getInvestment()+"tenure="+customer.getTenure()+
			"roi="+calcROI();
}

}
