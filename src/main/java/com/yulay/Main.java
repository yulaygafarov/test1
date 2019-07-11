package com.yulay;

import java.util.Scanner;

import com.yulay.util.IPHelper;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������� ��� IP-������.\n������ �����: ");
		String firstIp = in.nextLine();
		while (!IPHelper.isValidIp(firstIp)) {
			System.out.println("�� ����� IP-����� �� � ���������� �������! ������� � ������� \"���.���.���.���\"");
			firstIp = in.nextLine();
		}
		System.out.println("������ �����: ");
		String secondIp = in.nextLine();
		while (!IPHelper.isValidIp(secondIp)) {
			System.out.println("�� ����� IP-����� �� � ���������� �������! ������� � ������� \"���.���.���.���\"");
			firstIp = in.nextLine();
		}

		int firstIpIntegerValue = IPHelper.ipToInt(firstIp);
		int secondIpIntegerValue = IPHelper.ipToInt(secondIp);
		int min = Math.min(firstIpIntegerValue, secondIpIntegerValue);
		int max = Math.max(firstIpIntegerValue, secondIpIntegerValue);
		min++;
		if (min >= max) {
			System.out.println("��� IP-������� � ��������� ���������.");
			return;
		}
		int count = 0;
		while (min < max) {
			String currentIp = IPHelper.intToIp(min);
			System.out.println(currentIp);
			min++;
			count++;
		}
		System.out.println("����� " + count + " ������� � ��������� ���������.");
	}

}
