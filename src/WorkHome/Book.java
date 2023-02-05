package WorkHome;

public class Book {
    private String nameBook;
    Author author;
    private int age;

    public Book (String nameBook, Author author, int age) {
        this.nameBook = nameBook;
        this.author = author;
        this.age = age;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getAge() {
        return this.age;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

