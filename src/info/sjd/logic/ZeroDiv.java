package info.sjd.logic;

import info.sjd.exceptions.ExceptionSJD;

public class ZeroDiv {
	private int a;
	private int b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getDivResult() throws ExceptionSJD {
		
		if(a==0||b==0) {
			throw new ExceptionSJD("/ by zero");
		}
		
		return a/b;
		
	}
	
}
