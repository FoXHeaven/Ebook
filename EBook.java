//EBook.java
public class EBook extends Book {
    private String fileFormat;

    public EBook(String title, String author, double price, int quantity, String fileFormat) {
        super(title, author, price, quantity);
        this.fileFormat = fileFormat;
    }

    public void openBook() {
        System.out.println("The eBook is opened. You may start reading.");
    }

    public void downloadBook() {
        System.out.println("The eBook has begun downloading.");
    }

    public boolean validateFormat() {
        return fileFormat.equals(".pdf") || fileFormat.equals(".epub");
    }

    // Getter and setter methods
    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    @Override
    public String toString() {
        return super.toString() + ", File Format: " + fileFormat;
    }
}

