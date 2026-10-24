class Book {
    
    int id;
    String title;
    String auth;
    double price;

    static int count = 0;

    Book(int id, String title, String auth, double price)
    {
        this.id = id;
        this.title = title;
        this.auth = auth;
        this.price = price;
        count++;
    }

    public void display()
    {
        System.out.println("Id : " + id);
        System.out.println("Title : " + title);
        System.out.println("Author : " + auth);
        System.out.println("Price : " + price);
        System.out.println("-----------------------");
    }

    public boolean search(int id)
    {
        return this.id == id;
    }

    public boolean search(String title)
    {
        return this.title.equalsIgnoreCase(title);
    }

    Book comparer(Book other)
    {
        if (this.price > other.price)
            return this;
        else
            return other;
    }

    static public int getcount()
    {
        return count;
    }
    
}

public class Main
{
    public static void main(String args[])
    {
        Book b1 = new Book(101, "Java Programming", "James Gosling", 550.00);
        Book b2 = new Book(102, "Python Basics", "Guido van Rossum", 450.00);
        Book b3 = new Book(103, "Data Structures", "Mark Allen", 650.00);

        System.out.println("BOOK DETAILS");
        System.out.println("=========================");
        b1.display();
        b2.display();
        b3.display();

        System.out.println("Searching by Book ID 102:");
        if (b2.search(102))
            System.out.println("Book found: Python Basics");
        else
            System.out.println("Book not found.");

        System.out.println("Searching by Title 'Data Structures':");
        if (b3.search("Data Structures"))
            System.out.println("Book found: Data Structures");
        else
            System.out.println("Book not found.");
        // Find the costlier book
        Book costlier = b1.comparer(b3);
        System.out.println("\nCostlier Book:");
        costlier.display();
        // Display total number of books
        System.out.println("Total Books Created: " + Book.getcount());
    }
}