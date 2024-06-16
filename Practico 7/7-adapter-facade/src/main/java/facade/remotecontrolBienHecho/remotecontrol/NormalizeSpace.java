package facade.remotecontrolBienHecho.remotecontrol;

public class NormalizeSpace implements Command{

    private ControlFacade controlFacade;

    public NormalizeSpace(ControlFacade controlFacade) {
        this.controlFacade = controlFacade;
    }

    public void execute() {
        controlFacade.normalizeSpace();
    }


}
