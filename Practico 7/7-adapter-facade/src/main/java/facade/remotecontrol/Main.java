package facade.remotecontrol;

public class Main {
  public static void main(String[] args) {
      RemoteControl remoteControl = new RemoteControl();
      FacadeControl facadeControl = new FacadeControl(remoteControl);

      facadeControl.setupWatchTV();
      System.out.println(facadeControl);

      facadeControl.watchGame();
  }
}
