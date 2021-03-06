package mvc.person;

import java.util.ArrayList;
import java.util.List;

public class UserCreation {
	private List<Command> history = new ArrayList<Command>();

	public void storeAndExecute(final Command cmd) {
		this.history.add(cmd); // optional
		cmd.execute();
	}
}
