package org.oastem.frc.sensor;

import edu.wpi.first.wpilibj.AnalogInput;

//A: looks like some kind of voltage to length conversion? Unsure of what the sensor is sensing, but I'm guessing voltage
public class LVMaxSonarEZUltrasonic {
	AnalogInput ultra;
	
	private final double MILLIVOLTS_TO_INCH_CONVERSION = 5000/512; //(Vcc/inch)
	
	public LVMaxSonarEZUltrasonic (int port){
        ultra = new AnalogInput(port);
        
    }
	
	public double getDistance(){
		return ultra.getVoltage()*1000/MILLIVOLTS_TO_INCH_CONVERSION;
	}
	
	public double getVoltage(){
		return ultra.getVoltage()*1000;
	}
	
}
