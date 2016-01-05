package bot.model;

import lejos.hardware.lcd.LCD;
import lejos.robotics.navigation.MovePilot;
import lejos.utility.Delay;

public class EV3Bot
{
	private String botMessage;
	private int xPos, yPos;
	private long waitTime;
	
	
	private MovePilot botPilot;
	
	
	public EV3Bot()
	{
		this.botMessage = "Nick codes NickBot";
		this.xPos = 50;
		this.yPos = 50;
		this.waitTime = 4000;
		
		displayMessage();
	}
	
	private void setupPilot()
	{
		
	}
	
	public void driveRoom()
	{
		displayMessage("driveRoom");
	}
	
	

	private void displayMessage()
	{
		LCD.drawString(botMessage,xPos, yPos);
		Delay.msDelay(waitTime);
	}
	
	private void displayMessage(String message)
	{
		LCD.drawString(message, xPos, yPos);
		Delay.msDelay(waitTime);
	}
	






}
