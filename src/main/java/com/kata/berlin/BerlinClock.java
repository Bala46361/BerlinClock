package com.kata.berlin;

public class BerlinClock {

	private static final int ZERO = 0;
	private static final int TWO = 2;
	private static final String OFF = "O";
	private static final String ON = "Y";

	public String getSeconds(int seconds) {
		return seconds % TWO == ZERO ? ON : OFF;
	}

}
