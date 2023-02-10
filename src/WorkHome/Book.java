package WorkHome;

import java.util.Objects;

public class Book {
    private String nameBook;
    private Author author;
    private int age;

    public Book (String nameBook, Author author, int age) {
        this.nameBook = nameBook;
        this.author = author;
        this.age = age;
    }

    public String getNameBook() {

        return this.nameBook;
    }
    public Author getAuthor() {
        
        return this.author;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return age == book.age && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, age);
    }

    @Override
    public String toString() {

        return "Название книги - " + this.nameBook + ", " + author.toString() + " Год издания - " + this.age;
    }
}

