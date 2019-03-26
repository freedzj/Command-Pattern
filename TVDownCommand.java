public class TVDownCommand implements Command {
	TV tv;
 
	public TVDownCommand(TV tv) {
		this.tv = tv;
	}
 
	public void execute() {
		channel--;
	}
}
