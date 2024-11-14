public class Member {

    //leer heads.xml

    private String name;
    private int phone;
    private String email;
    private Availability availability;
    private Headquarter headquarter;

    public Member(String n, int p, String e, Headquarter h){
        this.name = n;
        this.phone = p;
        this.email = e;
        this.headquarter = h; 
    }

    public void setAvailability(Availability a){
        this.availability = a;

    }

    public Headquarter getHeadquarter(){
        return headquarter;
    }


    public String toString() {
        return this.name;
    }

    public String getName(){
        return this.name;
    }

    
    
}
