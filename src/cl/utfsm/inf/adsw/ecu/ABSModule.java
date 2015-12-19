package cl.utfsm.inf.adsw.ecu;

public class ABSModule {
	// ABS status to be returned by the ABS module
	// true = ABS OK
	// false = ABS not working
	private static boolean ABSStatus = true;
	
	public static boolean getABSStatus() {
		return ABSStatus;
	}

}
