package Day0405;

public class Question3 {
    public static void main(String[] args)
    {
        int SV = test.getStaticVariable();
        System.out.println(SV);
    }
    }
class test {
    static int staticVariable;


    static {
        staticVariable = initializeStaticVariable();
    }

    public static int getStaticVariable() {
        return staticVariable;
    }

    private static int initializeStaticVariable() {
        return 46;
    }
}


