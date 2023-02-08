package WorkHome;

public class Author {
 private    String firstName;
 private    String landName;
    public Author(String firstName, String landName ) {
        this.firstName = firstName;
        this.landName = landName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLandName() {
        return this.landName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLandName(String landName) {
        this.landName = landName;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author vovin = (Author) other;
        return  false;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName);
    }

    @Override
    public String toString() {
        return "Имя автор - " + this.firstName + ", Фамилия автора - " + this.landName;
    }

}


