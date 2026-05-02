import java.util.*;

public class Die
{
    int sideUp;
    public int getSideUp()
    {
        return sideUp;
    }
    public int roll()
    {
        sideUp = (int)(Math.random() * 6) + 1;
        return sideUp;
    }
}
