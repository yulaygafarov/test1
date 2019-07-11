package com.yulay.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IPHelperTest {
	@Test
	public void testIntToIpWhenZero() {
		int IpIntValue = 0;
		String expected = "0.0.0.0";
		String actual = IPHelper.intToIp(IpIntValue);
		assertEquals(expected, actual);
	}

	@Test
	public void testIntToIpWhenRegularValue() {
		int IpIntValue = 389417295;
		String expected = "23.54.9.79";
		String actual = IPHelper.intToIp(IpIntValue);
		assertEquals(expected, actual);
	}

	@Test
	public void testIntToIpWhenMaxValue() {
		int IpIntValue = 0xFF_FF_FF_FF;
		String expected = "255.255.255.255";
		String actual = IPHelper.intToIp(IpIntValue);
		assertEquals(expected, actual);
	}

	@Test
	public void testIpToIntWhenZero() {
		String ip = "0.0.0.0";
		int expected = 0;
		int actual = IPHelper.ipToInt(ip);
		assertEquals(expected, actual);
	}

	@Test
	public void testIpToIntWhenRegularValue() {
		String ip = "23.54.9.79";
		int expected = 389417295;
		int actual = IPHelper.ipToInt(ip);
		assertEquals(expected, actual);
	}

	@Test
	public void testIpToIntWhenMaxValue() {
		String ip = "255.255.255.255";
		int expected = 0xFF_FF_FF_FF;
		int actual = IPHelper.ipToInt(ip);
		assertEquals(expected, actual);
	}
}
