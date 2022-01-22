
public class Players {
	
	private int position;
	private int priority;
	private String username;
	
	public Players() {
		position=0;
		priority=0;
		username=null;
	}
	
	public Players(int x, String y) {
		position=0;
		priority=x;
		username=y;
	}
	
	public int getPosition() {
		return this.position;
	}
	
	public int getPriority() {
		return this.priority;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setPosition(int x) {
		this.position = x;
	}
	
	public void setPriority(int x) {
		this.priority = x;
	}
	
	public void setUsername(String x) {
		this.username = x;
	}
	
	public void movePlayer(int y) { //changes positions, and adds a snake/ladder effect if present
		this.position += y;
		int x=LaddersAndSnakes.getRestraint(this.position);
		this.position += x;
	}
	
	
}
