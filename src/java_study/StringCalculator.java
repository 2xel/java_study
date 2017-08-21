package java_study;

import java.util.ArrayList;

public class StringCalculator {

	//문자열을 받는다.
	//문자와 숫자를 분리한다.
	//처음숫자에 연산자,숫자를 합해서 계산 반복
	public int calculate(String text) {
		String[] values = text.split(" ");
		Calculator cal = new Calculator();
		Number number = new Number();
		Operator operator = new Operator();
		
		ArrayList<Integer> NumArr = number.NumberArr(values);
		ArrayList<String> OpArr = operator.OpArr(values);
		OpArr.lastIndexOf(operator);
		int result = NumArr.get(0);
		for(int i = 0; i<NumArr.size()-2; i++) {
		
			if(OpArr.get(i).equals("+")) {
				result = cal.add(result, NumArr.get(i+1));
			}
			if(OpArr.get(i).equals("-")) {
				result = cal.minus(result, NumArr.get(i+1));
			}
			if(OpArr.get(i).equals("*")) {
				result = cal.multi(result, NumArr.get(i+1));
			}
			if(OpArr.get(i).equals("/")) {
				result = cal.divide(result, NumArr.get(i+1));
			}
		}
		return result;
	}
}