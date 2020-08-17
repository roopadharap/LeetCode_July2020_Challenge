public double angleClock(int hour, int minutes) 
{
	//1 hr = 360 / 12 = 30 deg
	//1 min = 360 / 60 = 6 deg
	//hr hand rotate for 1 min = 30 / 60 (mins in 1 hr) = 0.5
	
	double handAngle; 
	handAngle = Math.abs((30.0 * hour) + (0.5 * minutes) - (6 * minutes));
						 
	if(handAngle <= 180.0)
		return handAngle;
	else
		return 360 - handAngle;
								
}