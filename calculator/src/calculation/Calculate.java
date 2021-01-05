package calculation;

public class Calculate {

	public int progress = 0;

	public int result = 0;

	public void calculate() {

	}

	public void AC() {
		if (progress == 0) {
			result = 0;
			return;
		} else if (progress != 0) {
			progress = 0;
		}
	}

}
