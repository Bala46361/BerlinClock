package com.kata.berlin;

public class BerlinClock {

	private static final String O = "O";
	private static final String R = "R";
	private static final int TOTAL_LAMPS_IN_HOURS_ROW = 4;

	private static final int FIVE = 5;
	private static final int ZERO = 0;
	private static final int TWO = 2;
	private static final String OFF = O;
	private static final String ON = "Y";

	public String getSeconds(int seconds) {
		return seconds % TWO == ZERO ? ON : OFF;
	}

	public String convertHoursToFiveHoursRow(int hours) {
		int onLampsCount = hours / FIVE;
		return convertToBerlinClockHours(onLampsCount);
	}

	public String convertHoursToSingleHoursRow(int hours) {
		int onLampsCount = hours % FIVE;
		return convertToBerlinClockHours(onLampsCount);

	}

	private String convertToBerlinClockHours(int onLampsCount) {
		StringBuilder result = new StringBuilder();
		for (int index = 0; index < TOTAL_LAMPS_IN_HOURS_ROW; index++)
			if (index < onLampsCount)
				result.append(R);
			else
				result.append(O);
		return result.toString();
	}

	public String convertMinutesToFiveMinutesRow(int minutes) {
		if (minutes / 5 == 2)
			return "YYOOOOOOOOO";
		else if (minutes / 5 == 1)
			return "YOOOOOOOOOO";
		else
			return "OOOOOOOOOOO";
	}

}
