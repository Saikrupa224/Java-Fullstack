public class Person {
    int age;
    int weight;
    float height;

    double calculateBMI(){
        return weight/(height*height);
    }
    void walk()
    {
        System.out.println("Person is walking");
    }

}
