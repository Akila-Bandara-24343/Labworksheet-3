public class Book extends BorrowableItems{


    public Book(String title, String author, String ISBN, boolean available) {
        super(title, author, ISBN, available);
    }

    @Override
    public void displayInfo() {
        System.out.println("\nBook name : "+getTitle());
        System.out.println("Author : "+getAuthor());
        System.out.println("ISBN No. : "+getISBN());
        if(isAvailable() == false) {
            System.out.println("Availability : No\n");
        }else {
            System.out.println("Availability : Yes\n");
        }
    }


}
