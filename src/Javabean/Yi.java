package Javabean;

public class Yi {

	private String countryname;
	private int confirmed;
	private int suspected;
	private int dead;
	private int healed;
	private String lastupdateTime;
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	
	public int getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(int confirmed) {
		this.confirmed = confirmed;
	}
	public int getSuspected() {
		return suspected;
	}
	public void setSuspected(int suspected) {
		this.suspected = suspected;
	}
	public int getDead() {
		return dead;
	}
	public void setDead(int dead) {
		this.dead = dead;
	}
	public int getHealed() {
		return healed;
	}
	public void setHealed(int healed) {
		this.healed = healed;
	}
	public String getLastupdateTime() {
		return lastupdateTime;
	}
	public void setLastupdateTime(String lastupdateTime) {
		this.lastupdateTime = lastupdateTime;
	}
	public Yi() {}
	public Yi(String countryname,int confirmed,int suspected,int dead,int healed,String lastupdateTime) {
		this.countryname=countryname;
		this.confirmed=confirmed;
		this.suspected=suspected;
		this.dead=dead;
		this.healed=healed;
		this.lastupdateTime=lastupdateTime;
	}
}
