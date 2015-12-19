package cl.utfsm.inf.adsw.ecu;

import cl.utfsm.inf.adsw.ui.SpeedView;

public class CruiseControlModule {
	
	public static boolean activateCruiseControl() {
		// if speed is less than 60 km/h, cruise control cannot be activated
		if (SpeedModule.getCurrentSpeed() < 60) {
			SpeedView.showSpeedAlert(SpeedModule.getCurrentSpeed());
			
			// cruise control not activated
			return false;
		} else {
			// if any problem is detected in the ABS 'system', cruise control cannot
			// be activated
			if (!ABSModule.getABSStatus()) {
				SpeedView.showABSAlert(ABSModule.getABSStatus());
				
				// cruise control not activated
				return false;
			} else {
				// if speed >= 60 km/h and ABS is OK, cruise control is activated!
				SpeedModule.setSpeed(SpeedModule.getCurrentSpeed());	
				SpeedView.showCruiseControlActivatedAlert(SpeedModule.getCurrentSpeed());
				
				// ok! cruise control activated
				return true;
			}
		}	
	}
}
