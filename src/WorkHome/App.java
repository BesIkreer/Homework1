package WorkHome;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Author vovin = new Author("Andrei", "Vovin");
        System.out.println("Автор книги - " + vovin.getFirstName() + " " + vovin.getLandName());

        Author petin = new Author("Aleg", "Petin");
        petin.setFirstName("Andrei");
        petin.setLandName("Vovin");
        System.out.println("Автор книги - " + petin.getFirstName() + " " + petin.getLandName());

        Book povest = new Book("Zima", new Author(vovin.getFirstName(), vovin.getLandName()), 1982);
        System.out.println("Название - " + povest.getNameBook());
        System.out.println("Автор книги - " + povest.getAuthor().getFirstName() + " " + povest.getAuthor().getLandName());
        System.out.println("Год издания - " + povest.getAge());

        Book scaz = new Book("Vesna", new Author(petin.getFirstName(), petin.getLandName()), 1999);
        System.out.println("Название - " + scaz.getNameBook());
        System.out.println("Автор книги - " + scaz.getAuthor().getFirstName() + " " + scaz.getAuthor().getLandName());
        System.out.println("Год издания - " + scaz.getAge());
        scaz.setAge(1899);
        System.out.println("Год издания - " + scaz.getAge());

        System.out.println(povest.toString());
        System.out.println(vovin.equals(petin));
        System.out.println(povest.equals(scaz));
    }
}
