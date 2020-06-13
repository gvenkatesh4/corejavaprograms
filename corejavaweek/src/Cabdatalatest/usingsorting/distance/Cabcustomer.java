package Cabdatalatest.usingsorting.distance;

public class Cabcustomer implements Comparable<Cabcustomer> {
	private int id = 100;
	private String customername;
	private String pickuplocation;
	private String droplocation;
	private int distance;
	private long phno;
	private static int idgenerator = 100;

	public Cabcustomer() {

	}

	public Cabcustomer(String customername, String pickuplocation, String droplocation, int distance, long l) {
		id = idgenerator++;
		this.customername = customername;
		this.pickuplocation = pickuplocation;
		this.droplocation = droplocation;
		this.distance = distance;
		this.phno = l;
	}

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getCustomername() {
		return customername;
	}

	protected void setCustomername(String customername) {
		this.customername = customername;
	}

	protected String getPickuplocation() {
		return pickuplocation;
	}

	protected void setPickuplocation(String pickuplocation) {
		this.pickuplocation = pickuplocation;
	}

	protected String getDroplocation() {
		return droplocation;
	}

	protected void setDroplocation(String droplocation) {
		this.droplocation = droplocation;
	}

	protected int getDistance() {
		return distance;
	}

	protected void setDistance(int distance) {
		this.distance = distance;
	}

	protected long getPhno() {
		return phno;
	}

	protected void setPhno(long phno) {
		this.phno = phno;
	}

	protected static int getIdgenerator() {
		return idgenerator;
	}

	protected static void setIdgenerator(int idgenerator) {
		Cabcustomer.idgenerator = idgenerator;
	}

	@Override
	public String toString() {
		return "Cabcustomer [id=" + id + ", customername=" + customername + ", pickuplocation=" + pickuplocation
				+ ", droplocation=" + droplocation + ", distance=" + distance + ", phno=" + phno + "]";
	}
	public int compareTo(Cabcustomer o) {
		if (o.getDistance() < distance) {
			return -1;
		} else if (o.getDistance() > distance) {
			return 1;
		}
		return 0;
	}

}
