//Package
package zorkPackage;
//Import for HashMap
import java.util.HashMap;
import java.util.Scanner;
/**
 * @author Josiah Bahl
 *
 */
//Main class
public class Inventory {
	//Varibles
	private HashMap<String, ObjectZork> inventory = new HashMap<String, ObjectZork>();
	private final int MAX_SPACE = 9;
	private int spaceCount = 0;
	//Constructor
	public Inventory()
	{
	}
	/**
	 * Method for adding an item to your inventory.
	 * Params are the item you wish to pick up and the room your currently in.
	 * First it checks to see if you reached you max space in the inventory,
	 * if not it checks to see what item you wish to pick up and if your in the correct room to pick it up in,
	 * once you add an item is bumps up the spaceCount by one.
	 * @param item
	 * @param room1
	 * @return
	 */
	public void addItem(ObjectZork item, Room room1)
	{
		if(spaceCount == MAX_SPACE)
		{
			System.out.println("You cannot pick up any more items, your inventory is full." + "\n" +
			"You should drop an item");
		}
		else
		{
	        if(room1.roomEquals(item.getRoomFoundIn()) && (item.getPickedUp() == false) && (item.getRoomFoundIn().getLookedCloser() == true))
	        {
	            System.out.println("You picked up " + item.getName() + item.getDescription());
	            item.setPickedUp(true);
				inventory.put(item.getName(), item);
				spaceCount++;
	        }
	        else if(item.getName().equals("Full Health") && room1.roomEquals(item.getRoomFoundIn()) && (item.getPickedUp() == false))
	        {
	            System.out.println("You picked up " + item.getName() + item.getDescription());
	            item.setPickedUp(true);
				inventory.put(item.getName(), item);
				spaceCount++;
	        }
	        else
	        {
	        	System.out.println("There is nothing of that name there ");
	        }
		}
	}
	/**
	 * Method for removing items from your inventory.
	 * First checks to see if you have the item,
	 * and if you do it removes it from your inventory,
	 * If you don't it prints out a statement.
	 * @param item
	 * @return
	 */
	public void dropItem(ObjectZork item)
	{
		if(inventory.containsKey(item.getName())== true)
		{
			item.setPickedUp(false);
			item.setDropped(true);
			System.out.println("You just dropped a " + item.getName());	
			inventory.remove(item.getName());
			spaceCount--;
		}
		else
		{
			System.out.println("You don't have that item to drop");
		}
	}
	/**
	 * Use method for using objects,
	 * Takes the item you want to use and depending on the item gives an effect.
	 * @param item
	 * @param player
	 */
	public void Use(ObjectZork item, Player player)
	{
		if(item.getName().equals("Sandwich"))
		{
			player.setHealth(player.getHealth() + 3);
			System.out.println("You used: " + item.getName() + " And healed yourself by three points!");
			player.inventory.dropItem(item);
		}
		else if(item.getName().equals("Full Health"))
		{
			player.setHealth(5);
			System.out.println("You used: " + item.getName() + " And healed yourself fully!");
			player.inventory.dropItem(item);
		}
		else if(item.getName().equals("Gas Mask"))
		{
			System.out.println("You used: " + item.getName() + " And put it on");
		}
		else if(item.getName().equals("Large Shovel"))
		{
			System.out.println("You used: " + item.getName() + " And did nothing with it....");
		}
	}
	/**
	 * Method for using one item to interact with another item,
	 * It takes the item you want to use with the item/npc you can use it on to make something happen.
	 * @param item1
	 * @param item2
	 * @param npc
	 * @param room
	 * @param player
	 */
    public void useComboItem(ObjectZork item1, ObjectZork item2, NPC npc, Room room, Player player)
    {
    	System.out.println("What item do you want to use it on?");
    	System.out.print(">"); Scanner sc=new Scanner(System.in);
    	String name=sc.nextLine();
    	if(item1.getName().equals("Golden Key") && (item1.getPickedUp() == true) && (name.toLowerCase().equals("goldenchest") && (room.roomEquals(item2.getRoomFoundIn()))))
    	{
    		player.inventory.dropItem(item1);
    		System.out.println("You opened the chest to find a severed hand giving you the middle finger");
    	}
    	else if(item1.getName().equals("Golden Ticket") && (item1.getPickedUp() == true) && (name.toLowerCase().equals("busspassbox") && (room.roomEquals(item2.getRoomFoundIn()))))
    	{
    		player.inventory.dropItem(item1);
    		System.out.println("You put the ticket into the box summoning a magic bus to take you away from this horrible place. You have one the game congratulations.");
    		GameWorld newGame = new GameWorld();
    		newGame.play();
    	}
    	else if(item1.getName().equals("Sword") && (item1.getPickedUp() == true) && (name.toLowerCase().equals("Goblin") && (room.roomEquals(npc.getRoomFoundIn()))))
    	{
    		player.inventory.dropItem(item1);
    		System.out.println("You slaughter the goblin with your sword skills killing it.");
    		room.setChangeRoom(true);
    	}
    	else if(item1.getName().equals("Axe") && (item1.getPickedUp() == true) && (name.toLowerCase().equals("Goblin") && (room.roomEquals(npc.getRoomFoundIn()))))
    	{
    		player.inventory.dropItem(item1);
    		System.out.println("You behead the goblin with the axe.");
    		room.setChangeRoom(true);
    	}
    	else
    	{
    		System.out.println("You cannot combine " + item1.getName() + " with " + name);
    	}
    }
	/**
	 * Prints out a list of what is in your inventory.
	 * @return
	 */
	public String inventoryList()
	{
		return "You have in your inventory " + inventory.keySet();
	}
}
