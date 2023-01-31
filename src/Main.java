import java.time.LocalDate;

public class Main {
    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }

    public static void findVersion(int[] input) {
        int inputYear = input[1];
        int inputOs = input[0];
        int clientDeviceYear = LocalDate.now().getYear();
        int clientOs = 0;
        if (inputOs == clientOs && inputYear >= clientDeviceYear) {
            System.out.println("Установите версию приложения для IOS по ссылке.");
        } else if (inputOs == clientOs && inputYear < clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке.");
        } else if (inputOs != clientOs && inputYear >= clientDeviceYear) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (inputOs != clientOs && inputYear < clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
    }

    public static int calculationDayDelivery(int inputDeliveryDistance) {
        int dayDelivery = 0;
        if (inputDeliveryDistance < 20) {
            dayDelivery = 1;
        } else if (inputDeliveryDistance >= 20 && inputDeliveryDistance < 60) {
            dayDelivery = 2;
        } else if (inputDeliveryDistance >= 60 && inputDeliveryDistance < 100) {
            dayDelivery = 3;
        } else {
            dayDelivery = 0;
        }
        return dayDelivery;
    }


    public static void main(String[] args) {
        System.out.println("Task1");
        int yearIn = 2021;
        checkYear(yearIn);
        System.out.println("Task2");
        int inputOs = 0;
        int currentYear = 2023;
        int[] input = new int[2];
        input[0] = inputOs;
        input[1] = currentYear;
        findVersion(input);
        System.out.println("Task3");
        int inputDistance = 12;
        int outDayDelivery = calculationDayDelivery(inputDistance);
        if (outDayDelivery == 0) {
            System.out.println("Доставка не возможна.");
        }
        System.out.println("Потребуется дней: " + outDayDelivery);
    }
}