
package zorkPackage;
/**
 * @author Josiah Bahl
 */
//Main class
public class NPC
{
	//Varibles
	private String talkingText;
	private String slappingText;
	private String name;
	private String discription;
	private Room roomFoundIn;
	private boolean met;
	private boolean isAngry;
	
	//Constructor
    public NPC(String Name, String Discription, boolean Met, String TalkingText, String SlappingText, Room RoomFoundIn, boolean IsAngry)
    {
        this.name = Name;
        this.discription = Discription;
        this.met = Met;
        this.talkingText = TalkingText;
        this.roomFoundIn = RoomFoundIn;
        this.isAngry = IsAngry;
        this.slappingText = SlappingText;
    }
    // Get method for name
    public String getName()
    {
        return name;
    }
    // Get method for description
    public String getDiscription()
    {
        return discription;
    }
    // Get method for if you met the NPC before
    public boolean getMet()
    {
        return met;
    }
    // Set method for when you meet the NPC
    public void setMet(boolean haveMet)
    {
      this.met = haveMet;  
    }
    //toSrting for NPC.
    @Override
    public String toString()
    {
        return "You have met " + getName() + getDiscription();
    }

    /**
     * Talk method for talking to the NPC's,
     * needs the NPC you wish to talk to and the current room you're in,
     * checks to see what NPC you want to talk to and if you're in the right room,
     * if you are it prints out the talkingText for the NPC.
     * @return 
     */
    public void Talk(Room room1)
    {
        if(this.getIsAngry() == true)
        {
            System.out.println("You cannot talk to that NPC because their angry at you ");
        }
    	else if(room1.roomEquals(this.getRoomFoundIn()))
        {
            System.out.println(this.getTalkingText());
        }
        else
        {
        	System.out.println("You cannot talk to " + this.getName());
        }
    }
    /**
     * Slap method for slapping NPC's.
     * @param objectName
     * @param item
     * @param room1
     */
    public void slapNPC(Room room1, Player player)
    {
        if(room1.roomEquals(this.getRoomFoundIn()))
        {
            System.out.println(this.getSlappingText());
            this.setAngry(true);
        }
        else if(this.getName().equals("Mad Actors") && (room1.roomEquals(this.getRoomFoundIn())))
        {
        	room1.setChangeRoom(true);
        }
        else if(this.getName().equals("Kendall Martin") || (this.getName().equals("Ugly Witch")) || (this.getName().equals("Tavern Patrons")) || (this.getName().equals("Vampires")) || (this.getName().equals("Crazy Old Professor")) || (this.getName().equals("Mad Goblin")) && (room1.roomEquals(this.getRoomFoundIn())))
        {
        	System.out.println(this.getSlappingText());
        	player.setHealth(player.getHealth()-1);
        	this.setAngry(true);
        }
        else if(this.getName().equals("Fred") || (this.getName().equals("Aid Women")) || (this.getName().equals("Bad Bard")) && (room1.roomEquals(this.getRoomFoundIn())))
        {
        	System.out.println(this.getSlappingText());
        }
        else
        {
            System.out.println("There is no NPC with that name to slap");
        }
    }
	/**
	 * @return the talkingText
	 */
	public String getTalkingText() {
		return talkingText;
	}
	/**
	 * @param talkingText the talkingText to set
	 */
	public void setTalkingText(String talkingText) {
		this.talkingText = talkingText;
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
	/**
	 * @return the isAngry
	 */
	public boolean getIsAngry() {
		return isAngry;
	}
	/**
	 * @param isAngry the isAngry to set
	 */
	public void setAngry(boolean isAngry) {
		this.isAngry = isAngry;
	}
	/**
	 * @return the slappingText
	 */
	public String getSlappingText() {
		return slappingText;
	}
	/**
	 * @param slappingText the slappingText to set
	 */
	public void setSlappingText(String slappingText) {
		this.slappingText = slappingText;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param discription the discription to set
	 */
	public void setDiscription(String discription) {
		this.discription = discription;
	}
}


