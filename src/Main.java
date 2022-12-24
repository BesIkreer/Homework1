public class Main {
    public static void main(String[] args) {
        var dog = 8;
        double dog1;
        var cat = 3.6;
        var paper = 763789;

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        dog1 = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog1);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        var frog = 3.5;

        friend = friend + 2;
        frog = frog * 10;
        friend = friend / 7;
        frog = frog / 3.5;

        System.out.println(friend);
        System.out.println(frog);


        var boxer1 = 78.2;
        var boxer2 = 82.7;
        double fullMasse;
        double differenceBoxers1;
        double differenceBoxers2;


        fullMasse = boxer1 + boxer2;
        differenceBoxers1 = boxer2 - boxer1;
        differenceBoxers2 = (boxer2 % boxer1);

        System.out.println("Общий вес боксеров равен: " + fullMasse + " кг!");
        System.out.println("Разница в вессе между бойцами равна: " + differenceBoxers1 + " кг!");
        System.out.println("Разница в вессе между бойцами способ 2 равна: " + differenceBoxers2 + " кг!");

        var time = 640;
        var workTime = 8;
        int people;

        people = time / workTime;

        System.out.println("Всего работников в компании - " + people + " человек");

        int peopleMax;
        int timeMax;

        peopleMax = people + 94;
        timeMax = peopleMax * workTime;

        System.out.println("Если в компании работает " +peopleMax + " человек, то всего " + timeMax + " часов работы может быть поделено между сотрудниками");
       }
    }
