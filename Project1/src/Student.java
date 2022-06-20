public class Student {

	private int ID;
	private String name;
	private int duration;
	private double rating;
	private int allocation = 0;
	
	public Student(int ID, String name, int duration, double rating) {
		this.ID = ID;
		this.name = name;
		this.duration = duration;
		this.rating = rating;
		
}
	public int getID() {return ID;}
	public String getName() {return name;}
	public int getDuration() {return duration;}
	public double getRating() {return rating;}
	public int getAllocation() {return allocation;}
	
	public void setDuration() {this.duration -= 1;}
	public void setAllocation(int allocation) {this.allocation = allocation;}
}

