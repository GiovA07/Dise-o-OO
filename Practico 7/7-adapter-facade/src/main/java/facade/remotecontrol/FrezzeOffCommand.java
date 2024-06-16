package facade.remotecontrol;

public class FrezzeOffCommand implements Command{

    private Frezze frezze;
    private String preVal;

    public FrezzeOffCommand(Frezze frezze){
        this.frezze = frezze;
    }

    public void execute() {
        preVal = frezze.getState();
        frezze.off();
    }
}
