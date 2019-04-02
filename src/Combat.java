import java.util.ArrayList;

public class Combat
{
	public String currentEnemy;
	
	public String encounter()
	{
		ArrayList<String> enemies = new ArrayList<>();
		Room room = new Room(enemies );
		int randomIndex = (int) Math.random();
		currentEnemy = (String) room.enemies.get(randomIndex);
		return currentEnemy;
	}
	
	public void battle()
	{
		System.out.printf("You have encountered a %s", currentEnemy);
		while(true)
		{
			System.out.printf("%s\nHealth: ",currentEnemy);
		}
	}
	
}
