package Bankusinginterface;

public class Icci implements Bank {
   double netincome;
   double costinvestment;

   
   public Icci() {
	   
   }
   public Icci(double netincome,double costinvestment) {
	   this.netincome=netincome;
	   this.costinvestment=costinvestment;
   }
protected double getNetincome() {
	return netincome;
}
protected void setNetincome(double netincome) {
	this.netincome = netincome;
}
protected double getCostinvestment() {
	return costinvestment;
}
protected void setCostinvestment(double costinvestment) {
	this.costinvestment = costinvestment;
}

public double Roi() {
	// TODO Auto-generated method stub
	return netincome/costinvestment;
}
@Override
public String toString() {
	return "Icci [netincome=" + netincome +"Rom="+ Roi()+", costinvestment=" + costinvestment + "]";
}
	
}
