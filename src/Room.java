import java.util.ArrayList;

public class Room 
{
	public static  ArrayList<String> enemies = new ArrayList<>();
	public String description;
	
	public Room(ArrayList enemies) 
	{
		this.enemies= enemies;
	}

	public ArrayList getEnemies() {
		return enemies;
	}
	public String getDescription()
	{

		return description;
	}
	

	
	

	

	
	
}
