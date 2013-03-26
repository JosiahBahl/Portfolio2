//Package
package zorkPackage;

import java.util.Scanner;

/**
 * @author Josiah Bahl
 */
//Main Class
public class GameWorld {
	/**
	 * All Varibles for the game to be used outside of the createGame method.
	 */
	//Varibles
	private Parser parser;
	//Base Room
    private Room currentRoom;
    //Rooms
    private Room OutsideATC;
    private Room InsideATC;
    private Room OutsideATCFront;
    private Room BusStation;
	private Room CollegeHall;
	private Room ScienceCenter;
	private Room ATCHallL1Floor;
	private Room ATCHallR1Floor;
	private Room RecordingStudioATC;
	private Room ComputerLabATC;
	private Room ClassroomATC;
	private Room RestroomATC;
	private Room ATCEastHall;
	private Room StairwellATC;
	private Room ObservatoryATC;
	
	private Room CourtYard;
	private Room BellTower;
	private Room SCandATCconnectorPath;
	private Room ATCandPHconnectorPath;
	
	
	private Room AidCenter;
	private Room CollegeHallBottom;
	private Room Arena;
	private Room Tavern;
	private Room Pavilion;
	private Room Library;
	
	private Room Parkhouse;
	private Room HallwayNorth;
	private Room NorthClassEast;
	private Room NorthClassWest;
	private Room ParkhouseLot;
    private Room HallwayEast;
    private Room EastClassNorth;
    private Room EastClassSouth;
    private Room EastClassEast;
    private Room HallwaySouth;
    private Room SouthClassEast;
    private Room SouthClassWest;
    private Room SouthClassSouth;
    private Room HallwayWest;
    private Room WestClassSouth;
    private Room WestClassNorth;
    private Room WestClassWest;
    private Room ParkhouseFront;
	
	
	private Room OutsideScienceCenterFront;
	private Room InsideScienceCenterMain;
	private Room AuditoriumSC;
	private Room StageSC;
	private Room SouthHallwaySC;
	private Room SmogRoomSC;
	private Room NorthHallwaySC;
	//private Room DarkStairwellSC;
	private Room DentistOfficeSC;
	//Map
	//Map map = new Map();
	//Objects
	private ObjectZork Sandwich;
	private ObjectZork FullHealth;
	private ObjectZork GoldenKey;
	private ObjectZork GoldenChest;
	private ObjectZork Sword;
	private ObjectZork GoldenTicket;
	private ObjectZork GasMask;
	private ObjectZork LargeShovel;
	private ObjectZork Axe;
	private ObjectZork BusPassBox;
	//NPC's
	private NPC Sorcerer;
	private NPC JosiahBahl;
	private NPC Actors;
	private NPC Witch;
	private NPC AidWomen;
	private NPC Patrons;
	private NPC Bard;
	private NPC Professor;
	private NPC Vampires;
	private NPC Fairys;
	private NPC Fred;
	private NPC Dentists;
	private NPC OldProfessor;
	private NPC Goblin;
	//Player
	private Player player1;
    //Constructor
    public GameWorld()
    {
    	createGame();
    	parser = new Parser();
    }
    /**
     * Method for creating all objects(Rooms, Objects, NPCs, ect) in the game,
     * Fills in parameters for the varibles above,
     * Sets exits for rooms,
     * And it sets the starting room.
     */
	public void createGame()
	{
        CourtYard = new Room(" You look up towards the sky and see a dragon fly overhead. As it swoops into the courtyard you put your hand on your weapon. False alarm." + "\n" +
            	" To the north is College Hall. East is the ol'  Parkhouse and West is the Science Center. And finally, South is the Advanced Technology Center.",
					" You search around the middle of the campus and cant stop spinning. You throw up on the ground.", false, false);
         BellTower = new Room (" You are standing around an enormous bell tower. The bells are silent up until the moment you walk right next to them, and out of nowhere they ring " + "\n" +
            	" and scare the bejesus out of you. South leads you to the main entrance to the Science Center. West leads you into the Science Center and East leads you to the entrance of College Hall.",
					" After cleaning up the mess you just made in your pants after the bells scaring you. Youre back on your feet and ready for some more. ", false, false);     
         SCandATCconnectorPath = new Room("You are standing underneath a catwalk between Science Center and ATC. South leads you to a Bus Station, North leads you to the entrance " + "\n" +
            	" of the Science Center. West leads you into South Entrance to the SC and East leads you into the side entrance of the ATC.",
					" Three goats walk abovwe you on the catwalk. Does this make you the goblin under the bridge.", false, false);
         ATCandPHconnectorPath = new Room(" You are on the path between ATC and Parkhouse. "," How many paths are on this campus?!?!",false, false);
           
           //College Hall Rooms
         CollegeHall = new Room(" Here there are people standing about chatting. North of you is the aid center. There you'll get advice for your journey. East of you is a staircase " +
            	"\n" + "leading down.", " You look around the very futuristic and fancy new College Hall.",false, false); 
         AidCenter = new Room(" A group of women tell you good luck."," Stupid bitches are no help at all. ", false, false);
         CollegeHallBottom = new Room(" At the bottom of the staircase you see a tavern to the north and to the west is an arena. A staircase east of you leads up to " +
            	"\n" + "a library.", " You trip down the stairs while looking around. Gotta stop drinking and walking.  ", false, false);
         Arena = new Room(" You see a ring in which students are battling one another.",
					" Your prize for winning such a tournament in the arena is the untimely pride of being king nerd in the epic plastic lightsaber tournament.", false, false);
         Tavern = new Room(" In the tavern patrons are eating and drinking to raise their strength. North there is a door that leads behind College Hall."," ", false, false);
         Pavilion = new Room(" A beautiful, grassy field is ahead. It's beauty is masked by a woman to the left. She appears to be a witch and looks anything but friendly.",
					" You try to look around but this woman is all you can focus on. ", false, false);
         Library = new Room(" You enter a beautiful library with tall wooden arches and 3 floors of books. People are brainstorming and wizards are brushing up on their spells,",
					" Throughout the magical realm of the library you find a golden ticket. I wonder where it leads. ", false, false);
           
           //Parkhouse Rooms 
         Parkhouse = new Room(" You enter a large building with expansive stonework. Inside a bard entertains a small crowd. There are hallways in each direction.",
					" The bard is an awful player, you toss him a coin to get him to shut up. ", false, false);
         HallwayNorth = new Room(" You enter a hallway. East and west are classrooms. North is the Parkhouse stable",
					" The faint smell of manure is in the air.", false, false);
         NorthClassEast = new Room(" You struggle to open a large iron door. Inside the professor is standing in front of a cauldron.",
					" For some reason he give you his mixing spoon, which is actually a large shovel.", false, false);
         NorthClassWest = new Room(" You enter a class room that is completely overgrown with foilage. It's difficult to move around the mass of plants.",
					" You look around and turn into a cactus. After hours of crying from one needle in your toe, you put on your big boy pants and get back in the action.", false, false);
         ParkhouseLot = new Room(" You wander towards the Parkhouse Stable. These horses are unruly. Their name plaques say Volkswagon, Chevy, Ford and Honda.",
					" After much searching around you find yourself in a pile of manure. Your stench is awful. After bathing your ego is damaged and you go away. ", false, false);
         HallwayEast = new Room(" You stumble down a dark, damp hallway. There must be a reason it's so gloomy. There are classrooms all around you.",
					" It appears that the lights were off this entire time and after you flip the switch you find that its filled with Bats. Lets keep the lights off shall we?", false, false);
         EastClassNorth = new Room(" The door is heavy, and creaks open slowly. You look around carefully when suddenly a goblin jumps out at you.",
					" This goblin looks dangerous, maybe you should kill him with a weapon.", false, false);
         EastClassSouth = new Room(" As soon as you open the door an entire lecture hall of vampires is staring at you. They appear non-hostile, but one can never be too sure...",
					" The vampires look at you with extreme hunger in their eyes. You crack a couple of Team Jacob jokes and now you need to bolt out of there.", false, false);
         EastClassEast = new Room(" You enter the classroom and see the walls warping. It almost seems as if the room is breathing.",
					" You told me you wouldn't do LSD before playing this game!!!", false, false);
         HallwaySouth = new Room(" You head south down a hallway leading to more classrooms in every direction.",
					" You spin and spin  and it seems that no matter where you looks there are rooms. You better find a way out fast or you will be lost.", false, false);
         SouthClassEast = new Room(" You enter a classroom. It is completely empty expcept for a large chest in the corner.",
					" You search and open the chest. The only thing you find is a demon that punches you in the nose and runs away. ", false, false);
         SouthClassWest = new Room(" You head towards the west classroom and before you get to the door, a blue fairy flies out. You head inside and see an entire colony of them living" + "\n" +
            	" in the overgrown classroom."," The fairy sprays you with blut dust. It makes you sneeze. Its basically pointless, but it makes you feel pretty. ", false, false);
         SouthClassSouth = new Room(" You enter the classroom and see a shiny object on the other side of the room. You try to walk towards it but it begins sinking into the floor. ",
					" ", false, false);
         HallwayWest = new Room(" You enter a hallway with grand ceilings. North, south and east are doors.",
					" The walls and ceilings are intricately decorated with the pictures of  ", false, false);
         WestClassSouth = new Room(" Behind the door the rooms walls and ceiling are made of gold. The floor, however, is made of dirt.",
					" Such a nice room, but what awful floor work. ", false, false);
         WestClassNorth = new Room(" In the corner of the room you see a sad looking creature all alone. Could it be hurt?",
            	" You look around the creature and you see he has an axe. After longs amounts of useless babbling, the Creature who calls himself Fred, gives you an axe.", false, false);
         //WestClassWest = new Room(" You enter and see the roots of a giant black tree. You look up and see the tree has grown straight through the ceiling.",
            	//" Now who's the supid bastard that lets a tree go straight through a ceiling. You look up ans see something shimmering. Could something be in the tree?", false, false);
         ParkhouseFront = new Room("You're standing in front of the Parkhouse. West is the courtyard, East leads into the Parkhouse building. South leads you to a path towards ATC.",
            	" You look around a see a sign that says Parkhouse. The name doesn't make much sense since you cant really live there or park there. Idiots!", false, false);
           
           
           //Science Center Rooms
         OutsideScienceCenterFront = new Room (" You are standing in front of the oldest building on campus, The Science Center. West leads you into the building and East leads towards the" + "\n" +
            	" vast wide open courtyard. North leads you on a path towards a large bell tower and South leads you down a path towards ATC...ish. ",
            	"You look around and see little demons dart into the building all around you. This place has evil crawling all over it. ", false, false);
         InsideScienceCenterMain = new Room (" You entered through the main doors of the Science Center. The air around you is thick and damp from all the toxic experiments and students" + "\n" +
            	" failed hopes and dreams. Ahead(west) you hear the echoed sounds of singing and shrill laughter through large open doors. South you see a thick smog that is oozing" + "\n" +
            	" from the hallway. To the North you hear the sounds of children screaming and the whine of ancient dental equipment. East leads you outside.",
            	" You search the room and see that the building is slowly falling apart, from chipped bricks, to an unsettlingly large fungus growth in the corner. This place is disgusting. ", false, false);
         AuditoriumSC = new Room (" You have entered an ancient theater and are standing in the stands. Actors and singers wearing strange and bizarre costumes seem to be reacreating another"+ "\n" +
            	" verson of Shakespeares's 'Romeo and Juliet'(and let's be honest here, do you really need to see another God-awful version of that play again?????.) Forward(west) is the stage and " + "\n" +
            	" east leads to the main entrance.","You search the seats of the auditorium, but to no avail. You find a flask, but someone has finished all the booze. DAMN! ", false, false);
         StageSC = new Room (" You decided to brave the stage and the actors and singers are not pleased. They charge you with fiery eyes and banshee shrieks. Go back where you came or die!",
            	"You have amazing bobbing a weaving skills and manage to maneuver around the actors and find a golden key.", false, false);
         SouthHallwaySC = new Room (" You have moved into the South wing of the Sciecnce Center. The smog seems to be emanating from a Room to the west and it does not look safe for you" + "\n" +
            	"to go anywhere near that smog without some kind of protection. East is a doorway that leads out into the sunshine and ATC can be seen through the doors." ," ", false, false);
         SmogRoomSC = new Room (" You have entered the smog room and the smoke around you clouds your lungs. You ned to go back east or you will die.","You cannot search this room. ", false, false);
         NorthHallwaySC = new Room (" You are in the medical wing of the Science Center. Here they attempt to teach students the dark art of potion making, but rumors of sorcery have been heard." + "\n" +
            	" To the west is the room where the kids are screaming. To the North is a doorway. The sounds of bells can be heard outside.South leads to the main hall.","You look down the vast hallway and have " + "\n" +
            	"a choice between a path of soothing noises and that of torturous screams. Choose Wisely", false, false);
          // DarkStairwellSC = new Room (" You are now in the dark stariwell. An angry ogre races after you. Ogres are extremely tough creatures to kill. Maybe there is a way to sooth the beast."," ", false);
         DentistOfficeSC = new Room (" You have walked into the dentist office. People in white lab coats are hunched over screaming children who are strapped to chairs. Who knows what " + "\n" +
            	"kinds of black magic these people know so its better to just leave them be and leave."," You look around while the dentists seem preoccupied with torturing the kids. You find nothing. The place is spotless.  ", false, false);
           		
          
           
           
           
           
           //ATC Rooms
         OutsideATC = new Room(" You're in a parking lot filled with cars, North of you is a large futureistic building named the Advanced Technical Center, it seems to have an observertory ontop of it." + 
            	"\n" + "Behind you are a bunch of random cars, to the  west is a path leading to a vacant Bus Station."," Some jackass parked the cars into a wall of doom, there is no way out.", false, false);
         OutsideATCFront = new Room(" You are now standing out front of the ATC building. A vast courtyard can be seen to your north and various paths can be seen to both the east and the west. "+ "\n" +
            	" South leads into the ATC.","You look around and find nothing but many paths that lay ahead.",false, false);
         BusStation = new Room(" You are now at a vacant Bus Station. There is a Bus Pass box that summons a magical bus to take you away from here! East leads you into the ATC parking lot and " + "\n" +
            	" North leads you to a path between ATC and the Science Center."," You find in the cornor a Golden Box that is locked.", false, false);
         InsideATC = new Room(" You enter a wide lobby with a huge screen TV, there seems to be a food stand towards your left. North leads to the outside," + "\n" +
            	"South leads through a door to the back parking lot, to the West is what appears to be a hallway of classrooms, and to the East is what appears to be a hallway of classrooms."," You look around and can't find shit! Except for a sandwich.", false, false);
         ATCHallL1Floor = new Room(" A hallway filled with what appears to be classrooms and recording studios. West seems to lead outside into the light, to your North are recording studio's "+ "\n" +
            	"and to your South are some computer labs. East leads to the main hall of the ATC.","You look around and find nothing, but you hear ghostly shrieks from the recording studio.", false, false);
         ATCHallR1Floor = new Room(" A hallway filled with what appears to be classrooms, east seems to come to a split along with a staircase" + "\n" +
            	"to your North is a classroom that seems open, to your South is a restroom and West leads you into the ATC main hall. East leads to a perpendicular hallway."," ", false, false);
         RecordingStudioATC = new Room(" You are in the recording studio of the ATC. The sounds of singers of old can be heard through the speakers in the room. The only way out of this room is South.",
            	"You look aorund to find the ghostly shrieking sounds but no one can be found in the room. Spooky Stuff.", false, false);
         ComputerLabATC = new Room(" You have entered the Computer labs. From here you can see the sad souls of students being lost in the wonders and life sucking powers of World of Warcraft. " + "\n" +
            	"There is no hope for saving or communicating with these lost souls. Just leave them in peace. North is your only exit.","You begin to look around and find that World of Warcraft is slowly drawing you into its game. RUN!", false, false);
         ClassroomATC = new Room(" You have entered a classroom in the ATC. The room is filled with the monotonous voice of some crazy old professor. Every student in the room "+ "\n" +
            	"is fighting for their very sanity and praying for the clock to speed up. South is the only way out."," You look around your brain begins to boil from the voice of the professor. You find nothing.", false, false);
         RestroomATC = new Room(" You made the wrong decision to enter the Restroom. It seems as if the janitorial employees have taken off for the past year because the smell brings tears "+ "\n" +
            	"to your eyes. North is the only exit out of this dump.","You decide to brave the smell and search around and find an impressive gleaming sword. ", false, false);
         ATCEastHall = new Room(" You are in the East wing of the ATC. West leads you to a hallway. It would appear as if North leads out into the freshair and sunshine and south leads to a staricase.","Nothing is near.",false, false);
         StairwellATC = new Room(" You decided to make the perilous journey into the stairwell. On your journey you faced many perils such as stairs, stubbing your big toe, tripping up the stairs, "+ "\n" +
            	" and crying like a little schoolgirl. But no worries, there was no one around to see you sob. South leads you into the Observatory tower and North leads you down the stairs.","You search the stairs and find " + "\n" +
            	"a mask under the bottom of the stairs. You had to wrestle it from a little demon first. ", false, false);
         ObservatoryATC = new Room(" You are on the highest point on the entire campus. Very Few have access to the observatory so consider yourself lucky. There is a magical Sorcerer named Dr. Kendall Martin standing "+ "\n" +
            	"in front of you. East leads you into the stairwell behind you.","You look around and see an aura emanating from the wizard. Take caution approaching her.", false, false);
           
           // initialise room exits
           //North, East, South, West
         OutsideATC.setExits(InsideATC, null, null, BusStation);
         InsideATC.setExits(OutsideATCFront, ATCHallR1Floor, OutsideATC, ATCHallL1Floor);
         OutsideATCFront.setExits(CourtYard, ATCandPHconnectorPath, InsideATC, SCandATCconnectorPath);
         ATCHallL1Floor.setExits(RecordingStudioATC, InsideATC, ComputerLabATC, SCandATCconnectorPath);
         ATCandPHconnectorPath.setExits(ParkhouseFront, null, ATCEastHall, OutsideATCFront);
         ATCHallR1Floor.setExits(ClassroomATC, ATCEastHall, RestroomATC, InsideATC);
         RecordingStudioATC.setExits(null, null, ATCHallL1Floor, null);
         ComputerLabATC.setExits(ATCHallL1Floor, null, null, null);
         ClassroomATC.setExits(null, null, ATCHallR1Floor, null);
         RestroomATC.setExits(ATCHallR1Floor, null, null, null);
         ATCEastHall.setExits(ATCandPHconnectorPath, null, StairwellATC, ATCHallR1Floor);
         StairwellATC.setExits(ATCEastHall, null, ObservatoryATC, null);
         ObservatoryATC.setExits(StairwellATC, null, null, null);
         SCandATCconnectorPath.setExits(OutsideScienceCenterFront, ATCHallL1Floor, BusStation,SouthHallwaySC);
         BusStation.setExits(SCandATCconnectorPath, OutsideATC, null, null);
         CourtYard.setExits(CollegeHall, ParkhouseFront, OutsideATCFront, OutsideScienceCenterFront);
			BellTower.setExits(null, CollegeHall, OutsideScienceCenterFront, NorthHallwaySC);
          
         CollegeHall.setExits(AidCenter, CollegeHallBottom, CourtYard, BellTower);
         AidCenter.setExits(null, null, CollegeHall, null);
         CollegeHallBottom.setExits(Tavern, Library, CollegeHall, Arena);
         Arena.setExits(null, CollegeHallBottom, null, null);
         Tavern.setExits(Pavilion, null, CollegeHallBottom, null);
         Pavilion.setExits(null, null, Tavern, null);
         Library.setExits(null, null, CollegeHallBottom, null);
           
         Parkhouse.setExits(HallwayNorth, HallwayEast, HallwaySouth, HallwayWest);
         ParkhouseFront.setExits(null, HallwayWest, ATCandPHconnectorPath, CourtYard);
         HallwayNorth.setExits(ParkhouseLot, NorthClassEast, Parkhouse, NorthClassWest);
         NorthClassEast.setExits(null, null, null, HallwayNorth);
         NorthClassWest.setExits(null, HallwayNorth, null, null);
         ParkhouseLot.setExits(null, null, HallwayNorth, null);
         HallwayEast.setExits(EastClassNorth, EastClassEast, EastClassSouth, Parkhouse);
         EastClassNorth.setExits(null, null, HallwayEast, null);
         EastClassSouth.setExits(HallwayEast, null, null, null);
         EastClassEast.setExits(null, null, null, HallwayEast);
         HallwaySouth.setExits(Parkhouse, SouthClassEast, SouthClassWest, SouthClassSouth);
         SouthClassEast.setExits(null, null, null, HallwaySouth);
         SouthClassWest.setExits(null, HallwaySouth, null, null);
         SouthClassSouth.setExits(HallwaySouth, null, null, null);
         HallwayWest.setExits(WestClassNorth, Parkhouse, WestClassSouth, ParkhouseFront);
         WestClassSouth.setExits(HallwayWest, null, null, null);
        // WestClassWest.setExits(null, HallwayWest, null, null);
          
           
         OutsideScienceCenterFront.setExits(BellTower,CourtYard,SCandATCconnectorPath,InsideScienceCenterMain);
         InsideScienceCenterMain.setExits(NorthHallwaySC, OutsideScienceCenterFront, SouthHallwaySC, AuditoriumSC);
         AuditoriumSC.setExits(null, InsideScienceCenterMain, null, StageSC);
         StageSC.setExits(null, AuditoriumSC, null, null);
         SouthHallwaySC.setExits(InsideScienceCenterMain, SCandATCconnectorPath, null , SmogRoomSC);
         SmogRoomSC.setExits(null, SouthHallwaySC, null, null);
         NorthHallwaySC.setExits(null, BellTower, InsideScienceCenterMain, DentistOfficeSC);
         DentistOfficeSC.setExits(null, NorthHallwaySC, null, null);
      
        
        
        
        //Objects
         Sandwich = new ObjectZork("Sandwich", " A turkey BLT", false, false, InsideATC);
         FullHealth = new ObjectZork("Full Health", " It Restores you to full health", false, false, OutsideATC);
         GoldenKey = new ObjectZork("Golden Key", "A shiny key that looks like it can open a chest", false, false, StageSC);
         GoldenChest = new ObjectZork("Golden Chest", "A shiny locked chest", false, false, BusStation);
		 Sword = new ObjectZork("Sword", "A gleaming sharp blade", false, false, RestroomATC);
		 GoldenTicket = new ObjectZork("Golden Ticket", "A golden ticket (no chocolate filled adventures included)", false, false, Library);
		 LargeShovel = new ObjectZork("Large Shovel/Spoon", "A large spoon which is actualy a shovel.", false, false, NorthClassEast);
		 GasMask = new ObjectZork("Gas Mask", "Looks like you can enter anywhere with toxic fumes.", false, false, StairwellATC);
		 Axe = new ObjectZork("Freds Axe", "An axe given to you by Fred.", false, false, WestClassNorth);
		 BusPassBox = new ObjectZork("Bus Pass Box", "A golden bus pass box", false, false, BusStation);
        //NPC's
         Witch = new NPC("Ugly Witch", " a witch who is less then pretty", false,"You try to strike up a conversation but all she does is cackle at you", "You slap her, then she casts a spell making you lose one health", Pavilion, false);
         Sorcerer = new NPC("Kendall Martin", " a wizard of top notch", false, " as you talk to her you know deep down that she's a wizard of mighty power", "You try to go in for a slap but hit a magical shield losing both your dignity and one health", ObservatoryATC, false);
         JosiahBahl = new NPC("Josiah Bahl", " a game Designer", false, " Hey, how are you doing. I was the one who programmed this game", "You anger Josiah, he will come for you soon enough", InsideATC, false);
         Actors = new NPC("Mad Actors", " Crazy ass crackers in tights", false, " I'l kill you!", "You slap them to death", StageSC, false);
         AidWomen = new NPC("Aid Women", "(non)helpful women", false, " Your expected wait time for help is five hours", "You try to slap them but there seems to be a desk in the way....", AidCenter, false);
         Patrons = new NPC("Tavern Patrons", "Extremly drunk people", false, " you try to talk to them but you can't make out there drunk babble", "You slap one drunkerd which leads to a full on bar fight, after which you wake up without an eye.", Tavern, false);
         Bard = new NPC("Bad Bard", "A less then musicly inclined musician", false, " he tells you that gold can only open gold (damn poets)", " you slap him which gives him insperation for another song.", Parkhouse, false);
         Professor = new NPC("Nutty Professor", "A potion brewer", false, " he lists off a bunch of ingreidents for making pies.", " you slap him which makes him angry, he splash's you with a potion that turns you rainbow colored", NorthClassEast, false);
         Vampires = new NPC("Vampires", " A herd of Vampires(need I say more)", false, " They say real men don't sparkle.", " you slap them to no effect, in anger they suck your blood!", EastClassSouth, false);
         Fairys = new NPC("Fairys", " they are only real if you believe", false, " they speak a unknown dialact you can only make out the words rainbow and sprinkles.", " you slap one making it explode in a shower of blood, the rest run away in fear of your murderous ways.", SouthClassWest, false);
         Fred = new NPC("Fred The Monster", " much better then Fred the movie star.", false, " he speaks of his grand adventures fighting armies off with only two whole cows", " you grow to respect fred to much to slap him.", WestClassNorth, false);
         Dentists = new NPC("Dentists", " less the a doctor more then a nurse.", false, " You notice all they do is look at your teeth while you're talking, which creeps you out.", " you slap one but the rest restrain you before you can flee, they forcibly put braces on your teeth.", DentistOfficeSC, false);
         OldProfessor = new NPC("Crazy Old Professor", " PH.D in pain!", false, " you try to talk to him but he is worlds ahead of you in what he is saying.", " you slap him only for him to spew out equations makingit mathomaticly correct that you don't exist.", ClassroomATC, false);
         Goblin = new NPC("Mad Goblin", " A green shit storm of rage!", false," he seems to angry too talk to.", " you try slapping him but it doesn't work he just shivs you, you need a stronger weapon if you're going to kill him.", EastClassNorth, false);
        //Player
         player1 = new Player();
        //Starts you at the begining room.
         currentRoom = OutsideATC;
	}
    /**
     * Print out the opening message for the player,
     * also prints out the starting room description.
     */
    public void printWelcome()
    {
        System.out.print("Welcome to Zork for MONTCO! " + "\n"); 
        System.out.print("Type 'help' if you need help, this will list some common commands. " + "\n");
        System.out.print("You awake with a headache only to find");
        System.out.print(currentRoom.longDescription() + "\n");
        player1.inventory.addItem(FullHealth, OutsideATC);
    }
    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play() 
    {            
       printWelcome();
        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.
        boolean finished = false;
        while (! finished)
        {
            if(player1.getHealth() <= 0)
            {
            	finished = true;
            }
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye. ");
    }
    /**
     * Takes the first word of the command to see if it is a known command,
     * if it is then it goes through and if/else statment to see what method calls for it.
     */
    private boolean processCommand(Command command) 
    {
        if(command.isUnknown())
        {
            System.out.println("I don't know what you mean... ");
            return false;
        }
        //String for the first command word
        String commandWord = command.getCommandWord();
        //if/else statemnet for commands and the methods for them.
        if(commandWord.equals("help"))
        {
        	printHelp();
        }
        else if(commandWord.equals("inventory"))
        {
        	System.out.println(player1.inventory.inventoryList());
        }
        else if(commandWord.equals("go"))
        {
        	Room(command);
        }
        
        else if (commandWord.equals("slap"))
        {
        	Slap(command);
        }
        else if (commandWord.equals("talk"))
        {
        	Talk(command);
        }
        else if(commandWord.equals("look"))
        {
        	lookCloser(command);
        }
        else if(commandWord.equals("take"))
        {
        	takeItem(command);
        }
        else if(commandWord.equals("drop"))
        {
        	dropItem(command);
        }
        else if(commandWord.equals("use"))
        {
        	useItem(command);
        }
        else if(commandWord.equals("health"))
        {
        	player1.showHealth();
        }
        else if(commandWord.equals("quit"))
        {
            if(command.hasSecondWord()) {
                System.out.println("Quit what?");
            }
            else {
                return true;
            }
        }
        return false;
    }
    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the 
     * command words.
     */
    private void printHelp() 
    {
        System.out.println("Your command words are:");
        System.out.println(parser.showCommands());
    }

    /** 
     * Try to go to one direction. If there is an exit, enter the new
     * room, otherwise print an error message.
     */
    public void Room(Command command) 
    {
        if(!command.hasSecondWord())
        {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = currentRoom.nextRoom(direction);

        if (nextRoom == null) {
            System.out.println("There is no exit!");
        }
        else   
        {
            currentRoom = nextRoom;
            System.out.println(currentRoom.longDescription());
        }       
        //Checks the currentRoom for NPC movement, if an NPC can move into the room it will display text.
        movementNPC(currentRoom);
        changelingRooms(currentRoom);
    }
    /**
     * Allows player to slap objects in the form 'slap (object name)' then prints out text based on the object name.
     * @param command 
     */
    public void Slap(Command command)
        {
            if(!command.hasSecondWord())
            {
                System.out.println("Slap What?");
                return;
            }
            //String for the second command word
			String itemName = command.getSecondWord();
            if(itemName.toLowerCase().equals("sandwich"))
            {
            	Sandwich.slapObject(Sandwich);
            }
            else if(itemName.toLowerCase().equals("josiah"))
            {
            	JosiahBahl.slapNPC(currentRoom, player1);
            }
            else if(itemName.toLowerCase().equals("kendall"))
            {
            	Sorcerer.slapNPC(currentRoom, player1);
            }
            else if(itemName.toLowerCase().equals("actors"))
            {
            	Actors.slapNPC(currentRoom, player1);
            }
            else if(itemName.toLowerCase().equals("witch"))
            {
            	Witch.slapNPC(currentRoom, player1);
            }
            else if(itemName.toLowerCase().equals("fred"))
            {
            	Fred.slapNPC(currentRoom, player1);
            }
            else if(itemName.toLowerCase().equals("women"))
            {
            	AidWomen.slapNPC(currentRoom, player1);
            }
            else if(itemName.toLowerCase().equals("patrons"))
            {
            	Patrons.slapNPC(currentRoom, player1);
            }
            else if(itemName.toLowerCase().equals("bard"))
            {
            	Bard.slapNPC(currentRoom, player1);
            }
            else if(itemName.toLowerCase().equals("nuttyprofessor"))
            {
            	Professor.slapNPC(currentRoom, player1);
            }
            else if(itemName.toLowerCase().equals("vampires"))
            {
            	Vampires.slapNPC(currentRoom, player1);
            }
            else if(itemName.toLowerCase().equals("fairys"))
            {
            	Fairys.slapNPC(currentRoom, player1);
            }
            else if(itemName.toLowerCase().equals("dentists"))
            {
            	Dentists.slapNPC(currentRoom, player1);
            }
            else if(itemName.toLowerCase().equals("oldprofessor"))
            {
            	OldProfessor.slapNPC(currentRoom, player1);
            }
            else if(itemName.toLowerCase().equals("goblin"))
            {
            	Goblin.slapNPC(currentRoom, player1);
            }
            else
            {
            	System.out.println("You cant slap a " + itemName);
            }
        }
    /**
     * Allows player to talk to NPC in the format 'talk (NPC first name)'
     * Sends the NPC and current room to the talk method in the NPC class.
     * @param command 
     */
    public void Talk(Command command)
    {
                    if(!command.hasSecondWord())
            {
                // if there is no second word, we don't know where to go...
                System.out.println("Talk to who?");
                return;
            }
            //String for second command word.
            String NPCName = command.getSecondWord();
            //
            if(NPCName.toLowerCase().equals("josiah"))
            {
            	JosiahBahl.Talk(currentRoom);
            }
            else if(NPCName.toLowerCase().equals("kendall"))
            {
            	Sorcerer.Talk(currentRoom);
            }
            else if(NPCName.toLowerCase().equals("actors"))
            {
            	Actors.Talk(currentRoom);
            }
            else if(NPCName.toLowerCase().equals("witch"))
            {
            	Witch.Talk(currentRoom);
            }
            else if(NPCName.toLowerCase().equals("fred"))
            {
            	Fred.Talk(currentRoom);
            }
            else if(NPCName.toLowerCase().equals("women"))
            {
            	AidWomen.Talk(currentRoom);
            }
            else if(NPCName.toLowerCase().equals("patrons"))
            {
            	Patrons.Talk(currentRoom);
            }
            else if(NPCName.toLowerCase().equals("bard"))
            {
            	Bard.Talk(currentRoom);
            }
            else if(NPCName.toLowerCase().equals("nuttyprofessor"))
            {
            	Professor.Talk(currentRoom);
            }
            else if(NPCName.toLowerCase().equals("vampires"))
            {
            	Vampires.Talk(currentRoom);
            }
            else if(NPCName.toLowerCase().equals("fairys"))
            {
            	Fairys.Talk(currentRoom);
            }
            else if(NPCName.toLowerCase().equals("dentists"))
            {
            	Dentists.Talk(currentRoom);
            }
            else if(NPCName.toLowerCase().equals("oldprofessor"))
            {
            	OldProfessor.Talk(currentRoom);
            }
            else if(NPCName.toLowerCase().equals("goblin"))
            {
            	Goblin.Talk(currentRoom);
            }
            else
            {
            	System.out.println("You cant talk to that person.");
            }
    }
   /**
    * Method for looking around the room,
	*sends the current room to the looking method in the Room class.
    * @param command
    */
    public void lookCloser(Command command)
    {
    	if(!command.hasSecondWord())
    	{
    		System.out.println("Look at what?");
    		return;
    	}
    	//String for second command word
    	String secondWord = command.getSecondWord();
    	//Checks to see if the second command is acceptable.
    	if(secondWord.toLowerCase().equals("around") || secondWord.toLowerCase().equals("closer"))
    	{
    		currentRoom.looking(currentRoom);
    	}
    	else
    	{
    		System.out.println("You cant look at that!");
    	}

    }
    /**
     * Method for taking items,
     * sends in the item you wish to pick up and the current room.
     * @param command
     */
    public void takeItem(Command command)
    {
        if(!command.hasSecondWord())
        {
            System.out.println("Take what?");
            return;
        }
        //String for second command word.
        String itemName = command.getSecondWord();

        /**
         *Checks to see if the item you want to pick up is and item you can.
         *if it is then it sends the item along with the current room into the addItem method in the Inventory class.
        */
        if(itemName.toLowerCase().equals("sandwich"))
        {
        	player1.inventory.addItem(Sandwich, currentRoom);
        }
        else if(itemName.toLowerCase().equals("fullHealth"))
        {
        	player1.inventory.addItem(FullHealth, currentRoom);
        }
        else if(itemName.toLowerCase().equals("goldenkey"))
        {
        	player1.inventory.addItem(GoldenKey, currentRoom);
        }
        else if(itemName.toLowerCase().equals("sword"))
        {
        	player1.inventory.addItem(Sword, currentRoom);
        }
        else if(itemName.toLowerCase().equals("goldenticket"))
        {
        	player1.inventory.addItem(GoldenTicket, currentRoom);
        }
        else if(itemName.toLowerCase().equals("axe"))
        {
        	player1.inventory.addItem(Axe, currentRoom);
        }
        else if(itemName.toLowerCase().equals("gasmask"))
        {
        	player1.inventory.addItem(GasMask, currentRoom);
        }
        else if(itemName.toLowerCase().equals("largeshovel"))
        {
        	player1.inventory.addItem(LargeShovel, currentRoom);
        }
        else
        {
        	System.out.println("You cannot pick up or take a " + itemName);
        }
    }
    /**
     * Method for dropping items, takes the first word to see if it is drop.
     * then takes the second to see what item you want to drop.
     * @param command
     */
    public void dropItem(Command command) {
		
        if(!command.hasSecondWord())
        {
            System.out.println("Drop what?");
            return;
        }
        //Second command word
        String itemName = command.getSecondWord();
        /**
         *Checks to see if the item you wish to drop is even an item,
         *if it is then it sends the item into the drop item method in the inventory class.
         */
        if(itemName.toLowerCase().equals("sandwich"))
        {
        	player1.inventory.dropItem(Sandwich);
        }
        else if(itemName.toLowerCase().equals("fullhealth"))
        {
        	player1.inventory.dropItem(FullHealth);
        }
        else if(itemName.toLowerCase().equals("goldenkey"))
        {
        	player1.inventory.dropItem(GoldenKey);
        }
        else if(itemName.toLowerCase().equals("sword"))
        {
        	player1.inventory.dropItem(Sword);
        }
        else if(itemName.toLowerCase().equals("goldenticket"))
        {
        	player1.inventory.dropItem(GoldenTicket);
        }
        else if(itemName.toLowerCase().equals("axe"))
        {
        	player1.inventory.dropItem(Axe);
        }
        else if(itemName.toLowerCase().equals("gasmask"))
        {
        	player1.inventory.dropItem(GasMask);
        }
        else if(itemName.toLowerCase().equals("largeshovel"))
        {
        	player1.inventory.dropItem(LargeShovel);
        }
        else
        {
        	System.out.println("You cant drop a " + itemName);
        }
	}
    
    public void useItem(Command command)
    {
        if(!command.hasSecondWord())
        {
            System.out.println("Drop what?");
            return;
        }
        //Second command word
        String itemName = command.getSecondWord();
        
        if(itemName.toLowerCase().equals("sandwich") && Sandwich.getPickedUp() == true)
        {
        	player1.inventory.Use(Sandwich, player1);
        }
        else if(itemName.toLowerCase().equals("fullhealth")&& FullHealth.getPickedUp() == true)
        {
        	player1.inventory.Use(FullHealth, player1);
        }
        else if(itemName.toLowerCase().equals("goldenkey") && GoldenKey.getPickedUp() == true)
        {
        	player1.inventory.useComboItem(GoldenKey, GoldenChest, null, currentRoom, player1);
        }
        else if(itemName.toLowerCase().equals("sword") && Sword.getPickedUp() == true)
        {
        	player1.inventory.useComboItem(Sword, null, Goblin, currentRoom, player1);
        }
        else if(itemName.toLowerCase().equals("goldenticket") && GoldenTicket.getPickedUp() == true)
        {
        	player1.inventory.useComboItem(GoldenKey, BusPassBox, null, currentRoom, player1);
        }
        else if(itemName.toLowerCase().equals("axe") && Axe.getPickedUp() == true)
        {
        	player1.inventory.useComboItem(Axe, null, Goblin, currentRoom, player1);
        }
        else if(itemName.toLowerCase().equals("gasmask") && GasMask.getPickedUp() == true)
        {
        	player1.inventory.Use(GasMask, player1);
        	SmogRoomSC.setChangeRoom(true);
        }
        else if(itemName.toLowerCase().equals("largeshovel") && LargeShovel.getPickedUp() == true)
        {
        	player1.inventory.Use(LargeShovel, player1);
        }
        else
        {
        	System.out.println("You cant use " + itemName + "because you don't have that item in your inventory");
        }
    }
    /**
     * For NPC movement, checks to see what the current room is, then prints out a NPC description if it is the right room.
     * Also checks to see if you were in the room before hand,
     * if you were it displays a different text for the NPC
     * @param room 
     */
    public void movementNPC(Room room)
    {
        if(room.roomEquals(InsideATC))
        {
            if(JosiahBahl.getMet() == false)
            {
                 System.out.println(JosiahBahl.toString());
                 JosiahBahl.setMet(true);
            }
            else if(JosiahBahl.getMet() == true)
            {
                System.out.println("There is Josiah Bahl the Game Design Student in this room.");
            }
        }
        else if(room.roomEquals(ObservatoryATC))
        {
        	if(Sorcerer.getMet() == false)
        	{
        		System.out.println(Sorcerer.toString());
        		Sorcerer.setMet(true);
        	}
        	else if(Sorcerer.getMet() == true)
        	{
        		System.out.println("There is Kendall Martin the Sorcerer in this room");
        	}
        }
        else if(room.roomEquals(Pavilion))
        {
        	if(Witch.getMet() == false)
        	{
        		System.out.println(Witch.toString());
        	}
        	else if(Witch.getMet() == true)
        	{
        		System.out.println("There is a Witch in this room");
        	}
        }
        else if(room.roomEquals(StageSC))
        {
        	if(Actors.getMet() == false)
        	{
        		System.out.println(Actors.toString());
        	}
        	else if(Actors.getMet() == true)
        	{
        		System.out.println("There are Mad Actors in here");
        	}
        }
        else if(room.roomEquals(AidCenter))
        {
        	if(AidWomen.getMet()== false)
        	{
        		System.out.println(AidWomen.toString());
        	}
        	else
        	{
        		System.out.println("There are the Aid Women in here");
        	}
        }
        else if(room.roomEquals(Tavern))
        {
        	if(Patrons.getMet()== false)
        	{
        		System.out.println(Patrons.toString());
        	}
        	else
        	{
        		System.out.println("There are the Tavern Patrons in here");
        	}
        }
        else if(room.roomEquals(Parkhouse))
        {
        	if(Bard.getMet()== false)
        	{
        		System.out.println(Bard.toString());
        	}
        	else
        	{
        		System.out.println("There is a bard in here");
        	}
        }
        else if(room.roomEquals(NorthClassEast))
        {
        	if(Professor.getMet()== false)
        	{
        		System.out.println(Professor.toString());
        	}
        	else
        	{
        		System.out.println("There is a Nutty Professor in here");
        	}
        }
        else if(room.roomEquals(EastClassSouth))
        {
        	if(Vampires.getMet()== false)
        	{
        		System.out.println(Vampires.toString());
        	}
        	else
        	{
        		System.out.println("There are vampires in here");
        	}
        }
        else if(room.roomEquals(SouthClassWest))
        {
        	if(Fairys.getMet()== false)
        	{
        		System.out.println(Fairys.toString());
        	}
        	else
        	{
        		System.out.println("There are Fairys in here");
        	}
        }
        else if(room.roomEquals(WestClassNorth))
        {
        	if(Fred.getMet()== false)
        	{
        		System.out.println(Fred.toString());
        	}
        	else
        	{
        		System.out.println("Fred is in here");
        	}
        }
        else if(room.roomEquals(DentistOfficeSC))
        {
        	if(Dentists.getMet()== false)
        	{
        		System.out.println(Dentists.toString());
        	}
        	else
        	{
        		System.out.println("There are dentists in here");
        	}
        }
        else if(room.roomEquals(ClassroomATC))
        {
        	if(OldProfessor.getMet()== false)
        	{
        		System.out.println(OldProfessor.toString());
        	}
        	else
        	{
        		System.out.println("There is a crazy old professor in here");
        	}
        }
        else if(room.roomEquals(EastClassNorth))
        {
        	if(Goblin.getMet()== false)
        	{
        		System.out.println(Goblin.toString());
        	}
        	else
        	{
        		System.out.println("There is an angry goblin in this room");
        	}
        }
        else
        {   
        } 
    }
    /**
     * Method for when the rooms change depending on what you do in the game.
     * @param room
     */
    public void changelingRooms(Room room)
    {
    if(room.roomEquals(StageSC) && room.getChangeRoom()==true)
    {
    	System.out.println("The stage is littered with blood, gore and dead actors. There doesn't apear to be anything else.");
    }
    else if(room.roomEquals(EastClassNorth) && room.getChangeRoom()==true)
    {
    	System.out.println("There is the dead body of the goblin, nothing else but that...");
    }
    else if(room.roomEquals(SmogRoomSC) && room.getChangeRoom()==true)
    {
    	System.out.println("You can now breath in this room, but you still can't find anything......");
    }
    else 
    {	
    }
    }
	/**
	 * @return the currentRoom
	 */
	public Room getCurrentRoom() {
		return currentRoom;
	}
	/**
	 * @param currentRoom the currentRoom to set
	 */
	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
	/**
	 * main method for playing the game,
	 * makes a new GameWorld then calls the play method to play the game.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		GameWorld newGame = new GameWorld();
		newGame.play();
	}
}
