public class hw {
    public static void main(String[] args) {
        Author kirB = new Author("Кир ", "Булычёв");
        Author kir = new Author("Кир ", "Булычёв");
        Author jules = new Author("Жуль", "Верн");
        System.out.println(kir.equals(kirB));

        Book alice = new Book("Путешествие Алисы", kir, 1965);
        Book alice2 = new Book("Путешествие Алисы", kir, 1965);
        Book island = new Book("Таинственный остров", jules, 1875);
        System.out.println(alice.equals(alice2));

        System.out.println(alice);
        System.out.println(island);



    }
}