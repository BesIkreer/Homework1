public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int summa = 0;
        int h = 0;
        while (summa < 2470000) {
            System.out.println("Месяц " + h + ", сумма накоплений равна " + summa + " рублей.");
            h = h + 1;
            summa = summa + 15000;
        }
        System.out.println("Задача №2");
        int k = 1;
        int l = 10;
        while (k < 11) {
            System.out.print(k + " ");
            k = k + 1;
        }
        System.out.println();
        for (; l > 0; l = l - 1) {
            System.out.print(l + " ");
        }
        System.out.println();
        System.out.println("Задача №3");
        int all = 12000000;
        int jo = (17 - 8) * (12000000 / 1000);
        int ye = 0;
        while (ye < 10) {
            ye = ye + 1;
            all = all + jo;
            System.out.println("Год " + ye + ", численность населения состовляет " + all);
        }
        System.out.println("Задача №4");
        int cash = 15000;
        int mo = 0;
        while (cash < 12124800) {
            mo = mo + 1;
            cash = cash + (cash / 100) * 7;
            System.out.println("Месяц № " + mo + ", сумма накоплений " + cash + ".");
        }
        System.out.println("Задача №5");
        int cash1 = 15000;
        int mo1 = 0;
        while (cash1 < 12124800) {
            mo1 = mo1 + 1;
            cash1 = cash1 + (cash1 / 100) * 7;
            if (mo1 % 6 == 0) {
                System.out.println("Месяц № " + mo1 + ", сумма накоплений " + cash1 + ".");
            }
        }
        System.out.println("Задача №6");
        int cash2 = 15000;
        int mo2 = 0;
        while (mo2 < 109) {
            mo2 = mo2 + 1;
            cash2 = cash2 + (cash2 / 100) * 7;
            if (mo2 % 6 == 0) {
                System.out.println("Месяц№ " + mo2 + ", сумма накоплений равна " + cash2 + " рублей.");
            }
        }
        System.out.println("Задача №7");
        int fri = 2;
        while (fri < 31) {
            System.out.println("Сегодня пятница, " + fri + "-е число. Необходимо подготовить отчет.");
            fri = fri + 7;
        }
        System.out.println("Задача №8");
        int o = 0;
        int du = 2023 - 200;
        int po = 2023 + 100;
        while (o < po) {
            o = o + 79;
            if (o > du && o < po) {
                System.out.println(o);
            }
        }
    }
}

