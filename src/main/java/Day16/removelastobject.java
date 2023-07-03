package Day16;

import java.util.ArrayList;

public class removelastobject {
    public static void main(String[] args) {
        ArrayList<String> place = new ArrayList<String>();

        place.add("Denton");
        place.add("Frisco");
        place.add("Mckinney");
        place.add("Irving");
        if (place.size() > 0) {
            place.remove(place.size() - 1);
        }
        System.out.println(place);
    }
}
