package Day0405;
// First Interface
interface A {
    void M1();
}

// Second Interface
interface B {
    void M2();
}

// Class implementing both interfaces
class Test implements A, B {
    @Override
    public void M1() {
        System.out.println("Hello");
    }

    @Override
    public void M2() {
        System.out.println("Welcome");
    }
}
public class Question1 {
    public static void main(String[] args) {
        Test test = new Test();
        test.M1();
        test.M2();
    }
}
