package facade.remotecontrolBienHecho.remotecontrol;

public class WatchSoccerGame implements Command{

    private ControlFacade controlFacade;

    public WatchSoccerGame(ControlFacade controlFacade) {
        this.controlFacade = controlFacade;
    }

    public void execute() {
        controlFacade.watchSoccerGame();
    }

}
