public class TVOnCommand implements Command {
	TV tv;

	public TVOffCommand(TV tv) {
		this.tv = tv;
	}

	public void execute() {
		tv.on();
	}
}
