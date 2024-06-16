package facade.remotecontrol;

public class FrezzeOneFreshCommand implements Command{

    private Frezze frezze;
    private String preVal;

    public FrezzeOneFreshCommand(Frezze frezze){
        this.frezze = frezze;
    }

    public void execute(){
        preVal = frezze.getState();
        frezze.one();
    }
}

