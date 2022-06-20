public class House {

	private int ID;
	private int duration;
	private double rating;
	
	public House(int ID, int duration, double rating) {
		this.ID = ID;
		this.duration = duration;
		this.rating = rating;
		
	}
	public int getID() {return ID;}
	public int getDuration() {return duration;}
	public double getRating() {return rating;}
	
	public void setDuration(int duration) {this.duration = duration;}
	
}


