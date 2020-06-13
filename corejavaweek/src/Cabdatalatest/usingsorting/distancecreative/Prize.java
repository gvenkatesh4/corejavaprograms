package Cabdatalatest.usingsorting.distancecreative;

import Cabdatalatest.usingsorting.distance.Cabcustomer;

public class Prize implements Comparable<Prize>{
	private int id;
    private String product;
    private int cost;
    private static int idgenerator=100;
    
    public Prize() {
    	
    }
	public Prize(String product,int cost) {
		id=idgenerator++;
		this.product=product;
		this.cost=cost;
	}
	
	protected void setid(int id) {
		this.id=id;
	}
	protected int getid() {
		return id;
	}
		protected void setproduct(String product) {
			this.product=product;
		}
		protected String getproduct() {
			return product;
		}
		protected void setcost(int cost) {
			this.cost=cost;
		}
		protected int getcost() {
			return cost;
		}
		
		public int compareTo(Prize o) {
			if (o.getcost() < cost) {
				return -1;
			} else if (o.getcost() > cost) {
				return 1;
			}
			return 0;
		}
		@Override
		public String toString() {
			return "Prize [id=" + id + ", product=" + product + ", cost=" + cost + "]";
		}
		
		
		
		
		

		
}
