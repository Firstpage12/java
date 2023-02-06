import java.util.HashSet;
import java.util.Iterator;
public class hashset {

    public static void main(String args[]){
        HashSet<Integer> set =new HashSet<>();

        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);

        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        set.remove(1);
        System.out.println(set);

        int len =set.size();
        System.out.println(len);

        //iterator

        Iterator it =set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());

        }





    }
}
