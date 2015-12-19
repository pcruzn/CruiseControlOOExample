package cl.utfsm.inf.adsw.ecu;

public class SpeedModule {
	// current speed to be returned by speed module
	private static int currentSpeed = 59;
	
	public static int getCurrentSpeed() {
		return currentSpeed;
	}
	
	public static void setSpeed(int currentSpeed) {
		// setting current speed as the new speed to be controlled
	}
}
