package Day16;

import java.util.ArrayList;
import java.util.Iterator;
public class traverseelements {
    public static void main(String[] args){
        ArrayList<String> place = new ArrayList<String>();

       place.add("Denton");
       place.add("Frisco");
       place.add("Mckinney");
       place.add("Irving");

        System.out.println("For Loop:");
        for(int i=0;i<place.size();i++)
       {
           System.out.println(place.get(i));
       }

        System.out.println(" Enhanced For Loop:");
       for(String a:place)
       {
           System.out.println(a);
       }

        System.out.println(" Iterator:");
       Iterator <String> iterator = place.iterator();
       while(iterator.hasNext()){
           System.out.println(iterator.next());
       }

        System.out.println(" For Each:");
       place.forEach(a ->System.out.println(a));

        System.out.println("Parallel Stream:");
        place.parallelStream().forEach(places ->
                System.out.println(places)
        );
    }
}
