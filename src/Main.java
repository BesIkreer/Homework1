import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Main {
    public static void main(String[] args) {
       int age = 15;
       if (age >= 18) {
           System.out.println("Если возраст человека " + age + ", совершеннослетний.");
       }
       else {
           System.out.println("Если возраст человека " + age + ", он не достиг совершеннослетия, нужно немного подождать.");
       }
       int temp = 10;

       if (temp <= 5) {
           System.out.println("На улице " + temp + " градусов, нужно надеть шапку.");
       }
       else {
           System.out.println("На улице " + temp + " градусов, можно идти без шапки.");
       }



       int age1 = 25;
       boolean institution1 = age1 >= 2 && age1 < 6;
       boolean institution2 = age1 >= 7 && age1 < 18;
       boolean institution3 = age1 >= 18 && age1 < 24;
       boolean institution4 = age1 >= 24;
       if (institution1) {
          System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад.");
       }
       if (institution2) {
           System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу.");
       }
       if (institution3) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в университет.");
        }
       if (institution4) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить на работу.");
        }



        int age2 = 15;
        boolean limitation1 = age2 < 5;
        boolean limitation2 = age2 >= 5 && age2 < 14;
        boolean limitation3 = age2 >= 14;
        if (limitation1) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему нельзя кататься на аттракционе.");
        }
        if (limitation2) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему нужно кататься на аттракционе в сопровождении.");
        }
        if (limitation3) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе без сопровождения.");
        }


        int passenger = 123;
        boolean slot1 = passenger <= 60;
        boolean slot2 = passenger > 60 && passenger <= 102;
        boolean slot3 = passenger > 102;
        if (slot1) {
            System.out.println("Вы пассажир №" + passenger + " для вас есть сидячие места." );
        }
        if (slot2) {
            System.out.println("Вы пассажир №" + passenger + " для вас есть места стоя." );
        }
        if (slot3) {
            System.out.println("Вы пассажир №" + passenger + " для вас нет мест." );
        }


        int one = 12;
        int two = 24;
        int three = 51;
        boolean maxOne = one > two && one > three;
        boolean maxTwo = two > one && two > three;
        boolean maxThree = three > one && three > two;

        if (maxOne) {
            System.out.println("Самое большое число из введеных - " + one);
        }
        if (maxTwo) {
            System.out.println("Самое большое число из введеных - " + two);
        }
        if (maxThree) {
            System.out.println("Самое большое число из введеных - " + three);
        }

    }
}