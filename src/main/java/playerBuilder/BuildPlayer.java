package playerBuilder;

public class BuildPlayer {
		private String name;
		private String position;
		private int jerseyNum;
		private String batting;
		private String throwing;
		
		
	public BuildPlayer() {
		
	}
	
	public BuildPlayer(String name, String position, int jerseyNum, String batting, String throwing) {
		this.name = name;
		this.position = position;
		this.jerseyNum = jerseyNum;
		this.batting = batting;
		this.throwing = throwing;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String position() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public int jerseyNum() {
		return jerseyNum;
	}
	
	public void setJerseyNum(int jerseyNum) {
		this.jerseyNum = jerseyNum;
	}
	
	public String batting() {
		return batting;
	}
	
	public void setBatting(String batting) {
		this.batting = batting;
	}
	
	public String throwing() {
		return throwing;
	}
	
	public void setThrowing(String throwing) {
		this.throwing = throwing;
	}
	
	public String playerDisplay() {
		String display = 
			  "Name: " + name + '\n'
			+ "Position: " + position + '\n'
			+ "Jersey #: " + jerseyNum + '\n'
			+ "Batting Side: " + batting + '\n'
			+ "Throwing Hand: " + throwing + '\n';
		
		return display;
	}
	
	
	
	
	
	
	
	

}
