/*
 Create a class Movie with data members mov_id (short), screen_num (short), pdate (String), and ptime (float). Provide a parameterised constructor and display() method. Write checkSchedule(Movie[] m) that throws a user-defined ScreeningException if any two movies are on the same date, same screen, and within 3 hours of each other. Message format: 'Schedules of movies with Ids 10 and 40 are conflicting'. Handle in main().
 */
public class ScreeningException extends Exception
{
    ScreeningException(String message)
    {
        super(message);
    }
}

public class movie
{
    short mov_id;
    short screen_num;
    String pdate;
    float ptime;
    
    movie(short mov_id, short screen_num, String pdate, float ptime)
    {
        this.mov_id = mov_id;
        this. screen_num = screen_num;
        this.pdate = pdate;
        this.ptime = ptime;
    }
    public void display()
    {
        System.out.println("Movie ID: "+mov_id);
        System.out.println("Screen number: "+screen_num);
        System.out.println("Screening date: "+pdate);
        System.out.println("Screening time: "+ptime);
    }
    public void checkSchedule(movie[] m) throws ScreeningException
    {
        for (int i =0; i<m.length; i++)
        {
            for(int j=0; i<m.length; j++)
            {
                if(m[i].pdate.equals(m[j].pdate) && m[i].screen_num == m[j].screen_num && Math.abs(m[i].ptime - m[j].ptime)<3)
                {
                    throw new ScreeningException("Schedules of movies with IDs: "+m[i].ptime+" and   "+m[j].ptime+" are conflicting");
                }
            }
        }
    }
}


