import java.io.*;
import java.util.Hashtable;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Pizza
{
    Hashtable<String, Order> orders = new Hashtable<String, Order>();
    PriorityQueue<Event> events = new PriorityQueue<Event>();
    public static void main(String args[]) throws FileNotFoundException
    {
        File file = new File(args[0]);
        Scanner s = new Scanner(file);
        while(s.hasNext())
        {    
            String [] request = s.nextLine().split(" ");
            
        }    
    }        
    private class Order
    {
        int timeOrdered, timeDelivered;
        String details;
        public Order(int tO, int tD, String details)
        {
            timeOrdered = tO;
            timeDelivered = tD;
            this.details = details;
        }        
        public String toString()
        {
            return timeOrdered + ", " + timeDelivered + ", " + details;
        }        
    }
    private class Event implements Comparable<Event>
    {
        int time;
        String eventType, person, details;
        public int compareTo(Event that)
        {
            if(this.time < that.time)
                return this.time;
            return that.time;
        } 
    }
}
