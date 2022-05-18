import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;

    }

    public String toString(){
        return"Название книги-" + name + "; Автор-" + author + "; Год выпуска-" + year;
    }
    public boolean equals(Book other) {
        if (this.getName() != other.getName() && this.getAuthor() != other.getAuthor() && this.getYear() != other.getYear()) {
            return false;
        }
        Book alice2 = (Book) other;
        return name.equals(alice2.name) && author.equals(alice2.author) && year == (alice2.year);
    }
    public int hashCode() {
        return Objects.hash(name + author + year);

    }
}
