package Day0405;
class class1 {
    protected int Var1;
    public class1(int variable1){
        this.Var1 = variable1;
    }
}

class class2 extends class1 {
    protected int Var2;
    public class2(int variable1,int variable2){
        super(variable1);
        this.Var2 = variable2;
    }
   public class2(int variable2){
        super(0);
       this.Var2 = variable2;
   }
}
public class Question2 {
    public static void main(String[] args){
        class1 parent = new class1(10);
        System.out.println("Parent Variable is "+parent.Var1);
        class2 child1 = new class2(20,19);
        System.out.println("Child1 variables are" +child1.Var1+" "+child1.Var2);
        class2 child2 = new class2(10);
        System.out.println("Child1 variables are" +child2.Var1+" "+child2.Var2);


    }
}
