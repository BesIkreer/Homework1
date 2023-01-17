import javax.rmi.ssl.SslRMIClientSocketFactory;
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i ++) {
            System.out.println(i);
        }

        for (int j = 10; j > 0; j = j - 1) {
            System.out.println(j);
        }

        for (int l = 2; l < 17; l = l + 2) {
            System.out.println(l);
        }

        for (int k = 10; k > -11; k = k - 1) {
            System.out.println(k);
        }

        for (int y = 1904; y < 2096; y = y + 4) {
            System.out.println(y + " год является високосным");
        }

        for (int s = 7; s < 99; s = s + 7) {
            System.out.println(s);
        }

        for (int p = 1; p < 513; p = p * 2) {
            System.out.println(p);
        }

        int money = 29000;
        int total = 0;
        for (int q = 1; q < 13; q ++) {
            total = total + money;
            System.out.println("Месяц " + q + ", сумма накоплений равна " + total + " рублей.");
        }

        int money1 = 29000;
        int total1 = 0;
        for (int a = 1; a < 13; a ++) {
            total1 = total1 + total1/100;
            total1 = total1 + money1;
            System.out.println("Месяц " + a + ", сумма накоплений равна " + total1 + " рублей.");
        }

        int nob = 0;
        for (int h = 1; h < 11; h++) {
            nob = nob + 2;
            System.out.println("2*" + h + "=" + nob);
        }
    }
}

