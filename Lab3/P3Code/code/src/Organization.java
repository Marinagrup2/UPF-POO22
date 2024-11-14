import java.util.LinkedList;

public class Organization {

    private String name;
    private LinkedList<Headquarter> hList;
    private LinkedList<Action> aList;
    

    public Organization(String name){
        this.name = name;
        hList = new LinkedList<Headquarter>();
        aList = new LinkedList<Action>();
        
    }

    public void setPlace(LinkedList<Headquarter> hList){
        this.hList = hList;
    }

    public Delegate getMembershqlist(Headquarter headquarter){
        return headquarter.getHead();
    }

    public String toString() {
        return this.name;
    }



}
