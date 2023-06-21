package Day17;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentHashmap {
    public static void main(String[] args){
        HashMap<String, String> Student =new HashMap<String, String>();
        Student.put("firstname","krupa");
        Student.put("lastname","Reddy");
        Student.put("GPA","3.6");
        System.out.println("Hashmap"+Student);
        System.out.println("Entry set");
        System.out.println(Student.entrySet());
        System.out.println("forEach");
        Student.forEach((k, v) -> System.out.println("Key "+k+" "+"Value "+v));
        System.out.println("Keyset");
        for(String i:Student.keySet()){
            System.out.println(i);}
        System.out.println("Iterator");
        Iterator<String> newstudent = Student.keySet().iterator();
        while (newstudent.hasNext())
        {
            String key = newstudent.next();
            String value = Student.get(key);

            System.out.println(key + "=" + value);
        }



    }
}
