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
}


