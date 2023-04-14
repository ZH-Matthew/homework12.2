
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

    public static boolean equals(Author v1, Author v2) {
        return (v1.fName).equals(v2.fName) && (v1.lName).equals(v2.lName);
    }

    @Override
    public int hashCode() {
        return fName.hashCode() + lName.hashCode();
    }

    @Override
    public String toString() {
        return fName + " " + lName;
    }
}
