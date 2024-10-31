public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Create book instances
        Book book1 = new Book("Seena Maragatham", "Sujatha Thilaka", "9789553023975",true);
        Book book2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala", "Seynamasasekaka", "9789553548721",true);
        Book book3 = new Book("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623",true);

        // Add books to library
        library.AddItems(book1);
        library.AddItems(book2);
        library.AddItems(book3);

        // List all available items
        library.ListAvailableItems();

        // Check out a book
        library.CheckoutItems("Island of a Thousand Mirrors");

        // Display library info again
        System.out.println("\nAfter checking out 'Island of a Thousand Mirrors':");
        library.ListAvailableItems();
    }
}