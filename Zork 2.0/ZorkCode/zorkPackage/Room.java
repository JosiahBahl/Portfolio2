//Package
package zorkPackage;
/**
 * @author Josiah Bahl
 */
//Import for HashMap
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
//Main class
class Room
{
	//Varibles
	private String description;
    private boolean lookedCloser;
    private String closerInspection;
    private boolean changeRoom;
    @SuppressWarnings("unchecked")
	private HashMap exits;        // stores exits of this room.
    /**
     * Create a room described "description". Initially, it has no exits.
     * "description" is something like "a kitchen" or "an open court yard".
     * Also has boolean for if you used the command 'look around' in the room.
     */
	@SuppressWarnings("unchecked")
	public Room(String description, String CloserInspection, boolean LookedCloser, boolean ChangeRoom) 
    {
        this.description = description;
        this.closerInspection = CloserInspection;
        this.lookedCloser = LookedCloser;
        this.changeRoom = ChangeRoom;
        exits = new HashMap();
    }

    /**
     * Define the exits of this room.  Every direction either leads to
     * another room or is null (no exit there).
     */
    @SuppressWarnings("unchecked")
	public void setExits(Room north, Room east, Room south, Room west) 
    {
        if(north != null) {
            exits.put("north", north);
        }
        if(east != null) {
            exits.put("east", east);
        }
        if(south != null) {
            exits.put("south", south);
        }
        if(west != null) {
            exits.put("west", west);
        }
    }

    /**
     * Return the description of the room (the one that was defined in the
     * constructor).
     */
    public String shortDescription()
    {
        return description;
    }

    /**
     * Return a long description of this room, on the form:
     *     You are in the kitchen.
     *     Exits: north west
     */
    public String longDescription()
    {
        return  description + ".\n" + exitString();
    }
    // get for if you looked around in the room
    public boolean getLookedCloser()
    {
    	return lookedCloser;
    }
    // set for if you looked around in the room.
    public void setLookedCloser(boolean NewLookedCloser)
    {
    	this.lookedCloser = NewLookedCloser;
    }

    /**
     * Return a string describing the room's exits, for example
     * "Exits: north west ".
     */
    @SuppressWarnings("unchecked")
	private String exitString()
    {
        String returnString = "Exits:";
		Set keys = exits.keySet();
        for(Iterator iter = keys.iterator(); iter.hasNext(); ) {
            returnString += " " + iter.next();
        }
        return returnString;
    }

    /**
     * Return the room that is reached if we go from this room in direction
     * "direction". If there is no room in that direction, return null.
     */
    public Room nextRoom(String direction) 
    {
        return (Room)exits.get(direction);
    }
    //Equals method for comparing one room to another room to see if they are the same.
    public boolean roomEquals(Room room1)
    {
        if(room1.shortDescription().equals(this.shortDescription()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
	/**
	 * Method for looking around in the room.
	 * @param target is the second command word.
	 * @param room is the current room.
	 * @return
	 */
	public void looking(Room room)
	{
			System.out.println(room.getCloserInspection());
			room.setLookedCloser(true);
	}

	/**
	 * @return the closerInspection
	 */
	public String getCloserInspection() {
		return closerInspection;
	}

	/**
	 * @param closerInspection the closerInspection to set
	 */
	public void setCloserInspection(String CloserInspection) {
		CloserInspection = closerInspection;
	}

	/**
	 * @return the changeRoom
	 */
	public boolean getChangeRoom() {
		return changeRoom;
	}

	/**
	 * @param changeRoom the changeRoom to set
	 */
	public void setChangeRoom(boolean changeRoom) {
		this.changeRoom = changeRoom;
	}
}
