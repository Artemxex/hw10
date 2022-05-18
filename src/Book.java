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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    public String toString() {
        return "Название книги-" + name + "; Автор-" + author + "; Год выпуска-" + year;
    }

    public boolean equals(Book other) {
        if (other == null || !Objects.equals(this.getName(), other.getName()) && !Objects.equals(this.getAuthor(), other.getAuthor()) && this.getYear() != other.getYear()) {
            return false;
        }
        Book book = (Book) other;
        Book alice2 = (Book) other;
        return year == book.year && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    public int hashCode() {
        return Objects.hash(name, year);

    }
}
