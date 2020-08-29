package utility;

// Type your code
public class StringAdvanceMethod {
	private String input1;
	private String input2;

	public String getInput1() {
		return input1;
	}

	public void setInput1(String input1) {
		this.input1 = input1;
	}

	public String getInput2() {
		return input2;
	}

	public void setInput2(String input2) {
		this.input2 = input2;
	}

	public String concat(String input1, String input2) {
		String result = "";
		result = input1.concat(input2);
		return result;
	}

	public String split(String input1, String input2) {

		String result = " ";
		String[] arr = input1.split(input2);

		for (int i = 0; i < arr.length; i++) {
			result = result + arr[i];
		}

		return result.trim();
	}

	public String indexOf(String input1, String input2) {
		int index = input1.indexOf(input2);
		String result = String.valueOf(index);
		return result;
	}

}
