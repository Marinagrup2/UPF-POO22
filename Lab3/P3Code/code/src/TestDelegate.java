import java.util.LinkedList;
import java.util.Scanner;

public class TestDelegate {

    static private LinkedList<Region> regionList;
    static private Organization organization;
    static private LinkedList<Delegate> headList;
    static private LinkedList<City> cityList;
    

    public static void main(String stg[]){

        regionList = new LinkedList<Region>();
        headList = new LinkedList<Delegate>();
        cityList = new LinkedList<City>();
        
        organization = new Organization("Organitzacio");
        

        LinkedList<String[]> regions = Utility.readXML("region");
        for(String[]array : regions){
            Region region = new Region(array[0]);
            if(array.length == 3){
                City city = new City(array[1], Integer.parseInt(array[2]));
                cityList.add(city);
            }else{
                for(int i = 1; i < (array.length/2)+1; i++){
                    int medium = array.length/2;
                    City city = new City(array[i], Integer.parseInt(array[medium+i]));
                    cityList.add(city);
                }
            }
            regionList.add(region);

        }

        LinkedList<Headquarter> hlist = new LinkedList<Headquarter>();

        LinkedList<String[]> headquarters = Utility.readXML("headquarter");
        for(String[]array : headquarters){
            Headquarter headquarter = new Headquarter(array[0], array[1], organization);
            LinkedList<City> citylist = new LinkedList<City>();
                for(int i=2; i<(array.length); i++){
                    citylist = regionList.get(i).getCityList();
                    City city = Utility.getObject(array[i], cityList);
                    citylist.add(city);
                    city.addHeadquarter(headquarter);
                }

            headquarter.setCityList(citylist);
            hlist.add(headquarter);
            }

        LinkedList<Delegate> delegateList = new LinkedList<Delegate>();
        LinkedList<Regular> regularList = new LinkedList<Regular>();

        LinkedList<String[]> heads = Utility.readXML("head");
        for(String[]array : heads){
                Headquarter headquarter = Utility.getObject(array[3], hlist);
                Delegate delegate = new Delegate(array[0], Integer.parseInt(array[1]), array[2], headquarter);
                headList.add(delegate);
                headquarter.setHead(delegate);

                Regular regular = new Regular(array[0], Integer.parseInt(array[1]), array[2], headquarter, delegate);

                String[] array_days = array[4].split("\\.");
                String[] array_hours = array[5].split("\\.");

                LinkedList<String> days = new LinkedList<String>();
                int a = array_days.length;
                int b = array_hours.length;
                for(int i = 0; i < a; i++){
                    
                    days.add(array_days[i]);

                }
                LinkedList<Integer> hours = new LinkedList<Integer>();
                for(int j = 0; j < b; j++){
                    hours.add(Integer.parseInt(array_hours[j]));

                }

                
                Availability availability = new Availability(days, hours);
                delegate.setAvailability(availability);
                delegate.setHeadOf(headquarter);
                headquarter.setHead(delegate);
                delegateList.add(delegate);
                regularList.add(regular);
                
        }

        for(int k = 0; k<hlist.size(); k++){
            System.out.println("El head delegate "+ organization.getMembershqlist(hlist.get(k)) +" del headquarter "+ hlist.get(k));
        }


        QRLib qr = new QRLib();
        Image i = null;
        Delegate delegate  = Utility.getObject(String.valueOf(organization.getMembershqlist(hlist.get(5))), delegateList);
        Delegate dele = new Delegate("Mar Moreno", 123444, "mar@gmail.com", hlist.get(0));
        Regular regular = new Regular("Mar Moreno", 564748, "mar@gmail", hlist.get(1), hlist.get(1).getHead());
        i = delegate.genRegularQR(qr);
        Image i2 = delegate.genDelegateQR(qr);
        delegate.singUpDelegate(dele, qr, i2);
        delegate.singUpRegular(regular, qr, i);
        i.save();
        i2.save();

        

        
        


        
        

        

            
    }

    




        
        


        

}

