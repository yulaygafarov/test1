package com.yulay;

import com.yulay.util.IPHelper;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите два IP-адреса.\nПервый адрес: ");
        String firstIp = readIpAddress();

        System.out.println("Второй адрес: ");
        String secondIp = readIpAddress();

        int firstIpIntegerValue = IPHelper.ipToInt(firstIp);
        int secondIpIntegerValue = IPHelper.ipToInt(secondIp);
        int minOfIpRange = Math.min(firstIpIntegerValue, secondIpIntegerValue);
        int maxOfIpRange = Math.max(firstIpIntegerValue, secondIpIntegerValue);
        while (minOfIpRange <= maxOfIpRange) {
            String currentIp = IPHelper.intToIpStringView(minOfIpRange);
            System.out.println(currentIp);
            minOfIpRange++;
        }
    }

    private static String readIpAddress() {
        String ip = scanner.nextLine();
        while (!IPHelper.isValidIp(ip)) {
            System.out.println("Вы ввели IP-адрес не в корректном формате! Вводите в формате \"ххх.ххх.ххх.ххх\"");
            ip = scanner.nextLine();
        }
        return ip;
    }
}
