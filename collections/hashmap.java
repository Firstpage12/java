import java.util.HashMap;
import java.util.*;

public class hashmap {

    public static void main(String[] args){
        //country(key) , population(value)
        HashMap<String,Integer> countryInfo = new HashMap<>();

        //Insertion
        countryInfo.put("India",120);
        countryInfo.put("US",30);
        countryInfo.put("China",150);

        System.out.println(countryInfo);

        countryInfo.put("China",180);//VALUE UPDATED

        //Search

        if(countryInfo.containsKey("China")){
            System.out.println("key is present in the map");
        }
        else{
            System.out.println("key is not present");
        }

        System.out.println(countryInfo.get("China"));//key exists
        System.out.println(countryInfo.get("UK"));//KEY NOT EXISTS

        //Iteration
        for(Map.Entry<String,Integer> e: countryInfo.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }
        //only for keys
        Set<String> keys =countryInfo.keySet();
        for(String key:keys){
            System.out.println(key+" "+countryInfo.get(key));
        }

        countryInfo.remove("China");
        System.out.println(countryInfo);









    }




}
