/*
 
 university library manages books and members. A book has an ISBN, title, genre, and price. The library only stocks specific genres — Fiction, Science, History, and Technology. If a member tries to borrow a book whose genre is not in this list, throw a named exception with a message identifying the book and its unavailable genre. A member has a name and a membership ID. Members can borrow multiple books. Display each member's borrowed books and total amount. Create at least 4 books, 2 members, attempt a borrow that fails, and handle it. Use an interface to define the genre list.
 
 */

public class InvalidGenre extends Exception
{
    InvalidGenre(String message)
    {
        super(message);
    }
}
interface genres
{
    String g1 = "fiction";
    String g2 = "science";
    String g3 = "history";
    String g4 = "technology";
}
class book implements genres
{
    String ISBN, title, genre;
    double price;
    boolean flag = false;
    book(String ISBN, Sting title, String genre, double price)
    {
        this.ISBN=ISBN;
        this.title=title;
        this.genre=genre;
        this.price=price;
    }
    public void validator() throws InvalidGenre
    {
        if(genre.equals(g1)||genre.equals(g2)||genre.equals(g3)||genre.equals(g4))
            {
                System.out.println("Genre exists.");
            }
        else
            throw new InvalidGenre("Genre unavailable.\n Book Name: "+title+"\nGenre: "+genre);
    }
    public void display() {
           System.out.println("  ISBN: " + ISBN + " | Title: " + title +
                              " | Genre: " + genre + " | Price: Rs." + price);
       }
   }
}
class member
{
    String name, id;
    int count=0;
    int no;
    book[] b;
    member(String name, String id, int no)
    {
        this.name = name;
        this.id = id;
        b = new book[no];
        count++;
    }
}




public class library
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        
    }
}
