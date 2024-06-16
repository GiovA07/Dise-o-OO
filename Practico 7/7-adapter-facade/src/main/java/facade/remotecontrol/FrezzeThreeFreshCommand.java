package facade.remotecontrol;

public class FrezzeThreeFreshCommand implements Command{

    private Frezze frezze;
    private String preVal;

    public FrezzeThreeFreshCommand(Frezze frezze){
        this.frezze = frezze;
    }

    public void execute(){
        preVal = frezze.getState();
        frezze.three();
    }
}

