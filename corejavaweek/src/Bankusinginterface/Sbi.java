package Bankusinginterface;

public class Sbi implements Bank {
	double netincome;
	double costofinvestment;
	
	Sbi() {
		
	}
	public Sbi(double netincome,double costofinvestment) {
		this.netincome=netincome;
		this.costofinvestment=costofinvestment;
	}
	protected double getNetincome() {
		return netincome;
	}
	protected void setNetincome(double netincome) {
		this.netincome = netincome;
	}
	protected double getCostofinvestment() {
		return costofinvestment;
	}
	protected void setCostofinvestment(double costofinvestment) {
		this.costofinvestment = costofinvestment;
	}
	@Override
	public double Roi() {
		// TODO Auto-generated method stub
		return netincome/costofinvestment;
	}
	@Override
	public String toString() {
		return "Sbi [netincome=" + netincome +"roi="+Roi()+", costofinvestment=" + costofinvestment + "]";
	}
	

	
	
}
