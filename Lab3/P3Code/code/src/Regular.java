import java.util.LinkedList;

public class Regular extends Member{

    private Delegate responsable;
    private LinkedList<Vehicle> vList;

    public Regular(String n, int p, String e, Headquarter h, Delegate r){
        super(n,p,e,h);
        this.responsable = r;
        vList = new LinkedList<Vehicle>();

    }

    public void addVehicle(Vehicle v){
        vList.add(v);
    }
    
    public boolean participate(Action a){
        return true;
    }

    
    public String toString() {
        return super.toString();
    }

    
}
