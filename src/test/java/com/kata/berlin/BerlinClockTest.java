package com.kata.berlin;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

public class BerlinClockTest {
	BerlinClock berlinClock;

	@Before
	public void initialize() {
		berlinClock = new BerlinClock();
	}

	@Test
	public void secondLightShouldTurnOnForEvenSeconds() {

		assertThat(berlinClock.getSeconds(22), CoreMatchers.is("Y"));
	}

	@Test
	public void secondLightShouldTurnOffForOddSeconds() {

		assertThat(berlinClock.getSeconds(21), CoreMatchers.is("O"));
	}

	@Test
	public void fiveHoursRowShouldContain4Lamps() {

		assertThat(berlinClock.convertHoursToFiveHoursRow(0).length(), CoreMatchers.is(4));

	}

	@Test
	public void firstLightShouldGlowRedForHours5To9() {

		assertThat(berlinClock.convertHoursToFiveHoursRow(7), CoreMatchers.is("ROOO"));

	}

	@Test
	public void firstTwoLampsShouldGlowRedForHours10to14() {

		assertThat(berlinClock.convertHoursToFiveHoursRow(13), CoreMatchers.is("RROO"));

	}

	@Test
	public void firstThreeLampsShouldGlowRedForHours15to19() {

		assertThat(berlinClock.convertHoursToFiveHoursRow(16), CoreMatchers.is("RRRO"));
	}

	@Test
	public void firstThreeLampsShouldGlowRedForHours20to24() {

		assertThat(berlinClock.convertHoursToFiveHoursRow(22), CoreMatchers.is("RRRR"));
	}

	@Test
	public void singleHoursRowShouldContain4Lamps() {

		assertThat(berlinClock.convertHoursToSingleHoursRow(0).length(), CoreMatchers.is(4));
	}

}
