import java.util.LinkedList;

public class Availability {

    private LinkedList<String> days;
    private LinkedList<Integer> hours;

    public Availability(LinkedList<String> days, LinkedList<Integer> hours ){
        days = new LinkedList<String>();
        hours = new LinkedList<Integer>();
        this.days = days;
        this.hours = hours;
    }
    
}
