package game;

public class Player
{
	private int locationX;
	private int locationY;
	
	public Player(int x, int y)
	{
		locationX = x;
		locationY = y;
	}
	
	public int getX()
	{
		return locationX;
	}
	
	public int getY()
	{
		return locationY;
	}
	
	public void setX(int newX)
	{
		locationX = newX;
	}
	
	public void setY(int newY)
	{
		locationY = newY;
	}
}
