package com.kata.berlin;

public class BerlinClock {

	public String getSeconds(int seconds) {
		return seconds % 2 == 0 ? "Y" : "O";
	}

}
