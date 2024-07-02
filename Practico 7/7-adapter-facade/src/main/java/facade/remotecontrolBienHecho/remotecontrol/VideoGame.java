package facade.remotecontrolBienHecho.remotecontrol;

public class VideoGame {
    private String game;

    public VideoGame(String game) {
      this.game = game;
    }

    public void on() {
        System.out.println("Start Consola with game: " + game);
    }

    public void off() {
        System.out.println("Off Consola");
    }

    public void setGame(String game) {
      this.game = game;
    }

    public String getGame() {
      return game;
    }
}
