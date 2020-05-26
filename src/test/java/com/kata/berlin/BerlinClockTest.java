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

}
