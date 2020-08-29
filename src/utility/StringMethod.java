package utility;

// Type your code
public class StringMethod {

	private String input;

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String lower(String input) {
		return input.toLowerCase();

	}

	public String upper(String input) {
		return input.toUpperCase();

	}

	public String firstCharacter(String input) {
		return input.substring(0, 1);

	}

	public String length(String input) {
		int len = input.length();
		String length = String.valueOf(len);
		return length;

	}

	public String trim(String input) {
		return input.trim();

	}
}
