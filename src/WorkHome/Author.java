package WorkHome;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(landName, author.landName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, landName);
    }

    @Override
    public String toString() {
        return "Имя - " + firstName +
                ", Фамилия - " + landName;
    }
}


