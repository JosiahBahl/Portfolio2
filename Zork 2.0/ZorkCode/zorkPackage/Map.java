//Package
package zorkPackage;
/**
 * @author Josiah Bahl
 */
//Main class
public class Map 
{
	//Varibles
	Room[][] map = new Room[10][10];
	//Constructor
	public Map()
	{
	}
	/**
	 * addRoom method,
	 * adds a room to the desinated row and column of the twoDArray map.
	 * @param row
	 * @param column
	 * @param room
	 */
	public void addRoom(int row, int column, Room room)
	{
		map[row][column] = room;
	}
}
