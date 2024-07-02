package facade.remotecontrolBienHecho.remotecontrol;

public class VideoGameOn implements Command {

    VideoGame videoGame;

	public VideoGameOn(VideoGame videoGame) {
		this.videoGame = videoGame;
	}

	public void execute() {
		videoGame.on();
	}
}
