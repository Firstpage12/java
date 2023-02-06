import java.util.*;


public class arraylist {
    public static void main(String args[]){
        ArrayList<Integer> list =new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);

        System.out.println(list);

        int element=list.get(2);
        System.out.println(element);

        list.add(1,3);
        System.out.println(list);

        list.set(0,5);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        int len=list.size();
        System.out.println(len);

        for(int i=0;i<len;i++){
            System.out.println(list.get(i));
        }

        Collections.sort(list);
        System.out.println(list);



    }

}
