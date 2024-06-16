package facade.remotecontrol;

public class TVOffCommand implements Command{
  TV tv;
  int channel;

	public TVOffCommand(TV tv) {
		this.tv = tv;
	}

	public void execute() {
    channel = tv.getChannel();
		tv.off();
	}
}
