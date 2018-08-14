package info.sjd.runners;

import info.sjd.exceptions.ExceptionSJD;
import info.sjd.logic.ZeroDiv;

public class ExcRunner {

	public static void main(String[] args) {

		ZeroDiv zeroDiv = new ZeroDiv();

		zeroDiv.setA(2);
		zeroDiv.setB(1);

		try {
			System.out.println(zeroDiv.getDivResult());
		} catch (ExceptionSJD e) {

			e.printStackTrace();
		}

	}

}
