import java.time.LocalDateTime;
import java.util.Date;
import java.util.LinkedList;

public class Action {

    private String purpose;
    private Date start;
    private int duration;
    private LinkedList<InfoAction> infoactList;

    public Action(String p, LocalDateTime s, int d){
        this.purpose = p;
        //this.start = s;
        this.duration = d;
    }

    public Headquarter addHeadquarter(Headquarter headquarter){
        return headquarter;
    }

    

    

}
