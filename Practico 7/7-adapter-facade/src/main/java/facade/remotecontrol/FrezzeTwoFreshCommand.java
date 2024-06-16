package facade.remotecontrol;

public class FrezzeTwoFreshCommand implements Command{

    private Frezze frezze;
    private String preVal;

    public FrezzeTwoFreshCommand(Frezze frezze){
        this.frezze = frezze;
    }

    public void execute(){
        preVal = frezze.getState();
        frezze.two();
    }
}
