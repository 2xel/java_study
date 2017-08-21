package java_study;

import java.util.ArrayList;

public class Operator {

	private ArrayList<String> oparr = new ArrayList<>();
	
	public ArrayList<String> OpArr(String[] values) {
		for(int i = 1; i < values.length-1; i+=2) {
			oparr.add(values[i]);
		}
		return oparr;
	}
}