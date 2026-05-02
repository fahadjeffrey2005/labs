/*
 
 Create a base class Book (title, ISBN). Derive Journal (subject) and Novel (genre), each implementing boolean compare(Book b1, Book b2) that returns true if both books share the same subject/genre. Create arrays of journals and novels in main(), display all, and test compare() on pairs.
 
 
 */

import java.util.*;

public class Book
{
    String title;
    int ISBN;
    Book(String title, int ISBN)
    {
        this.title = title;
        this.ISBN = ISBN;
    }
    void display()
    {
        System.out.println("Title: " + title + "  ISBN: " + ISBN);
    }
}

class Journal extends Book
{
    String subject;
    Journal(String title, int ISBN, string subject)
    {
        super(title, ISBN);
        this.subject = subject;
    }
    boolean compare(Book b1, Book b2)
    {
        Journal j1 = (Journal) b1;
        Journal j2 = (Journal) b2;
        boolean comp = False;
        if j1.subject.equals(j2.subject)
            comp = True;
        return comp;
    }
    void display()
    {
        super.display();
        System.out.println("Subject: " + subject);
    }
}

class Novel extends Book
{
    String genre;
    Novel(String title, int ISBN, string genre)
    {
        super(title, ISBN);
        this.genre = genre;
    }
    boolean compare(Book b1, Book b2)
    {
        Novel n1 = (Novel) b1;
        Novel n2 = (Novel) b2;
        boolean comp = false;
        if n1.genre.equals(n2.genre)
            comp = true;
        return comp;
    }
    void display()
    {
        super.display()
        System.out.println("Genre: " + genre);
    }
}

