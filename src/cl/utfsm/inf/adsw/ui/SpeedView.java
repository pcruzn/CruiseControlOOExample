package cl.utfsm.inf.adsw.ui;

public class SpeedView {
	public static void showSpeedAlert (int currentSpeed) {
		System.out.println ("Speed under minimum: " + currentSpeed);
	}
	
	public static void showABSAlert (boolean ABSStatus) {
		System.out.println ("ABS not working: " + ABSStatus);
	}

	public static void showCruiseControlActivatedAlert (int currentSpeed) {
		System.out.println ("Cruise control enabled: " + currentSpeed);
	}
	
}
