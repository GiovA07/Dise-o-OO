package facade.remotecontrol;

public class TVOnCommand implements Command {
    TV tv;
    int channel;

    public TVOnCommand(TV tv) {
      this.tv = tv;
    }

    public void execute() {
      channel = tv.getChannel();
      tv.on();
    }
}
