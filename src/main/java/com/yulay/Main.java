package com.yulay;

import java.util.Scanner;

import com.yulay.util.IPHelper;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите два IP-адреса.\nПервый адрес: ");
		String firstIp = in.nextLine();
		while (!IPHelper.isValidIp(firstIp)) {
			System.out.println("Вы ввели IP-адрес не в корректном формате! Вводите в формате \"ххх.ххх.ххх.ххх\"");
			firstIp = in.nextLine();
		}
		System.out.println("Второй адрес: ");
		String secondIp = in.nextLine();
		while (!IPHelper.isValidIp(secondIp)) {
			System.out.println("Вы ввели IP-адрес не в корректном формате! Вводите в формате \"ххх.ххх.ххх.ххх\"");
			firstIp = in.nextLine();
		}

		int firstIpIntegerValue = IPHelper.ipToInt(firstIp);
		int secondIpIntegerValue = IPHelper.ipToInt(secondIp);
		int min = Math.min(firstIpIntegerValue, secondIpIntegerValue);
		int max = Math.max(firstIpIntegerValue, secondIpIntegerValue);
		min++;
		if (min >= max) {
			System.out.println("Нет IP-адресов в указанном диапазоне.");
			return;
		}
		int count = 0;
		while (min < max) {
			String currentIp = IPHelper.intToIp(min);
			System.out.println(currentIp);
			min++;
			count++;
		}
		System.out.println("Всего " + count + " адресов в указанном диапазоне.");
	}

}
