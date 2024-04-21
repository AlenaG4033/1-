/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

/**
 *
 * @author Тапок Леона
 */
import java.util.Scanner;

public class Mavenproject5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Получить дату рождения
        System.out.println("Введите вашу дату рождения в формате дд.мм.гггг:");
        String dateString = scanner.nextLine();

        // Разбить дату на день, месяц и год
        String[] dateParts = dateString.split("\\.");
        int day = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int year = Integer.parseInt(dateParts[2]);

        // Определить знак зодиака
        String zodiacSign;
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            zodiacSign = "Овен";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            zodiacSign = "Телец";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            zodiacSign = "Близнецы";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            zodiacSign = "Рак";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            zodiacSign = "Лев";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            zodiacSign = "Дева";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            zodiacSign = "Весы";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            zodiacSign = "Скорпион";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            zodiacSign = "Стрелец";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            zodiacSign = "Козерог";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            zodiacSign = "Водолей";
        } else {
            zodiacSign = "Рыбы";
        }

        // Вывести знак зодиака
        System.out.println("Ваш знак зодиака: " + zodiacSign);
    }
}
