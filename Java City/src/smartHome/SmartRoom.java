package smartHome;

public class SmartRoom extends LightBulb {

	private LightBulb roomLight;
    private Speaker speaker;

    public SmartRoom() {
        roomLight = new LightBulb();
        speaker = new Speaker();
    }

    public void pressWallSwitch() {
        System.out.println("\nWall Switch Pressed...");
        roomLight.toggle();
    }

    public void partyMode() {
        System.out.println("\nParty Mode Activated !!");

        System.out.println("\nTurning on the room light...");
        roomLight.turnOn();

        System.out.println("\nStarting the speaker...");
        speaker.playMusic();
    }
	
}
