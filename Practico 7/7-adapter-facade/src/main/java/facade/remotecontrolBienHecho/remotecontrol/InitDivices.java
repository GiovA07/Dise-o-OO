package facade.remotecontrolBienHecho.remotecontrol;

public class InitDivices implements Command{

    private ControlFacade controlFacade;

    public InitDivices(ControlFacade controlFacade) {
        this.controlFacade = controlFacade;
    }

    public void execute() {
        controlFacade.initDivices();
    }

}
