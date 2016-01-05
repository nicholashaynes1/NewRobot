package bot.controller;

import lejos.hardware.lcd.LCD;
import lejos.utility.Delay;

import bot.model.*;

public class RobotController
{
	
	private EV3Bot nickBot;
	
	public void start()
	{
		nickBot.driveRoom();
	}
	
	public RobotController()
	{
		
		nickBot = new EV3Bot();
	}
	
	
	
}
