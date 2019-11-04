package com.yulay.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class IPHelperTest {
    final String regularIp = "23.54.9.79";
    final int regularIpIntValue = 389417295;

    final String maxIp = "255.255.255.255";
    final int maxIpIntValue = 0xFF_FF_FF_FF;

    final String minIp = "0.0.0.0";
    final int minIpIntValue = 0;

    final String correctIp = "234.145.0.155";
    final String incorrectIp = "256.145.0.155";

    @Test
    public void testIntToIpWhenZero() {
        int IpIntValue = 0;
        String actual = IPHelper.intToIpStringView(IpIntValue);
        assertEquals(minIp, actual);
    }

    @Test
    public void testIntToIpWhenRegularValue() {
        String ip = IPHelper.intToIpStringView(regularIpIntValue);
        assertEquals(regularIp, ip);
    }

    @Test
    public void testIntToIpWhenMaxValue() {
        String ip = IPHelper.intToIpStringView(maxIpIntValue);
        assertEquals(maxIp, ip);
    }

    @Test
    public void testIpToIntWhenZero() {
        int ipIntValue = IPHelper.ipToInt(minIp);
        assertEquals(minIpIntValue, ipIntValue);
    }

    @Test
    public void testIpToIntWhenRegularValue() {
        int ipIntValue = IPHelper.ipToInt(regularIp);
        assertEquals(regularIpIntValue, ipIntValue);
    }

    @Test
    public void testIpToIntWhenMaxValue() {
        int ipIntValue = IPHelper.ipToInt(maxIp);
        assertEquals(maxIpIntValue, ipIntValue);
    }

    @Test
    public void testValidationWhenCorrect() {
        assertTrue(IPHelper.isValidIp(correctIp));
    }

    @Test
    public void testValidationWhenIncorrect() {
        assertFalse(IPHelper.isValidIp(incorrectIp));
    }

    @Test(expected = IpNotValidExeption.class)
    public void testExceptionWhenIncorrect() {
        System.out.println(IPHelper.ipToInt(incorrectIp));
    }
}
