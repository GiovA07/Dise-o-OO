package facade.remotecontrolBienHecho.remotecontrol;

public class FinishSoccerGame implements Command{

    private ControlFacade controlFacade;

    public FinishSoccerGame(ControlFacade controlFacade) {
        this.controlFacade = controlFacade;
    }

    public void execute() {
        controlFacade.finishSoccerGame();
    }

}
