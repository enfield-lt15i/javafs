import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class LetsGoJava {
	public static void main(String[] args) {
		//퇴근
		
		String id = JOptionPane.showInputDialog("Write your address");
		String bright = JOptionPane.showInputDialog("Enter brightness level");
		
		//Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		//Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		//Light on (ctrl + space -> package path)
		Lighting hallLamp = new Lighting (id+" / Hall Lamp");
		hallLamp.on();
		
		DimmingLights moodLamp = new DimmingLights (id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
	}

}
