/*
 
 Create a class Counter with a static data member that counts how many Counter objects have been created. Increment it in the constructor. Add a static method showCount() that displays the current count. In main(), create several objects at different points and call showCount() between them to observe the count changing.
 
 */
class Counter
{
    static int count;
    static void showCount()
    {
        System.out.println("Number of constructors created: "+count);
    }
    Counter()
    {
        count++;
    }
}
