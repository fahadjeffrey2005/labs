import java.util.*;

public class bookDemo
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of books: ");
        int n = sc.nextInt();
        sc.nextLine();
        Book[] b = new Book[n];
        for (int i =0; i<n; i++)
        {
            System.out.println("Book "+(i+1)+": ");
            System.out.println("Is the book a Journal or Novel or neither? (J/N/X): ")
            System.out.println("Name: ");
            String name = sc.nextLine();
            
            System.out.println("ISBN: ");
            int ISBN = sc.nextInt();
            
            char op = sc.next().charAt(0);
            sc.nextLine();
            switch (op)
            {
                case 'J':
                {
                    System.out.println("Subject: ");
                    String sub= sc.nextLine();
                    b[i] = new Journal(name, ISBN, sub);
                    break;
                }
                case 'N':
                {
                    System.out.println("Genre: ");
                    String sub= sc.nextLine();
                    b[i] = new Novel(name, ISBN, genre);
                    break;
                }
                case 'X':
                {
                    b[i] = new Book(name, ISBN);
                    break;
                }
                default:
                {
                    System.out.println("Invalid input.");
                    i--;
                    break;
                }
            }
        }
        System.out.println(" All Books ");
        for (int i = 0; i < n; i++)
        {
            b[i].display();
            System.out.println("---");
        }
        
        
        
        System.out.println("Journal Comparisons");
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (b[i] instanceof Journal && b[j] instanceof Journal)
                {
                    System.out.println("\"" + b[i].title + "\" vs \"" + b[j].title +
                        "\" - same subject: " + ((Journal)b[i]).compare(b[i], b[j]));
                }
            }
        }

        
    }
}
