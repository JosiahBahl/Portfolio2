//Package
package zorkPackage;
//Import for Arrays
import java.util.*;
/**
 * @author Josiah Bahl
 *Main Class
 */
class CommandWords
{
    // a constant array that holds all valid command words
    private static final String validCommands[] = {
        "go", "quit", "slap", "take", "look", "talk", "inventory","help", "drop", "use", "health"
    };
    /**
     * Constructor - initialise the command words.
     */
    public CommandWords()
    {
        // nothing to do at the moment...
    }
    /**
     * Check whether a given String is a valid command word. 
     * Return true if it is, false if it isn't.
     **/
    public boolean isCommand(String aString)
    {
        for(int i = 0; i < validCommands.length; i++)
        {
            if(validCommands[i].equals(aString)) {
                return true;
            }
        }
        // if we get here, the string was not found in the commands
        return false;
    }
    /*
     * Print all valid commands to System.out.
     */
    public String showAll() 
    {
        return Arrays.toString(validCommands) + "\n" + "If slapping or talking to something, do so like 'talk josiah' or 'slap door'" + "\n" + 
        "If the item has a space between the name like 'Golden Chest' type it without the space 'goldenchest'." + "\n" +
        "If you want to move type go then the direction you want to move in 'go south'.";
    }
}

