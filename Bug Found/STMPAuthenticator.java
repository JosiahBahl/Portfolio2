import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class STMPAuthenticator extends Authenticator
{
	private String _username;
	private String _password;
	
	public STMPAuthenticator (String username, String password)
	{
	   super();
	   _username = username;
	   _password = password;
	}
	
	public PasswordAuthentication getPasswordAuthentication()
	{
	   return new PasswordAuthentication(_username, _password);
	}
}
