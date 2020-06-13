package inheritance.batsman;

import java.text.DecimalFormat;

public class Bowler extends Playaer {
	private int ballsBowled;
	private	int runsLeaked;
	private int wickets;


protected Bowler() {
	
}
protected Bowler(String name,int ballsBowled,int runsLeaked,int wickets) {
	
	super(name);
    this.ballsBowled=ballsBowled;
	this.runsLeaked=runsLeaked;
	this.wickets=wickets;
}
protected int getBallsBowled() {
	return ballsBowled;
}
protected void setBallsBowled(int ballsBowled) {
	this.ballsBowled = ballsBowled;
}
protected int getRunsLeaked() {
	return runsLeaked;
}
protected void setRunsLeaked(int runsLeaked) {
	this.runsLeaked = runsLeaked;
}
protected int getWickets() {
	return wickets;
}
protected void setWickets(int wickets) {
	this.wickets = wickets;
}


public String BowlerStrike() {
	float rate1 = ((float)( ballsBowled / wickets)); 
	DecimalFormat d = new DecimalFormat("#.##");
	
	return d.format(rate1);
	
}
@Override
public String toString() {
	return "Bowler [ballsBowled=" + ballsBowled + ", runsLeaked=" + runsLeaked + ", wickets=" + wickets
			+ ", BowlerStrike()=" + BowlerStrike();
}


}

