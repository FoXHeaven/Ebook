import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineBookstoreApp {
    private List<Book> books;

    public OnlineBookstoreApp() {
        books = new ArrayList<>();
    }

    public void addEBook(String title, String author, double price, int quantity, String fileFormat) {
        EBook eB = new EBook(title, author, price, quantity, fileFormat);
        books.add(eB);
        System.out.println("Added an eBook: " + eB.toString());
    }

    public void addPhysicalBook(String title, String author, double price, int quantity, double weight) {
        PhysicalBook pB = new PhysicalBook(title, author, price, quantity, weight);
        books.add(pB);
        System.out.println("Added a physical book: " + pB.toString());
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("List of books:");
            for (Book book : books) {
                System.out.println(book.toString());
            }
        }
    }

    public static void main(String[] args) {
        OnlineBookstoreApp user = new OnlineBookstoreApp();
        Scanner miku = new Scanner(System.in);

        int choice = 0;
        while (choice != 4) {
            System.out.println("Online Bookstore Application");
            System.out.println("1. Add an eBook");
            System.out.println("2. Add a physical book");
            System.out.println("3. Display all books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = miku.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter eBook title: ");
                    String eBookTitle = miku.next();
                    System.out.print("Enter eBook author: ");
                    String eBookAuthor = miku.next();
                    System.out.print("Enter eBook price: ");
                    double eBookPrice = miku.nextDouble();
                    System.out.print("Enter eBook quantity: ");
                    int eBookQuantity = miku.nextInt();
                    System.out.print("Enter eBook file format: ");
                    String eBookFileFormat = miku.next();
                    user.addEBook(eBookTitle, eBookAuthor, eBookPrice, eBookQuantity, eBookFileFormat);
                    break;
                case 2:
                    System.out.print("Enter physical book title: ");
                    String physicalBookTitle = miku.next();
                    System.out.print("Enter physical book author: ");
                    String physicalBookAuthor = miku.next();
                    System.out.print("Enter physical book price: ");
                    double physicalBookPrice = miku.nextDouble();
                    System.out.print("Enter physical book quantity: ");
                    int physicalBookQuantity = miku.nextInt();
                    System.out.print("Enter physical book weight (in grams): ");
                    double physicalBookWeight = miku.nextDouble();
                    user.addPhysicalBook(physicalBookTitle, physicalBookAuthor, physicalBookPrice,
                            physicalBookQuantity, physicalBookWeight);
                    break;
                case 3:
                    user.displayBooks();
                    break;
                case 4:
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
    }
}