package facade.remotecontrolBienHecho.remotecontrol;

public class VideoGameOff implements Command {
    VideoGame videoGame;

	public VideoGameOff(VideoGame videoGame) {
		this.videoGame = videoGame;
	}

	public void execute() {
		videoGame.off();
	}
}
