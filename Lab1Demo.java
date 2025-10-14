
class Book {
    private String title;
    private String author;
    private double price;
   
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
   
    public void display() {
        System.out.println("Title: " + this.title + ", Author: " + this.author +
                         ", Price: $" + this.price);
    }
}

class Lab1Demo {
    public static void main(String[] args) {
        System.out.println("=== LAB 1: Book Library System ===\n");
        Book book1 = new Book("Java Programming", "James Gosling", 45.99);
        Book book2 = new Book("Clean Code", "Robert Martin", 39.99);
        book1.display();
        book2.display();
    }
}
