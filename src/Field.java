
public class Field extends Room
{
	public Field()
	{
		super(enemies);
		
	}
	
	public void addEnemies()
	{
		enemies.add("Spider");
		enemies.add("Creep");
		enemies.add("Blob");
	}
	public void setDescription()
	{
		System.out.println("An empty field lies before you with no\n town in sight except for the one you just left");
	}
}
