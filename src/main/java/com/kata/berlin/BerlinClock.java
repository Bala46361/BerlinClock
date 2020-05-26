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
		if (hours >= 20 && hours <= 24) {
			return "RRRR";
		} else if (hours >= 15 && hours <= 19) {
			return "RRRO";
		} else if (hours >= 10 && hours <= 14) {
			return "RROO";
		} else if (hours >= 5 && hours <= 9) {
			return "ROOO";
		} else {
			return "OOOO";
		}
	}

}
