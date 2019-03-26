public class Stereo {
	String location;
	int volume = 0;

	public Stereo(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " stereo is on");
	}

	public void off() {
		System.out.println(location + " stereo is off");
	}

	public void setCD() {
		System.out.println(location + " stereo is set for CD input");
	}

	public void setDVD() {
		System.out.println(location + " stereo is set for DVD input");
	}

	public void setRadio() {
		System.out.println(location + " stereo is set for Radio");
	}

	public void setVolume(int volume) {
	
		if(volume <=11 && volume >= 1)
		{
			this.volume = volume;
		}	
		System.out.println(location + " Stereo volume set to " + volume);
	}

	public void incrementVolume()
	{
		volume++;
		System.out.println(location + " Stereo volume set to " + volume);
	}

	public void decrementVolume()
	{
		volume--;
		System.out.println(location + " Stereo volume set to " + volume);
	}
	
}
