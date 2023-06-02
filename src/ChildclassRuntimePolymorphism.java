public class ChildclassRuntimePolymorphism extends ParentclassRuntimePolymorphism{

    @Override
    public int addition(int a, int b){
        return super.addition(a,b);
    }
    public static void main(String[] args){
        ParentclassRuntimePolymorphism abc = new ParentclassRuntimePolymorphism();
        int x = abc.addition(5,10);
        ChildclassRuntimePolymorphism abc1 = new ChildclassRuntimePolymorphism();
        int y = abc1.addition(6,6);
        System.out.println(x + " " +y);
    }
}
