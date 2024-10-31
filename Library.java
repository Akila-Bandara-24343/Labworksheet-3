import java.util.ArrayList;

public class Library {
    ArrayList<BorrowableItems> BorrowableItemsList = new ArrayList<>();

    public void AddItems(BorrowableItems items){
        BorrowableItemsList.add(items);//to add items
    }

    public void CheckoutItems(String book){
        for (BorrowableItems item : BorrowableItemsList) {
            if ((item.getISBN().equals(book) || item.getTitle().equalsIgnoreCase(book)) && (item.isAvailable()== true)) {
                item.setAvailable(false);
            }
        }
    }
    int itemcount=0;
    public void ListAvailableItems(){
        for (BorrowableItems item : BorrowableItemsList) {
            if ((item.isAvailable()== true)) {
                item.displayInfo();
                itemcount++;
            }
        }
        System.out.println("Number of available books : "+ itemcount);
        itemcount=0;
    }

}
