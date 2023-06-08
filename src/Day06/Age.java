package Day06;

public class Age {
    public void age(int age) {
        if(age>=13 && age<=19)
        {
            System.out.println("Teen");
        }
        else if(age<13)
        {
            System.out.println("Kid");
        }
        else if(age>19)
        {
            System.out.println("Adult");
        }
    }

    public static void main(String[]args)
    {
        Age age=new Age();
        age.age(10);

    }
}
