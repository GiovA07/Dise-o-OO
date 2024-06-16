package facade.remotecontrolBienHecho.remotecontrol;

public class EndDivices implements Command{

    private ControlFacade controlFacade;

    public EndDivices(ControlFacade controlFacade) {
        this.controlFacade = controlFacade;
    }

    public void execute() {
        controlFacade.endDivices();
    }

}
