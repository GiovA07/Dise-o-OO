package facade.remotecontrol;

public class FrezzeOnCommand implements Command{

    private Frezze frezze;
    private String preVal;

    public FrezzeOnCommand(Frezze frezze){
        this.frezze = frezze;
    }

    public void execute() {
        preVal = frezze.getState();
        frezze.on();
    }

}
