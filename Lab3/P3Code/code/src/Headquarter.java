import java.time.LocalDateTime;
import java.util.LinkedList;



public class Headquarter {

    //leer fixero

    private String name;
    private String email;
    private LinkedList<Member> memberList;
    private Delegate head;
    private LinkedList<InfoAction> infoactionList;
    private Organization organization;
    private LinkedList<City> cityList;

    public Headquarter(String n, String e, Organization o){
        this.name = n;
        this.email = e;
        this.organization = o;
        memberList = new LinkedList<Member>();
        cityList = new LinkedList<City>();
    }

    public void addMember(Member m){
        memberList.add(m);
    }

    public Organization getOrganization(){
        return organization;
    }
    public void setHead(Delegate head) {
        this.head = head;
    }

    public Delegate getHead() {
        return head;
    }

    public void setCityList(LinkedList<City> cityList) {
        this.cityList = cityList;
    }

    public String toString(){
        return this.name;
    }
    





    
}
