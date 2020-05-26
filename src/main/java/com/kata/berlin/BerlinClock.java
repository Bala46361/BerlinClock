package com.kata.berlin;

public class BerlinClock {

	private static final int ZERO = 0;
	private static final int TWO = 2;
	private static final String OFF = "O";
	private static final String ON = "Y";

	public String getSeconds(int seconds) {
		return seconds % TWO == ZERO ? ON : OFF;
	}

	public String convertHoursToFiveHoursRow(int hours) {
		int onLampsCount = hours / 5;
		String result = "";
		for (int i = 0; i < 4; i++)
			if (i < onLampsCount)
				result += "R";
			else
				result += "O";
		return result;
	}

}
