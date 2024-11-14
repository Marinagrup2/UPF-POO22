import java.util.LinkedList;

public class Region {

    private String name;
    private LinkedList<City> cityList = new LinkedList<City>();

    public Region (String n){
        cityList = new LinkedList<City>();
        this.name = n;

    }

    public void setCities(LinkedList<City> cList){
        this.cityList = cList;
        
    }

    public LinkedList<City> getCityList() {
        return cityList;
    }

    public String toString() {
        
        return this.name;
    }
    
}
