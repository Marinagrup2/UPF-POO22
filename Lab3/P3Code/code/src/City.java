import java.util.LinkedList;

public class City {

    private String name;
    private int population;
    private LinkedList<Headquarter> headquarterList;

    public City(String n, int p){
        headquarterList = new LinkedList<Headquarter>(); 
        this.name = n;
        this.population = p;
    }

    public void addHeadquarter(Headquarter headquarter){
        headquarterList.add(headquarter);
    }

    public String toString(){
        return this.name;
    }

}
