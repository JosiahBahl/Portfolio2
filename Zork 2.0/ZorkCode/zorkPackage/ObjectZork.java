//Package
package zorkPackage;
/**
 * @author Josiah Bahl
 *
 */
//Main class
public class ObjectZork
{
	// Varibles for input information.
		private String name;
		private String description;
		private boolean Dropped;
		private boolean PickedUp;
	    private Room roomFoundIn;
	    //Constructor
	    public ObjectZork(String Name, String Description, boolean ifDropped, boolean ifPickedUp, Room RoomFoundIn)
	    {
	        this.name = Name;
	        this.description = Description;
	        this.Dropped = ifDropped;
	        this.PickedUp = ifPickedUp;
	        this.roomFoundIn = RoomFoundIn;
	    }
	    /**
	     * Method for slapping stuff, not to sure where to put this,
	     * I might make a slap method for NPC's too.
	     * @param object
	     * @param room1
	     * @param room2
	     * @return
	     */
	    public void slapObject(ObjectZork item)
	    {
	        if((item.getName().equals("Sandwich") && item.getPickedUp()==true))
	        {
	            System.out.println("You slap your sandwich you dumn shit!");
	        }
	        else
	        {
	            System.out.println("There is no object with that name to slap");
	        }
	    }
	    // get for name
	    public String getName()
	    {
	        return name;
	    }
	    // get for description.
	    public String getDescription()
	    {
	        return description;
	    }
	    // get for is the item was dropped
	    public boolean getDropped()
	    {
	        return Dropped;
	    }
	    // get for if the item is picked up.
	    public boolean getPickedUp()
	    {
	        return PickedUp;
	    }
	    // set for if the item is dropped
	    public void setDropped(boolean isDropped)
	    {
	        this.Dropped = isDropped;
	    }
	    // set for if the item is picked up.
	    public void setPickedUp(boolean isPickedUp)
	    {
	        this.PickedUp = isPickedUp;
	    }
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @param description the description to set
		 */
		public void setDescription(String description) {
			this.description = description;
		}
		/**
		 * @return the roomFoundIn
		 */
		public Room getRoomFoundIn() {
			return roomFoundIn;
		}
		/**
		 * @param roomFoundIn the roomFoundIn to set
		 */
		public void setRoomFoundIn(Room roomFoundIn) {
			this.roomFoundIn = roomFoundIn;
		}
	}