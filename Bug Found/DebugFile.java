import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DebugFile 
{
	private String _to = " ";
	private String _from = " ";
	private String _host = " ";
	private String _password = " ";
	private String _message = " ";
	private String _subject = " ";
	private int _port = 587;
	private String _portName = "587";
	
	public DebugFile(){};
	
	public void sendEmail() throws AddressException, MessagingException
	{
		//Properties.
		Properties properties = System.getProperties(); 
		properties.setProperty("mail.smtp.host", _host);
	    properties.setProperty("mail.smtp.user", _from);
	    properties.setProperty("mail.smtp.password", _password);
	    properties.setProperty("mail.smtp.port", _portName);
	    properties.setProperty("mail.smtp.auth", "true");
	    properties.setProperty("mail.smtp.starttls.enable", "true");
	    
	    //Password and Username Authentication
	    STMPAuthenticator auth = new STMPAuthenticator(_from,_password); 
		
	    //Session
	    Session session = Session.getDefaultInstance(properties, auth);
		
	    //Message
        MimeMessage message = new MimeMessage(session);
        //Header
        message.setFrom(new InternetAddress(_from));
        //E-mail reciver.
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(_to));
        //Subject
        message.setSubject(_subject);
        //Body
        message.setText(_message);
        
        //Sending Message
        Transport transport = session.getTransport("smtp");
        transport.connect (_host, _port, _to, _password);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
	}
	
	public void createGUI()
	{
		//Query String
		String programBug = "Program Bug";
		String artBug =  "Art Problem";
		String otherBug = "Other";
		String sugestions = "Sugestions";
		
		//Frame
		JFrame frame = new JFrame();
		frame.setTitle("Bug Find");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Buttons
		final JButton send = new JButton("    ");
		
		//Labels
		JLabel usernameLabel = new JLabel("E-mail: ");
		JLabel passwordLabel = new JLabel("Password: ");
		JLabel dateLabel = new JLabel("Date: ");
		
		//Layouts
		JPanel layout = new JPanel();
		layout.setLayout(new BorderLayout());
		JPanel textFields = new JPanel();
		textFields.setLayout(new GridLayout(3,3));
		JPanel radioSelect = new JPanel();
		radioSelect.setLayout(new GridLayout(3,3));
		JPanel checkSend = new JPanel();
		checkSend.setLayout(new BorderLayout());
		
		//Username Field
		final JTextField	username = new JTextField(10);
		
		//Password Field
		final JPasswordField password = new JPasswordField(10);
		
		//Date
		final JFormattedTextField date = new JFormattedTextField(java.util.Calendar.getInstance().getTime());
		
		//Radio Buttons
		final JRadioButton programming = new JRadioButton(programBug);
		programming.setActionCommand("jobahl@epix.net");
		programming.setMnemonic(KeyEvent.VK_P);
		final JRadioButton art = new JRadioButton(artBug);
		art.setActionCommand("jobahl@epix.net");
		art.setMnemonic(KeyEvent.VK_A);
		final JRadioButton other = new JRadioButton(otherBug);
		other.setActionCommand("jobahl@epix.net");
		other.setMnemonic(KeyEvent.VK_O);
		final JRadioButton sugest = new JRadioButton(sugestions);
		sugest.setActionCommand("jobahl@epix.net");
		sugest.setMnemonic(KeyEvent.VK_S);
		
		//Group
		ButtonGroup group = new ButtonGroup();
        group.add(programming);
        group.add(art);
        group.add(other);
        group.add(sugest);
        
		//Message TextArea
		final JTextArea message = new JTextArea(10,10);
		
		//Scrollbar
		JScrollPane scrollBar = new JScrollPane(message);
		
		//Checkbox
		String[] emailHost = {"GMail", "HotMail", "Yahoo", "Frontier/Epix"};
		final JComboBox  checkBox = new JComboBox(emailHost);
		checkBox.setSelectedIndex(3);
		
		//Put Everything Together
		textFields.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("E-mail, Password"),BorderFactory.createEmptyBorder(5,5,5,5)));
		textFields.add(usernameLabel);
        textFields.add(username);
        textFields.add(passwordLabel);
        textFields.add(password);
        textFields.add(dateLabel);
        textFields.add(date);
        radioSelect.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Select Bug"),BorderFactory.createEmptyBorder(5,5,5,5)));
        radioSelect.add(programming);
        radioSelect.add(art);
        radioSelect.add(other);
        radioSelect.add(sugest);
        scrollBar.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Bug Description"),BorderFactory.createEmptyBorder(5,5,5,5)));
        checkBox.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Select Email Host"),BorderFactory.createEmptyBorder(5,5,5,5)));
        send.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Send"),BorderFactory.createEmptyBorder(5,5,5,5)));
        checkSend.add(send, BorderLayout.SOUTH);
        checkSend.add(checkBox, BorderLayout.NORTH);
        layout.add(radioSelect, BorderLayout.EAST);
		layout.add(textFields, BorderLayout.PAGE_START);
		layout.add(scrollBar, BorderLayout.SOUTH);
		layout.add(checkSend, BorderLayout.WEST);
		frame.add(layout);
		frame.pack();
		frame.setVisible(true);
		
		class ClickListener implements ActionListener
		{
			// Actions for clicking buttons from Button GridLayout.
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent event)
			{
				if(event.getSource() == programming)
				{
					_to = "jobahl@epix.net";
					_subject = "Programming Bug";
				}
				else if(event.getSource() == art)
				{
					_to = "jobahl@epix.net";
					_subject = "Art/Graphic Bug";
				}
				else if(event.getSource() == other)
				{
					_to = "jobahl@epix.net";
					_subject = "Non-specified Bug";
				}
				else if(event.getSource() == sugest)
				{
					_to = "jobahl@epix.net";
					_subject = "Sugestion For Game";
				}
				else if(event.getSource() == checkBox)
				{
					if(checkBox.getSelectedIndex() == 0)
					{
						_host = "smtp.gmail.com";
						_port = 587;
						_portName = "587";
					}
					else if(checkBox.getSelectedIndex() == 1)
					{
						_host = "smpt.live.com";
						_port = 25;
						_portName = "25";
					}
					else if(checkBox.getSelectedIndex() == 2)
					{
						_host = "smtp.mail.yahoo.com";
						_port = 465;
						_portName = "465";
					}
					else if(checkBox.getSelectedIndex() == 3)
					{
						_host = "smtp.frontier.com";
						_port = 25;
						_portName = "25";
					}
				}
				else if(event.getSource() == send)
				{
					_from = username.getText();
					_password = password.getText();
					_message = (message.getText() + "\n" + date.getText());
					try 
					{
						sendEmail();
						System.exit(0);
					} catch (AddressException e) 
					{
						message.append("Unknown e-mail Adress");
					} catch (MessagingException e) 
					{
						message.append("E-mail Host not aplicable");
					}
				}
			}
		}
		//Create Listener
		ActionListener listener = new ClickListener();
		
		//Add Listener
		send.addActionListener(listener);
		programming.addActionListener(listener);
		art.addActionListener(listener);
		other.addActionListener(listener);
		sugest.addActionListener(listener);
		checkBox.addActionListener(listener);
	}

	/**
	 * @return the _to
	 */
	public String getTo() 
	{
		return _to;
	}

	/**
	 * @param _to the _to to set
	 */
	public void setTo(String to) 
	{
		_to = to;
	}

	/**
	 * @return the _from
	 */
	public String getFrom() 
	{
		return _from;
	}

	/**
	 * @param _from the _from to set
	 */
	public void setFrom(String from) 
	{
		_from = from;
	}

	/**
	 * @return the _host
	 */
	public String getHost() 
	{
		return _host;
	}

	/**
	 * @param _host the _host to set
	 */
	public void setHost(String host) 
	{
		_host = host;
	}

	/**
	 * @return the _password
	 */
	public String getPassword() 
	{
		return _password;
	}

	/**
	 * @param _password the _password to set
	 */
	public void setPassword(String password) 
	{
		_password = password;
	}

	/**
	 * @return the _message
	 */
	public String getMessage() 
	{
		return _message;
	}

	/**
	 * @param _message the _message to set
	 */
	public void setmessage(String message) 
	{
		_message = message;
	}

	/**
	 * @return the _subject
	 */
	public String getsubject() 
	{
		return _subject;
	}

	/**
	 * @param _subject the _subject to set
	 */
	public void setsubject(String subject) 
	{
		_subject = subject;
	}

	/**
	 * @return the _port
	 */
	public int getPort() 
	{
		return _port;
	}

	/**
	 * @param _port the _port to set
	 */
	public void setPort(int port) 
	{
		_port = port;
	}
	
	//Main
	public static void main(String[] args) throws AddressException, MessagingException
	{
		DebugFile start = new DebugFile();		
		start.createGUI();
	}
}
