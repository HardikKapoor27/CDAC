package smartHome;

public class LightBulb {
	
	private boolean isOn;

	public void toggle() {
		isOn = !isOn;

		if(isOn) {
			System.out.println("Room Light Status: ON");
		} else {
			System.out.println("Room Light Status: OFF");
		}
	}

	public void turnOn() {
		isOn = true;
		System.out.println("Room Light Status: ON");
	}

}