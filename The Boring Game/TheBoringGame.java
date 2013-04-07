import java.util.Scanner;

public class TheBoringGame 
{
	//Class varibles
	private int _nPlayers;
	private PlayerNode _head = null;
	private Scanner _newScanner = new Scanner(System.in);
	
	//Constructor
	public TheBoringGame()
	{
		System.out.print(rules());
		System.out.println("Enter number of players: ");
		_nPlayers = _newScanner.nextInt();
		
		for(int i = 0; i < _nPlayers; i++)
		{
			System.out.println("Enter player name for player");
			String name = _newScanner.next();
			_head = new PlayerNode(name, _head);
		}
		startGame();
	}
	
	// Starts the main game loop, only ends once the loop goes five times.
	public void startGame()
	{	
		int turn = 0;
		int winner = _head.getWins();
		String command;
		String winningPlayer = _head.getName();
		PlayerNode restartHead = _head;
		PlayerNode cursor;
		
		while(turn != 5)
		{
			System.out.println("What would player " + _head.getName() + " like to do?");
			command = _newScanner.next();
			if(command.equalsIgnoreCase("guess"))
			{
				playerGuess(_head);
			}
			else if(command.equalsIgnoreCase("leave"))
			{
				restartHead = playerLeave(_head, restartHead);
			}
			else if(command.equalsIgnoreCase("join"))
			{
				playerJoin(_head);
			}
			else
			{
				System.out.println("Invalid command.");
			}
			
			if(_head.getLink() == null)
			{
				turn++;
				_head = restartHead;
			}
			else
			{
				_head = _head.getLink();
			}
		}
		
		//After five turns are up find the winner.
		for(cursor = _head; cursor != null; cursor = cursor.getLink())
		{
			if(winner<cursor.getWins())
			{
				winner = cursor.getWins();
				winningPlayer = cursor.getName();
			}
		}
		
		if(winner == 0)
		{
			System.out.println("There is no winner this game.");
		}
		else
		{
			System.out.println("Winning Player: " + winningPlayer + "Score: " + winner);
		}
	}
	
	//Rules of the game.
	public String rules()
	{
		return "Welcome to The Boring Game." + "\n" +
		"Each player will get one chance to guess a number between 1-100" + "\n" +
		"If they guess correct they win if not the next player gets to go." + "\n" +
		"Each player can also chose to leave the game or let a player join the game." + "\n" +
		"Doing so will take up your turn." + "\n" +
		"Type guess to guess, leave to leave and join to let a player join." + "\n";
	}
	
	/** 
	 *Lets the player guess at a random number, if the guess is correct they win and it goes back to the main game loop,
	 *If the guess is incorrect it goes back to the main game loop.
	 *@param head
	 */
	public void playerGuess(PlayerNode head)
	{
		double random = Math.random();
		double x = random*100;
		int guess;
		int number = (int)x+1;
		
		System.out.println(head.getName() + " enter your guess");
		guess = _newScanner.nextInt();
		
		if(guess == number)
		{
			head.setWins(head.getWins()+1);
			System.out.println("Player " + head.getName() + " has guessed correct");
		}
		else
		{
			System.out.println("Incorrect guess");
		}
	}
	
	/**
	 * Checks to see if _head is equals to the player,
	 * If so then _head is equals to the link the player has,
	 * Gives back the new restartedHead so whent he game restarts it does not re-add the deleated player.
	 * @param head
	 * @param restartHead
	 * @return
	 */
	public PlayerNode playerLeave(PlayerNode head, PlayerNode restartHead)
	{
		PlayerNode cursor;
		for(cursor = _head; cursor != null; cursor = cursor.getLink())
		{
			if(_head == head)
			{
				_head = head.getLink();
				restartHead = _head;
			}
		}
		return restartHead;
	}
	
	// Allows a player to be added after the current player.
	public void playerJoin(PlayerNode player)
	{
		System.out.println("Enter new player name");
		String newPlayer = _newScanner.next();
		player.addNodeAfter(newPlayer);
	}
	
	public static void main(String[] args)
	{
		TheBoringGame newGame = new TheBoringGame();
	}
}