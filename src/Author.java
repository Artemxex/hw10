import java.util.Objects;

public class Author {
    private String authorName;
    private String secondName;


    public Author(String name, String secondName) {
        this.authorName = name;
        this.secondName = secondName;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public String toString() {
        return authorName + " " + secondName;
    }


    public boolean equals(Author other) {
        if (other == null || !Objects.equals(this.getAuthorName(), other.getAuthorName()) && !Objects.equals(this.getSecondName(), other.getSecondName())) {
            return false;
        }
        Author kirB = (Author) other;
        return Objects.equals(authorName, kirB.authorName) && Objects.equals(secondName, kirB.secondName);
    }

    public int hashCode() {
        return Objects.hash(authorName, secondName);
    }
}