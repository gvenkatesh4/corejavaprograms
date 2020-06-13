package inheritance.batsman;

import java.text.DecimalFormat;

public class Batsmann extends Playaer {
	private int runsScored;
	private int centuries;
	private int halfCenturies;
	private int ballsFaced;
	private int sixes;
	private int fours;
	
	
		
		
		

	protected Batsmann() {
		
	}
	protected Batsmann(String name,int runsScored,int centuries,int halfCenturies,
			int ballsFaced,int sixes,int fours){
		super(name);
	    this.runsScored=runsScored;
	    this.centuries=centuries;
	    this.halfCenturies=halfCenturies;
	    this.ballsFaced=ballsFaced;
	    this.fours=fours;
	    this.sixes=sixes;
		
	}
	protected int getRunsScored() {
		return runsScored;
	}
	protected void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}
	protected int getCenturies() {
		return centuries;
	}
	protected void setCenturies(int centuries) {
		this.centuries = centuries;
	}
	protected int getHalfCenturies() {
		return halfCenturies;
	}
	protected void setHalfCenturies(int halfCenturies) {
		this.halfCenturies = halfCenturies;
	}
	protected int getBallsFaced() {
		return ballsFaced;
	}
	protected void setBallsFaced(int ballsFaced) {
		this.ballsFaced = ballsFaced;
	}
	protected int getSixes() {
		return sixes;
	}
	protected void setSixes(int sixes) {
		this.sixes = sixes;
	}
	protected int getFours() {
		return fours;
	}
	protected void setFours(int fours) {
		this.fours = fours;
		
}
	public String getStrikerate() {
		float rate = ((float)runsScored*100)/ballsFaced;
		DecimalFormat d = new DecimalFormat("#.##");
		
		return d.format(rate);
		
	}
	
	public int getRunsScoredInBoundaries() {
		return (4*fours+6*sixes);
	}
	@Override
	public String toString() {
		return "Batsmann [runsScored=" + runsScored + ", centuries=" + centuries + ", halfCenturies=" + halfCenturies
				+ ", ballsFaced=" + ballsFaced + ", sixes=" + sixes + ", fours=" + fours + ", getStrikerate()="
				+ getStrikerate() + ", getRunsScoredInBoundaries()=" + getRunsScoredInBoundaries() ;
	}
	
	
}