package Batsmanscoremoreproblem;

public class BastsmanData {
	private int id=100;
	String name;
	private int runsscored;
	private int centuries;
	private int halfcenturies;
	private int ballsfaced;
	private int fours;
	private int sixes;
private static int idgenerator=100;


protected BastsmanData() {
	
}

 protected BastsmanData(String name,int runsscored,int centuries,int halfcenturies
		,int ballsfaced,int fours,int sixes) {
	 id=idgenerator++;
	 this.name=name;
	 this.runsscored=runsscored;
	 this.centuries=centuries;
	 this.halfcenturies=halfcenturies;
	 this.ballsfaced=ballsfaced;
	 this.fours=fours;
	 this.sixes=sixes;
	
	}
 public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

public void setName(String nam) {
	this.name = nam;
}
public String getName() {
	return name;
}



public void setRunsscored(int runsscored) {
	this.runsscored = runsscored;
}
public int getRunsscored() {
	return runsscored;
}



public void setCenturies(int centuries) {
	this.centuries = centuries;
}
public int getCenturies() {
	return centuries;
}



public void setHalfcenturies(int halfcenturies) {
	this.halfcenturies = halfcenturies;
}
public int getHalfcenturies() {
	return halfcenturies;
}



public void setBallsfaced(int ballsfaced) {
	this.ballsfaced = ballsfaced;
}
public int getBallsfaced() {
	return ballsfaced;
}



public void setFours(int fours) {
	this.fours = fours;
}
public int getFours() {
	return fours;
}

public int getSixes() {
	return sixes;
}

public void setSixes(int sixes) {
	this.sixes = sixes;
}

public int Strikerate() {
	return (runsscored/ballsfaced)*100;
	
	}
public int Runsscoreinboundaries() {
	return (fours*4)+(sixes*6);
}

public String toString() {
	return "id"+id+"name"+name+","+runsscored+","+centuries+","+halfcenturies+","
			+ballsfaced+","+fours+","+sixes+","+Strikerate()+","+Runsscoreinboundaries();
}
}