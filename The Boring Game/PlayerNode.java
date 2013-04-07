
public class PlayerNode implements Cloneable{

	//class varibles
	private int _wins;
	private PlayerNode _link;
	private PlayerNode _head;
	private PlayerNode _tail;
	private String _name;
	
	//Constructor
	public PlayerNode(String name, PlayerNode initialLink)
	{
		_name = name;
		_link = initialLink;
		_wins = 0;
	}
	
	//get Data
	public String getName()
	{
		return _name;
	}
	
	//get Link
	public PlayerNode getLink()
	{
		return _link;
	}
	
	//Set Data
	public void setName(String newName)
	{
		_name = newName;
	}
	
	//Set Link
	public void setLink(PlayerNode newLink)
	{
		_link = newLink;
	}
	
	//Get Head
	public PlayerNode getHead()
	{
		return _head;
	}
	
	//Get Tail
	public PlayerNode getTail()
	{
		return _tail;
	}
	
	//Set Head
	public void setHead(PlayerNode newHead)
	{
		_head = newHead;
	}
	
	//Set Tail
	public void setTail(PlayerNode newTail)
	{
		_tail = newTail;
	}

	//Get Wins
	public int getWins() {
		return _wins;
	}

	//Set wins
	public void setWins(int wins) {
		_wins = wins;
	}
	
	// Adds a Node after the current node
	public void addNodeAfter(String name)
	{
		_link = new PlayerNode(name, _link);
	}
	
	// removes the link after the current link
	public void removeNodeAfter()
	{
		_link = _link._link;
	}
	
	//Counts how many links there are.
	public static int listLength(PlayerNode head)
	{
		int size = 0;
		PlayerNode cursor;
		for(cursor = head; cursor != null; cursor = cursor._link)
		{
			size++;
		}
		return size;
	}
	
	//Searches the linkList for the target
	public static PlayerNode listSearch(PlayerNode head, String target)
	{
		PlayerNode cursor;
		for(cursor = head; cursor != null; cursor = cursor._link)
		{
			if(cursor.getName().equalsIgnoreCase(target))
			{
				return cursor;
			}
		}
		return null;
	}
	
	//Deep clone
	public PlayerNode clone()
	{
		PlayerNode playerClone = new PlayerNode(this.getName(), this.getLink());
		playerClone.setWins(this.getWins());
		return playerClone;
	}
}