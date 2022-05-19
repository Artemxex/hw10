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


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        if (!Objects.equals(this.getAuthorName(), ((Author) o).getAuthorName()) && !Objects.equals(this.getSecondName(), ((Author) o).getSecondName())) {
        }
        return Objects.equals(authorName, author.authorName) && Objects.equals(secondName, author.secondName);
    }

    public int hashCode() {
        return Objects.hash(authorName, secondName);
    }
}
