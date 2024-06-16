package facade.remotecontrol;

public class TV {
	String location;
	String tvState;
	int channel;

	public TV(String location) {
		this.location = location;
	}

	public void on() {
		channel = 0;
		tvState = "TV is on";
	}

	public void off() {
		channel = 0;
		tvState = "TV is off";
	}

	public void setInputChannel(int channel) {
		this.channel = channel;
		tvState = "Channel is set for " + channel;
	}

	public String getTVState() {
		return tvState;
	}

	public int getChannel() {
		return channel;
	}
}
