//Package
package zorkPackage;
/**
 * @author Josiah Bahl
 */
//Main class
public class Player 
{
	//Varibles
	private int Health = 5;
	Inventory inventory = new Inventory();
	//Constuctor
	public Player()
	{	
	}
	public void showHealth()
	{
		System.out.println(Health);
	}
	/**
	 * @return the health
	 */
	public int getHealth() {
		return Health;
	}
	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		Health = health;
		if(Health > 5)
		{
			Health = 5;
		}
	}
}
