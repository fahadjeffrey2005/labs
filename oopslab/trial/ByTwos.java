/**
 
 Design an interface called Series with the following methods
 i) getNext (returns the next number in series)
 ii) reset(to restart the series)
 iii) setStart (to set the value from which the series should start)
 Design a class named ByTwos that implements Series such that it generates a series
 of numbers, each two greater than the previous one. Also design a class which will
 include the main method for referencing the interface.
 
 */

import java.util.*;

interface Series
{
    int getNext();
    void reset();
    void setStart();
}

class ByTwos implements Series
{
    Scanner sc = new Scanner(System.in);
    int x;
    ByTwos(int x)
    {
        this.x = x;
    }
    void setStart()
    {
        
    }
    int getNext()
    {
        x += 2;
        return x;
    }
    void reset()
    {
        System.out.println("-----------------");
        x=0;
    }
}
