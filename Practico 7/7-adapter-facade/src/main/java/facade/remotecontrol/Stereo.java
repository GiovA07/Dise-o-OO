package facade.remotecontrol;

public class Stereo {
	private String location;
	private String stereoState;
	private int volumen;

	public Stereo(String location) {
		this.location = location;
	}

	public void on() {
		stereoState = "stereo is on";
	}

	public void off() {
		stereoState = "stereo is off";
	}

	public void setCD() {
		stereoState = "stereo is set for CD input";
	}

	public void setDVD() {
		stereoState = "stereo is set for DVD input";
	}

	public void setRadio() {
		stereoState = "stereo is set for Radio";
	}

	public void setVolume(int volume) {
		volumen = volume;
	}

	public int getVolume() {
		return volumen;
	}

	public String getStereoState() {
		return stereoState;
	}
}
