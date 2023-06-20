package Day16;
import java.util.ArrayList;
import java.util.Iterator;
public class ConverTArrayListtoArray {
    public static void main(String[] args) {
        ArrayList<String> place = new ArrayList<String>();

        place.add("Denton");
        place.add("Frisco");
        place.add("Mckinney");
        place.add("Irving");
        System.out.println("ArrayList:");
        for (int i = 0; i < place.size(); i++) {
            System.out.println(place.get(i));
        }

        String[] Array = place.toArray(new String[0]);
        System.out.println("Array:");
        for (String s : Array) {
            System.out.println(s);
        }
    }
}
