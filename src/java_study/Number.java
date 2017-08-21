package java_study;

import java.util.ArrayList;

public class Number {
	private ArrayList<Integer> numarr = new ArrayList<>();
	
	public ArrayList<Integer> NumberArr(String[] values) {
		for(int i = 0; i < values.length; i+=2) {
			numarr.add(Integer.parseInt(values[i]));
		}
		return numarr;
	}
}