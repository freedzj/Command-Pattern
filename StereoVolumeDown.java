public class StereoVolumeDown implements Command {
	Stereo stereo;
 
	public StereoVolumeUp(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.decrementVolume();
	}
}
