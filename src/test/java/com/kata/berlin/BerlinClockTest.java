package com.kata.berlin;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class BerlinClockTest {

	@Test
	public void secondLightShouldTurnOnForEvenSeconds() {
		BerlinClock berlinClock = new BerlinClock();

		assertThat(berlinClock.getSeconds(22), CoreMatchers.is("Y"));
	}

	@Test
	public void secondLightShouldTurnOffForOddSeconds() {
		BerlinClock berlinClock = new BerlinClock();

		assertThat(berlinClock.getSeconds(21), CoreMatchers.is("O"));
	}

}
