package java_study;

public class StringCalculator {

	public int calculate(String text) {
		String[] value = text.split(" ");
		int a = Integer.parseInt(value[0]);
		int b = Integer.parseInt(value[2]);
		String operator = value[1];
		if(operator.equals("+")) {
			return a+b;
		}
		if(operator.equals("-")) {
			return a-b;
		}
		if(operator.equals("*")) {
			return a*b;
		}
		if(operator.equals("/")) {
			return a/b;
		}
		return 0;
	}
}
