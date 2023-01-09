import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Main {
    public static void main(String[] args) {
        int inputYear = 2015;
        int inputOS = 1;
        int clientDeviceYear = 2015;
        int clientIOS = 0;
        int clientAnd = 1;
        if (inputOS == clientAnd && inputYear >= clientDeviceYear) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if(inputOS == clientAnd && inputYear < clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        if (inputOS == clientIOS && inputYear >= clientDeviceYear) {
            System.out.println("Установите версию приложения для IOS по ссылке.");
        } else  if (inputOS == clientIOS && inputYear < clientDeviceYear){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }


        int year = 2020;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год  высокосный");
        } else {
            System.out.println(year + " год не высокосный");
        }


        int deliveryDistance = 62;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if(deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставка не возможна.");
        }


        int monthNumber = 6;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5  :
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }

    }
}
