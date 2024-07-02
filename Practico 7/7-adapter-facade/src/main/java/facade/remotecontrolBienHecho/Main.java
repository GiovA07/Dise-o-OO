package facade.remotecontrolBienHecho;

import facade.remotecontrolBienHecho.remotecontrol.*;

public class Main {
    public static void main(String[] args) {
        Light light = new Light("Living");
        TV tv = new TV("Living");
        VideoGame videoGame = new VideoGame("GTA");
        AirConditioner airCondition = new AirConditioner("Living");



        ControlFacade facade = new ControlFacade(light, tv, videoGame, airCondition);

        System.out.println("Init Game Soccer: ");
        facade.watchSoccerGame();

        System.out.println("End Game Soccer: ");
        facade.finishSoccerGame();

        System.out.println("Init Game Mode: ");
        facade.setGameMode();

        System.out.println("End Game Mode: ");
        facade.offGameMode();




    }
}
