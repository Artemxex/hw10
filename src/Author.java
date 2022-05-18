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
    public String toString(){
        return authorName + secondName;
    }

    public boolean equals(Author other) {
        if (this.getAuthorName() != other.getAuthorName() && this.getSecondName() != other.getSecondName()) {
            return false;
        }
        Author kirB = (Author) other;
        return authorName.equals(kirB.authorName) && secondName.equals(kirB.secondName);
    }
    public int hashCode() {
        return Objects.hash(authorName + secondName);
    }
}