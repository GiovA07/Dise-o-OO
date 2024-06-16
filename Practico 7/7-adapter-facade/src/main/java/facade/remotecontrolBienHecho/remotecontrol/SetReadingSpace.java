package facade.remotecontrolBienHecho.remotecontrol;

public class SetReadingSpace implements Command{

    private ControlFacade controlFacade;

    public SetReadingSpace(ControlFacade controlFacade) {
        this.controlFacade = controlFacade;
    }

    public void execute() {
        controlFacade.setReadingSpace();
    }


}
