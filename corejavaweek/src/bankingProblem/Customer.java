package bankingProblem;

public class Customer {
	private int investment;
	private int tenure;
	
	Customer()
	{
		
	}
	Customer(int investment,int tenure)
	{
		this.investment=investment;
		this.tenure=tenure;
	}
	protected int getInvestment() {
		return investment;
	}
	protected void setInvestment(int investment) {
		this.investment = investment;
	}
	protected int getTenure() {
		return tenure;
	}
	protected void setTenure(int tenure) {
		this.tenure = tenure;
	}
	@Override
	public String toString() {
		return "Customer [investment=" + investment + ", tenure=" + tenure + "]";
	}
	
	
	

}
