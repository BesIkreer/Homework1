package WorkHome;

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
    public String toString() {
        return "Название книги - " + this.nameBook + ", " + author.toString() + " Год издания - " + this.age;
    }
}

