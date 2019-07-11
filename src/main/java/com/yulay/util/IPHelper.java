package com.yulay.util;

public class IPHelper {
	public static boolean isValidIp(String ip) {
		return false;
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
		return null;
	}

}
