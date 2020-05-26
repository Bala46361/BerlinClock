package com.kata.berlin;

public class BerlinClock {

	public String getSeconds(int seconds) {

		if (seconds % 2 == 0) {
			return "Y";
		} else {
			return "O";
		}
	}

}
