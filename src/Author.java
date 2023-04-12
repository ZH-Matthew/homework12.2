
public class Author {
    private final String fName;
    private final String lName;

    public Author(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public String getfName() {
        return this.fName;
    }

    public String getlName() {
        return this.lName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return fName.equals(c2.fName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(fName);
    }

    @Override
    public String toString() {
        return fName + " " + lName;
    }
}
