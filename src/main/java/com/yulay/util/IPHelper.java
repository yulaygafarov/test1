package com.yulay.util;

import com.google.common.net.InetAddresses;

public class IPHelper {
	public static boolean isValidIp(String ip) {
		return InetAddresses.isInetAddress(ip);
	}

	public static int ipToInt(String ip) {
		if (!isValidIp(ip))
			new IpNotValidExeption(ip + " is not valid value for IPv4 address");
		String[] parts = ip.split("\\.");
		int result = 0;
		result += Integer.valueOf(parts[3]);
		result += Integer.valueOf(parts[2]) * 1 << 8;
		result += Integer.valueOf(parts[1]) * 1 << 16;
		result += Integer.valueOf(parts[0]) * 1 << 24;

		return result;
	}

	public static String intToIp(int ipIntValue) {
		String[] parts = new String[4];
		for (int i = 0; i < 4; i++) {
			parts[i] = String.valueOf(ipIntValue & 0xFF);
			ipIntValue >>= 8;
		}

		return parts[3] + "." + parts[2] + "." + parts[1] + "." + parts[0];
	}

}
