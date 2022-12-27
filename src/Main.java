public class Main {
    public static void main(String[] args) {
        byte a = 56;
        short b = 23762;
        int c = 579899808;
        long d = 34689568798L;
        float e = 4.55f;
        double f = 3.5672;

           System.out.println("Значение перменной a с типом byte равно " + a);
           System.out.println("Значение перменной b с типом short равно " + b);
           System.out.println("Значение перменной c с типом int равно " + c);
           System.out.println("Значение перменной d с типом long равно " + d);
           System.out.println("Значение перменной e с типом float равно " + e);
           System.out.println("Значение перменной f с типом double равно " + f);


        int i = 569;
        short s = - 159;
        float fl = 27.12f;
        long l = 987678965549L;
        double db =  2.786;
        short sh = 27897;
        byte by = 67;


        byte ludPal = 23;
        byte anSe = 27;
        byte ekAn = 30;
        short allPaper = 480;

           int perPaper = allPaper / (ludPal + anSe + ekAn);

              System.out.println("На каждого ученика расчитанно " + perPaper + " листов бумаги.");


        byte bottleCycle = 16;
        byte timeCycle = 2;
        int day = 24 * 60;

           int task1 = (20 / timeCycle) * bottleCycle;
           int task2 = (day / timeCycle) * bottleCycle;
           int task3 = ((day * 3) / timeCycle) * bottleCycle;
           int task4 = ((day * 30) / timeCycle) * bottleCycle;

              System.out.println("За 20 минут машина произвела " + task1 + " штук бутылок.");
              System.out.println("За сутки машина произвела " + task2 + " штук бутылок.");
              System.out.println("За 3 дня машина произвела " + task3 + " штук бутылок.");
              System.out.println("За месяц машина произвела " + task4 + " штук бутылок.");

        byte fullPot = 120;
        byte groupWhite = 2;
        byte groupBrown = 4;

           int group = fullPot / (groupBrown + groupWhite);
           int potWhite = group * groupWhite;
           int potBrown = group * groupBrown;

           System.out.print("В школе, где " + group + " классов, нужно " + potWhite + " банок белой краски и " + potBrown + " банок коричневой краски.");

        byte banana = 5;
        byte iceCream = 2;
        byte egg = 4;
        byte milk = 2;
        byte weightBanana = 100;
        byte weightIceCream = 100;
        byte weightEgg = 70;
        short weightMilk = 105;

           int allWeightGr = (banana * weightBanana) + (iceCream * weightIceCream) + (egg * weightEgg) + (milk * weightMilk);
           float allWeightKg = allWeightGr / 1000f;

              System.out.println("Весь спортзавтрак весит " + allWeightGr + " гр.");
              System.out.println("Весь спортзавтрак весит " + allWeightKg + " кг.");


        byte kg = 7;
        short weigthDay1 = 250;
        short weigthDay2 = 500;

           int gr = kg * 1000;
           int averageWeightDay = (weigthDay1 + weigthDay2) / 2;
           int loseWeigth1 = gr / weigthDay1;
           int loseWeigth2 = gr / weigthDay2;
           int loseWeigth3 = gr / averageWeightDay;

              System.out.println("Спортсмену потребуется " + loseWeigth1 + " дней, чтобы добиться результата, если будет терять в день по " + weigthDay1 + " гр.");
              System.out.println("Спортсмену потребуется " + loseWeigth2 + " дней, чтобы добиться результата, если будет терять в день по " + weigthDay2 + " гр.");
              System.out.println("Спортсмену потребуется " + loseWeigth3 + " дней, чтобы добиться результата, если будет терять в день по " + averageWeightDay + " гр.");


        int zpMashaOld = 67760;
        int zpDenisOld = 83690;
        int zpKrisOld = 76230;
        float procent = 1.1f;
        byte year = 12;

           int zpYearMashaOld = zpMashaOld * year;
           int zpYearDenisOld = zpDenisOld * year;
           int zpYearKrisOld = zpKrisOld * year;
           float zpMashaNew = zpMashaOld * procent;
           float zpDenisNew = zpDenisOld * procent;
           float zpKrisNew = zpKrisOld * procent;
           float zpYearMashaNew = zpMashaNew * year;
           float zpYearDenisNew = zpDenisNew * year;
           float zpYearKrisNew = zpKrisNew * year;
           float zpYearMashaDif = zpYearMashaNew - zpYearMashaOld;
           float zpYearDenisDif = zpYearDenisNew - zpYearDenisOld;
           float zpYearKrisDif = zpYearKrisNew - zpYearKrisOld;

              System.out.println("Маша теперь получает " + zpMashaNew + " рублей. Годовой доход вырос на " + zpYearMashaDif + " рублей.");
              System.out.println("Денис теперь получает " + zpDenisNew + " рублей. Годовой доход вырос на " + zpYearDenisDif + " рублей.");
              System.out.println("Кристина теперь получает " + zpKrisNew + " рублей. Годовой доход вырос на " + zpYearKrisDif + " рублей.");

    }
}