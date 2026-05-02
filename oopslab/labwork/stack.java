import java.util.*;

interface intstack {
    void push(int val);
    int pop();
}

class stackinterface implements intstack
{
    private int arr[];
    private int tos;

    stackinterface(int n)
    {
        arr = new int[n];
        tos = -1;
    }

    public void push(int val)
    {
        if (tos == arr.length - 1)
            System.out.println("Stack is full.");
        else
            arr[++tos] = val;
    }

    public int pop()
    {
        if (tos < 0)
        {
            System.out.println("Stack underflow.");
            return 0;
        }
        else
            return arr[tos--];
    }
}

public class stack
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int n = sc.nextInt();

        stackinterface s = new stackinterface(n);

        int choice;
        do
        {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    s.push(val);
                    break;

                case 2:
                    int popped = s.pop();
                    if (popped != 0)
                        System.out.println("Popped value: " + popped);
                    break;

                case 3:
                    System.out.println("Exiting.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        while (choice != 3);
    }
}
